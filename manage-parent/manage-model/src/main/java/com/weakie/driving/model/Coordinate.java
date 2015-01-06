package com.weakie.driving.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.weakie.driving.utils.LogUtil;

public class Coordinate {

	private double lat;//latitude
	private double lng;//longitude
	
	
	public Coordinate() {
		super();
	}
	public Coordinate(String s) {
		LogUtil.debug("Invoke coordinate(String s): "+s);
		if(StringUtils.isEmpty(s)){
			return;
		}
		String body = StringUtils.substringBetween(s, "(", ")");
		String[] numbers = StringUtils.split(body, ',');
		lat = NumberUtils.toDouble(numbers[0]);
		lng = NumberUtils.toDouble(numbers[1]);
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
