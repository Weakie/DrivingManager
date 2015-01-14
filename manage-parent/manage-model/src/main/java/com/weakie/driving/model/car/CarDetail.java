package com.weakie.driving.model.car;

import com.weakie.driving.model.Driver;

/**
 * 工作车信息
 * @author weakie,lin
 *
 */
public class CarDetail {

	private String id;
	private String carNumber;
	private String carType;
	private CarArea area;
	private CarStatus state;
	private Driver driver;
	private String company;
	private String comment;
	
	public CarDetail() {
		super();
	}
	public CarDetail(String id, String carNumber, String carType, CarArea area, CarStatus state, Driver driver,
			String company, String comment) {
		super();
		this.id = id;
		this.carNumber = carNumber;
		this.carType = carType;
		this.area = area;
		this.state = state;
		this.driver = driver;
		this.company = company;
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public CarArea getArea() {
		return area;
	}
	public void setArea(CarArea area) {
		this.area = area;
	}
	public CarStatus getState() {
		return state;
	}
	public void setState(CarStatus state) {
		this.state = state;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", carNumber=" + carNumber + ", carType=" + carType + ", area=" + area
				+ ", state=" + state + ", driver=" + driver + ", company=" + company + ", comment=" + comment + "]";
	}
	
	
}
