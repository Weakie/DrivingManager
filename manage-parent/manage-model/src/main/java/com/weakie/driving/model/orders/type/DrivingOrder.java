package com.weakie.driving.model.orders.type;

import java.util.Date;

import com.weakie.driving.model.orders.OrderCustomer;
import com.weakie.driving.model.orders.OrderDriver;

public class DrivingOrder {
	private String orderID;

	private OrderCustomer customer;
	private OrderDriver driver;

	private Date departTime;	//17 出发时间
	private String destination;	//18 目的地
	private String predictInfo;	//19 预计到达
	
	
	public DrivingOrder() {
		super();
	}
	public DrivingOrder(String orderID, OrderCustomer customer, OrderDriver driver, Date departTime, String destination,
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
	public OrderCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(OrderCustomer customer) {
		this.customer = customer;
	}
	public OrderDriver getDriver() {
		return driver;
	}
	public void setDriver(OrderDriver driver) {
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
