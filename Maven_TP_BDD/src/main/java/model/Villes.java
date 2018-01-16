package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectMySQL.JDBCConfigurationSol2;

public class Villes {

	public int code_commune_INSEE;
	public String nom_commune;
	public int code_postal;
	public String libelle_acheminement;
	public String ligne_5;
	Coordonnees coordonnees;
	
	
	public Villes(int code_commune_INSEE, String nom_commune, int code_postal, String libelle_acheminement, String ligne_5,
			Coordonnees coordonnees) {
		super();
		this.code_commune_INSEE=code_commune_INSEE;
		this.nom_commune = nom_commune;
		this.code_postal = code_postal;
		this.libelle_acheminement = libelle_acheminement;
		this.ligne_5 = ligne_5;
		this.coordonnees = coordonnees;
	}

	public int getCodeCommuneINSEE(){
		return code_commune_INSEE;
	}
	
	public void setCodeCommune(int code_commune_INSEE){
		this.code_commune_INSEE=code_commune_INSEE;
	}
	
	public String getNom_commune() {
		return nom_commune;
	}


	public void setNom_commune(String nom_commune) {
		this.nom_commune = nom_commune;
	}


	public int getCode_postal() {
		return code_postal;
	}


	public void setCode_postal(int code_postal) {
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