package model;

public class Coordonnees {
	private double longitude;
	private double latitude;
	
	public Coordonnees(double longitude, double latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Coordonnees () {
		
	}
	public double getLongitude() {
		return this.longitude;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double setLongitude(double longitude) {
		return this.longitude = longitude;
	}
	
	public double SetLatitude(double latitude) {
		return this.latitude = latitude;
	}
}
