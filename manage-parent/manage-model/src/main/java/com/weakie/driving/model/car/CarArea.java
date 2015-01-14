package com.weakie.driving.model.car;

import com.weakie.driving.model.Coordinate;

/**
 * 工作车负责区域
 * @author weakie,lin
 *
 */
public class CarArea {

	private String id;
	private String city;
	private String district;
	
	private Coordinate p1;
	private Coordinate p2;
	
	
	public CarArea() {
		super();
	}
	
	public CarArea(String id, String city, String district, Coordinate p1, Coordinate p2) {
		super();
		this.id = id;
		this.city = city;
		this.district = district;
		this.p1 = p1;
		this.p2 = p2;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Coordinate getP1() {
		return p1;
	}
	public void setP1(Coordinate p1) {
		this.p1 = p1;
	}
	public Coordinate getP2() {
		return p2;
	}
	public void setP2(Coordinate p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "CarArea [id=" + id + ", city=" + city + ", district=" + district + ", p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
}
