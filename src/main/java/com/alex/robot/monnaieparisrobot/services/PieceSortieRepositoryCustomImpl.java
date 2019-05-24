package com.alex.robot.monnaieparisrobot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.alex.robot.monnaieparisrobot.model.PieceSortie;


@Component
public class PieceSortieRepositoryCustomImpl implements PieceSortieRepositoryCustom {
	
	private MongoTemplate mongoTemplate;
	
	

	@Override
	public PieceSortie findPieceByName(PieceSortie toFind) {
		Query query = new Query(Criteria.where("nom").is(toFind.getNom()));
		return mongoTemplate.findOne(query, PieceSortie.class);
	}



	@Override
	public void save(PieceSortie toSave) {
		mongoTemplate.save(toSave);
		
	}

	@Override
	public int getNbPieces() {
		return mongoTemplate.findAll(PieceSortie.class).size();
	}
	
	
	@Autowired
	public PieceSortieRepositoryCustomImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}







	
	
	
	

}
