package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectMySQL.JDBCConfigurationSol2;
import model.Coordonnees;
import model.Villes;

public class VillesDAO {

	Connection conn = JDBCConfigurationSol2.getConnection();
	
	public List<Villes> trouverVilles() throws SQLException {
		List<Villes> listeVilles = new ArrayList<Villes>();
		int nombreVilles=0;
		Statement stmt;
		String query= "Select * from laposte";
		stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			Coordonnees coord = new Coordonnees();
			int codeINSEE = result.getInt("Code_commune_INSEE");
			String nom = result.getString("Nom_commune");
			int codePostal = result.getInt("Code_postal");
			String libelle = result.getString("Libelle_acheminement");
			String ligne5 = result.getString("Ligne_5");
			coord.setLongitude(result.getFloat("coordonnees_gps"));
			coord.SetLatitude(result.getFloat("blank"));

			Villes ville =new Villes(codeINSEE, nom, codePostal, libelle, ligne5, coord);
			listeVilles.add(ville);		
		     
		}
		result.close();
		stmt.close();
		return listeVilles;
	}
	
	public Villes trouverVille(int code_INSEE) throws SQLException {
		int nombreVilles=0;
		Villes ville = null;
		Statement stmt;
		String query= "Select * from laposte where Code_commune_INSEE="+code_INSEE;
		stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			Coordonnees coord = new Coordonnees();
			int codeINSEE = result.getInt("Code_commune_INSEE");
			String nom = result.getString("Nom_commune");
			int codePostal = result.getInt("Code_postal");
			String libelle = result.getString("Libelle_acheminement");
			String ligne5 = result.getString("Ligne_5");
			coord.setLongitude(result.getFloat("coordonnees_gps"));
			coord.SetLatitude(result.getFloat("blank"));

			ville = new Villes(codeINSEE, nom, codePostal, libelle, ligne5, coord);
		     
		}
		result.close();
		stmt.close();
		
		return ville;
	}
}
