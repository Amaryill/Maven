package bo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectMySQL.JDBCConfigurationSol2;
import dao.VillesDAO;
import model.Coordonnees;
import model.Villes;

public class VillesBOImpl implements VillesBO{

	private VillesDAO dao;
	
	public VillesBOImpl(){
		this.dao = new VillesDAO();
	}
	

	@Override
	public List<Villes> trouverVilles() throws SQLException {
		// TODO Auto-generated method stub
		return this.dao.trouverVilles();
	}
	
	

}
