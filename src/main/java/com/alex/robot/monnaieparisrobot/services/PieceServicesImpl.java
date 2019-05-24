package com.alex.robot.monnaieparisrobot.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.robot.monnaieparisrobot.model.Datum;
import com.alex.robot.monnaieparisrobot.model.Piece;
import com.alex.robot.monnaieparisrobot.model.PieceSortie;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
@Service
public class PieceServicesImpl implements PieceServices {
	
	private PieceSortieRepositoryCustom pieceSortieRepo;

	@Override
	public boolean creerPiece(PieceSortie toCreate) {
		boolean isCreated=false;
		PieceSortie findOne = pieceSortieRepo.findPieceByName(toCreate);
		if(findOne==null) {
			pieceSortieRepo.save(toCreate);
			isCreated=true;
		}
		return isCreated;

	}
	
	public Piece recuperationDesDatas() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		RetryConfig config = RetryConfig.custom()
				.intervalFunction((attempt)-> {return attempt *1000L;}) 
				.maxAttempts(1).build();
		RetryRegistry registry = RetryRegistry.of(config);
		Retry retry = registry.retry("my-retries");
		
		Function<String, String> func = (url) -> {
			System.out.println("GET : "+url);
			try {
					return getHTML(url);
				} catch (Exception e) {
					throw new IllegalStateException(e);
				}
		};
		
		Function<String,String> decorated = Retry.decorateFunction(retry, func);
		
		Gson gson = new Gson();
		try {
			String apply = decorated.apply("http://localhost:8055/data.js");
			//String apply = decorated.apply("https://collection-jetons-touristiques.com/coinlist-data.php");
			return gson.fromJson(apply, Piece.class);
		}catch(Exception e) {
			System.out.println("Fin des rejeux et toujours ko, recuperation depuis le fichier local : "+e.getMessage());
			InputStream resourceAsStream = getClass().getResourceAsStream("/data2.js");
			 String collect = new BufferedReader(new InputStreamReader(resourceAsStream, Charset.forName("ISO-8859-1")))
			  .lines().collect(Collectors.joining("\n"));
			return gson.fromJson(collect.replaceAll("\\n", " "), Piece.class);
		}


	}
	
	private String getHTML(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      System.out.println(conn.getResponseCode());
	      if(conn.getResponseCode()!=200) {
	    	  throw new IllegalAccessError("Code HTTP : "+conn.getResponseCode());
	      }
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }
	
	

	
	public PieceSortie getInfosPiece(Datum data) {
		return new PieceSortie(data.getVcolCoinlist().getJetnom(), data.getVcolCoinlist().getSitville(), false, 0.0, 0.0, Double.valueOf(data.getVcolCoinlist().getJetrvrargus()),"");
	}
	
	@Override
	public int getNbPieces() {
		return pieceSortieRepo.getNbPieces();
	}

	@Autowired
	public void setPieceSortieRepo(PieceSortieRepositoryCustom pieceSortieRepo) {
		this.pieceSortieRepo = pieceSortieRepo;
	}



}
