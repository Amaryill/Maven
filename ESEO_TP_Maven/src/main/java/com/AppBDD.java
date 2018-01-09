package com;

import java.sql.SQLException;

public class AppBDD {
	public static void main (String[] args) throws SQLException{
		String laposte_hexasmal = "C:/Users/Amaryill-Labtop/git/Maven/ESEO_TP_Maven/laposte_hexasmal.csv";
		int codeInsee = 10227;
		MavenBO bo = new MavenBO();
		bo.importData(laposte_hexasmal);
//		bo.updateData(codeInsee);
//		bo.checkBase();
	}
}
