package com.weakie.driving.model;

import java.util.Date;

/**
 * 司机通话记录
 * @author weakie,lin
 *
 */
public class CallRecord {

	private Driver driver;
	private Customer customer;
	private Date time;
	private int seconds;
	
	public CallRecord() {
		super();
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	
}
