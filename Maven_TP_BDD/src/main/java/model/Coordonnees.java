package model;

public class Coordonnees {
	private float longitude;
	private float latitude;
	
	public Coordonnees(float longitude, float latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Coordonnees () {
		
	}
	public float getLongitude() {
		return this.longitude;
	}
	
	public float getLatitude() {
		return this.latitude;
	}
	
	public float setLongitude(float longitude) {
		return this.longitude = longitude;
	}
	
	public float SetLatitude(float latitude) {
		return this.latitude = latitude;
	}
}
