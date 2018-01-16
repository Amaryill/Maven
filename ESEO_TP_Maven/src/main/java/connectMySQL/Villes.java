package connectMySQL;

import java.sql.Connection;

public class Villes {

	public String nom_commune;
	public String code_postal;
	public String libelle_acheminement;
	public String ligne_5;
	Coordonnees coordonnees;
	
	
	public Villes(String nom_commune, String code_postal, String libelle_acheminement, String ligne_5,
			Coordonnees coordonnees) {
		super();
		this.nom_commune = nom_commune;
		this.code_postal = code_postal;
		this.libelle_acheminement = libelle_acheminement;
		this.ligne_5 = ligne_5;
		this.coordonnees = coordonnees;
	}


	public String getNom_commune() {
		return nom_commune;
	}


	public void setNom_commune(String nom_commune) {
		this.nom_commune = nom_commune;
	}


	public String getCode_postal() {
		return code_postal;
	}


	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}


	public String getLibelle_acheminement() {
		return libelle_acheminement;
	}


	public void setLibelle_acheminement(String libelle_acheminement) {
		this.libelle_acheminement = libelle_acheminement;
	}


	public String getLigne_5() {
		return ligne_5;
	}


	public void setLigne_5(String ligne_5) {
		this.ligne_5 = ligne_5;
	}


	public Coordonnees getCoordonnees() {
		return coordonnees;
	}


	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}


	
	
}