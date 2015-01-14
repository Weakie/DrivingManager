package com.weakie.driving.model.car;

import java.util.Date;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Driver;

/**
 * 司机接送信息
 * 
 * @author weakie,lin
 *
 */
public class CarShuttle {

	private String id;
	private String state;
	private Driver driver;
	private Coordinate coord;
	private String coordName;
	private Date time;
	private String orderID;
	private Driver shuttleDriver;

	public CarShuttle() {
		super();
	}

	public CarShuttle(String id, String state, Driver driver, Coordinate coord, String coordName, Date time,
			String orderID, Driver shuttleDriver) {
		super();
		this.id = id;
		this.state = state;
		this.driver = driver;
		this.coord = coord;
		this.coordName = coordName;
		this.time = time;
		this.orderID = orderID;
		this.shuttleDriver = shuttleDriver;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Coordinate getCoord() {
		return coord;
	}

	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}

	public String getCoordName() {
		return coordName;
	}

	public void setCoordName(String coordName) {
		this.coordName = coordName;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Driver getShuttleDriver() {
		return shuttleDriver;
	}

	public void setShuttleDriver(Driver shuttleDriver) {
		this.shuttleDriver = shuttleDriver;
	}
}
