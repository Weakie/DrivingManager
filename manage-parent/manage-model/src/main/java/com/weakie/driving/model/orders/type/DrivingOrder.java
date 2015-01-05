package com.weakie.driving.model.orders.type;

import java.util.Date;

import com.weakie.driving.model.orders.Customer;
import com.weakie.driving.model.orders.Driver;

public class DrivingOrder {
	private String orderID;

	private Customer customer;
	private Driver driver;

	private Date departTime;	//17 出发时间
	private String destination;	//18 目的地
	private String predictInfo;	//19 预计到达
	
	
	public DrivingOrder() {
		super();
	}
	public DrivingOrder(String orderID, Customer customer, Driver driver, Date departTime, String destination,
			String predictInfo) {
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.driver = driver;
		this.departTime = departTime;
		this.destination = destination;
		this.predictInfo = predictInfo;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Date getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPredictInfo() {
		return predictInfo;
	}
	public void setPredictInfo(String predictInfo) {
		this.predictInfo = predictInfo;
	}
	
	
}
