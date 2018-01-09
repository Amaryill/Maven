package com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MavenBO {

	public void importData(String filename)
	{
		Connection conn = JDBCConfigurationSol2.getConnection();
		Statement stmt;
		String query;
		String query2;
		String query3;
		try
		{	
			stmt = conn.createStatement();
			query3 = "DROP TABLE IF EXISTS laposte";
			stmt.executeUpdate(query3);
			query2 = "CREATE TABLE laposte(Code_commune_INSEE INT PRIMARY KEY NOT NULL,"
					+ "Nom_commune VARCHAR(100),"
					+ "Code_postal INT,"
					+ "Libelle_acheminement VARCHAR(100),"
					+ "Ligne_5 VARCHAR(100),"
					+ "coordonnees_gps INT,"
					+ "blank INT)";
			stmt.executeUpdate(query2);
			query = "LOAD DATA LOCAL INFILE '"+filename+"'"
					+ " INTO TABLE laposte"
					+ " FIELDS TERMINATED BY ',' ENCLOSED BY '\"'" 
					+ " LINES TERMINATED BY '\n'"
					+ " IGNORE 1 ROWS";
			stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			stmt = null;
		}
	}

	public void updateData (int codeInsee) throws SQLException{

		Connection sqlConnection = JDBCConfigurationSol2.getConnection();
		String nom_commune = null;
		int code_postal = 0;
		String libelle_acheminement= null;
		String ligne_5= null;
		int coordonnees_gps = 0;
		int blank = 0;

		try
		{
			// create our java preparedstatement using a sql update query
			PreparedStatement ps = sqlConnection.prepareStatement(
					"UPDATE laposte SET Nom_commune_INSEE = ?, Code_postal = ?,"
							+ " Libelle_acheminement = ?, Ligne_5 = ?, coordonnees_gps = ?, blank=? WHERE Code_Commune_Insee =" + codeInsee);

			// set the preparedstatement parameters
			ps.setString(1,nom_commune);
			ps.setInt(2,code_postal);
			ps.setString(3,libelle_acheminement);
			ps.setString(4,ligne_5);
			ps.setInt(5, coordonnees_gps);
			ps.setInt(6, blank);

			// call executeUpdate to execute our sql update statement
			ps.executeUpdate();
			ps.close();
		}
		catch (SQLException se)
		{
			// log the exception
			throw se;
		}
	}
	
	public void checkBase() throws SQLException {

		Connection sqlConnection = JDBCConfigurationSol2.getConnection();
		Statement stmt;
		String query;
		String query2;
		try
		{
			stmt = sqlConnection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			query = "ALTER TABLE laposte" + 
					"ADD PRIMARY KEY (ID); ";
			stmt.executeUpdate(query);
			query2 = "delete from laposte T1 " + 
					"where PRIMARY KEY (ID) not in (select min(ID) " + 
					"from laposte T2 where T1.Nom_commune=T2.Nom_commune" +
					"AND T1.Code_postal=T2.Code_postal" +
					"AND T1.Ligne_5=T2.Ligne_5" +
					"AND T1.Libelle_acheminement=T2.Libelle_acheminement" +
					"AND T1.coordonnees_gps=T2.coordonnees_gps";
			
			stmt.executeUpdate(query2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			stmt = null;
		}
	}
}
