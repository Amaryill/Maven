package bo;

import model.Villes;

import java.sql.SQLException;
import java.util.List;


public interface VillesBO {
	public List<Villes> trouverVilles() throws SQLException;
}
