package com.weakie.driving.model;

public class Coordinate {

	private double lat;//latitude
	private double lng;//longitude
	
	
	public Coordinate() {
		super();
	}
	
	public Coordinate(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Coordinate [lat=" + lat + ", lng=" + lng + "]";
	}
	
	
}
