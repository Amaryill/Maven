package connectMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bo.MavenBO;
import bo.VillesBO;
import bo.VillesBOImpl;
import model.Villes;

public class AppBDD {
	public static void main (String[] args) throws SQLException{
		String laposte_hexasmal = "C:/Users/Amaryill-Labtop/git/Maven/ESEO_TP_Maven/laposte_hexasmal.csv";
		int codeInsee = 10227;
		MavenBO bo = new MavenBO();
		bo.importData(laposte_hexasmal);
		VillesBO bo1 = new VillesBOImpl();
		List<Villes> ville = bo1.trouverVilles();
//		bo.updateData(codeInsee);
//		bo.checkBase();
	}
	
	
	
}
