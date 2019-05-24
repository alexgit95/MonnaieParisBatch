package com.alex.robot.monnaieparisrobot.services;

import java.io.FileNotFoundException;

import com.alex.robot.monnaieparisrobot.model.Datum;
import com.alex.robot.monnaieparisrobot.model.Piece;
import com.alex.robot.monnaieparisrobot.model.PieceSortie;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public interface PieceServices {

	/**
	 * Creer un piece si elle n'existe pas dans la base
	 * @param toCreate
	 * @return
	 */
	boolean creerPiece(PieceSortie toCreate);
	/**
	 * Recupere le nombre de piece totale existante
	 * @return
	 */
	int getNbPieces();
	/**
	 * Extrait les données depuis le site web ou par defaut depuis le fichier static fournit par l'appli
	 * @return
	 * @throws JsonSyntaxException
	 * @throws JsonIOException
	 * @throws FileNotFoundException
	 */
	Piece recuperationDesDatas() throws JsonSyntaxException, JsonIOException, FileNotFoundException;
	/**
	 * Creer un Objet PieceSortie a partie d'un Objet Dataum
	 * @param data
	 * @return
	 */
	PieceSortie getInfosPiece(Datum data);
	
}
