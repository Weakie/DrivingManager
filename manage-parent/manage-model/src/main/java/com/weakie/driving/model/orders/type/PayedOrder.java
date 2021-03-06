package com.weakie.driving.model.orders.type;

import java.util.Date;

import com.weakie.driving.model.Customer;
import com.weakie.driving.model.Driver;

public class PayedOrder {

	private String orderID;
	private String orderType;
	
	private Customer customer;
	private Driver driver;
	
	private String destination;	//18 目的地
	private Date payedTime;		//20 结算时间
	private int shouldPay;		//21 应收金额
	private int actualPay;		//22 实收金额
	private String carNumber;	//23 车牌号
	
	public PayedOrder() {
		super();
	}
	public PayedOrder(String orderID, String orderType, Customer customer, Driver driver, String destination,
			Date payedTime, int shouldPay, int actualPay, String carNumber) {
		super();
		this.orderID = orderID;
		this.orderType = orderType;
		this.customer = customer;
		this.driver = driver;
		this.destination = destination;
		this.payedTime = payedTime;
		this.shouldPay = shouldPay;
		this.actualPay = actualPay;
		this.carNumber = carNumber;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
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
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getPayedTime() {
		return payedTime;
	}
	public void setPayedTime(Date payedTime) {
		this.payedTime = payedTime;
	}
	public int getShouldPay() {
		return shouldPay;
	}
	public void setShouldPay(int shouldPay) {
		this.shouldPay = shouldPay;
	}
	public int getActualPay() {
		return actualPay;
	}
	public void setActualPay(int actualPay) {
		this.actualPay = actualPay;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	
}
