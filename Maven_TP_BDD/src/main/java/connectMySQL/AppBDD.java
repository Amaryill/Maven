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
		String laposte_hexasmal = "C:/Users/Amaryill-Labtop/git/Maven/Maven_TP_BDD/laposte_hexasmal.csv";
		int codeInsee = 1001;
		MavenBO bo = new MavenBO();
		bo.importData(laposte_hexasmal);
		bo.updateData(codeInsee);
		bo.checkBase();
	}
	
	
	
}
