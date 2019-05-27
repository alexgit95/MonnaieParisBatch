package com.alex.robot.monnaieparisrobot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PiecesMonnaieParis")
public class PieceSortie {
	@Id
	private String idPiece;
	
	private String nom;
	
	private String ville;
	
	private boolean isPossede;
	
	private double longitude;
	
	private double lattitude;
	
	private double valeur;

	private String departement;
	
	private Date dateAcquisition;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public boolean isPossede() {
		return isPossede;
	}

	public void setPossede(boolean isPossede) {
		this.isPossede = isPossede;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public PieceSortie(String nom, String ville, boolean isPossede, double longitude, double lattitude, double valeur,
			String departement) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.isPossede = isPossede;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.valeur = valeur;
		this.departement = departement;
	}

	public Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public PieceSortie(String nom, String ville, boolean isPossede, double longitude, double lattitude, double valeur,
			String departement, Date dateAcquisition) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.isPossede = isPossede;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.valeur = valeur;
		this.departement = departement;
		this.dateAcquisition = dateAcquisition;
	}

	
	

	

	

	public PieceSortie(String idPiece, String nom, String ville, boolean isPossede, double longitude, double lattitude,
			double valeur, String departement, Date dateAcquisition) {
		super();
		this.idPiece = idPiece;
		this.nom = nom;
		this.ville = ville;
		this.isPossede = isPossede;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.valeur = valeur;
		this.departement = departement;
		this.dateAcquisition = dateAcquisition;
	}

	public String getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(String idPiece) {
		this.idPiece = idPiece;
	}

	public PieceSortie() {
		super();
	}

	@Override
	public String toString() {
		return "PieceSortie [idPiece=" + idPiece + ", nom=" + nom + ", ville=" + ville + ", isPossede=" + isPossede
				+ ", longitude=" + longitude + ", lattitude=" + lattitude + ", valeur=" + valeur + ", departement="
				+ departement + ", dateAcquisition=" + dateAcquisition + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
