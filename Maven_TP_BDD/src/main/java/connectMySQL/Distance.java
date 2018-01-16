package connectMySQL;

import model.Villes;

public class Distance {
	
	
	public Distance(Villes src, Villes dst) {
		
		double longitudeSrc = src.getCoordonnees().getLongitude();
		double latitudeSrc = src.getCoordonnees().getLatitude();
		double longitudeDst = dst.getCoordonnees().getLongitude();
		double latitudeDst = dst.getCoordonnees().getLongitude();
		double resultat = 0;
		resultat =  Math.sqrt(Math.sqrt(latitudeDst - latitudeSrc)+ Math.sqrt(longitudeDst-longitudeSrc));
	}
	

}
