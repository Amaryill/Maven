package connectMySQL;

import java.text.DecimalFormat;

import model.Villes;

public class Distance {
	
	
	public String distance(Villes src, Villes dst) {
		int R = 6378000; //Rayon de la terre en mètre7
		double a = Math.PI / 180;
		double lon_a = src.getCoordonnees().getLongitude()*a;
		double lat_a = src.getCoordonnees().getLatitude()*a;
		double lon_b = dst.getCoordonnees().getLongitude()*a;
		double lat_b = dst.getCoordonnees().getLongitude()*a;
		double resultat = 0;
//		//resultat = Math.sqrt(Math.sqrt(lat_b - lat_a)+ Math.sqrt(lon_b-lon_a));
//		resultat = R * (Math.PI/2 - Math.asin( Math.sin(lat_b) * Math.sin(lat_a) + Math.cos(lon_b - lon_a) * Math.cos(lat_b) * Math.cos(lat_a)));
		double rayonAngu = Math.acos( Math.sin(lat_b) * Math.sin(lat_a) + Math.cos(lon_b - lon_a) * Math.cos(lat_b) * Math.cos(lat_a));
		
		resultat = rayonAngu * R;
		
//		
//		double lat1 = lat_a * a;
//		double lat2 = lat_b * a;
//		double lon1 = lon_a * a;
//		double lon2 = lon_b * a;
//
//		double t1 = Math.sin(lat1) * Math.sin(lat2);
//		double t2 = Math.cos(lat1) * Math.cos(lat2);
//		double t3 = Math.cos(lon1 - lon2);
//		double t4 = t2 * t3;
//		double t5 = t1 + t4;
//		double rad_dist = Math.atan(-t5/Math.sqrt(-t5 * t5 +1)) + 2 * Math.atan(1);
//
//		resultat = (rad_dist * 3437.74677 * 1.1508) * 1.6093470878864446;
		
		
		DecimalFormat numberFormat = new DecimalFormat("#.00000");
		return numberFormat.format(resultat/100000);
	}
	
	public double convertRad(float input){
		return ((Math.PI * input)/180);
	}
	
	
	
	
	

}
