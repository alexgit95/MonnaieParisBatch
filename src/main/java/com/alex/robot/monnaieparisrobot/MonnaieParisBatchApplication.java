package com.alex.robot.monnaieparisrobot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alex.robot.monnaieparisrobot.model.Datum;
import com.alex.robot.monnaieparisrobot.model.Piece;
import com.alex.robot.monnaieparisrobot.model.PieceSortie;
import com.alex.robot.monnaieparisrobot.services.PieceServices;


@SpringBootApplication
public class MonnaieParisBatchApplication implements CommandLineRunner{
	
	private PieceServices pieceServices;
	

	public static void main(String[] args)  {
		SpringApplication.run(MonnaieParisBatchApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		//la ressource a ete trouve ici https://collection-jetons-touristiques.com/?m=coinlist :
		//https://collection-jetons-touristiques.com/coinlist-data.php?_=1558604462630
		
		Piece pieceIn = pieceServices.recuperationDesDatas();
		List<Datum> datas = pieceIn.getData();
		List<Datum> collect = datas.stream().distinct().collect(Collectors.toList());
		collect.forEach(data->data.getVcolCoinlist().setJetnom(data.getVcolCoinlist().getJetnom().replaceAll("\\r\\n", " ")));
		List<PieceSortie> allPieces = new ArrayList<PieceSortie>();
		
		int compteurNouvellesPieces=0;
		
		for (Datum pieceSortie : collect) {
			PieceSortie infosPiece = pieceServices.getInfosPiece(pieceSortie);
			infosPiece.setIdPiece(UUID.randomUUID().toString());
			allPieces.add(infosPiece);
			if(pieceServices.creerPiece(infosPiece)) {
				compteurNouvellesPieces++;
			}
		}
		int size = pieceServices.getNbPieces();
		System.out.println("Il y a "+size+" pieces existantes dans la collection, dont "+compteurNouvellesPieces+" nouvelles");
		
    }
	
	
	@Autowired
	public void setPieceServices(PieceServices pieceServices) {
		this.pieceServices = pieceServices;
	}

}
