package com.alex.robot.monnaieparisrobot.services;

import com.alex.robot.monnaieparisrobot.model.PieceSortie;

public interface PieceSortieRepositoryCustom {

	PieceSortie findPieceByName(PieceSortie toFind);
	
	void save(PieceSortie toSave);
	
	int getNbPieces();


}