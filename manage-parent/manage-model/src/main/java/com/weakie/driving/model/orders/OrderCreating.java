package com.weakie.driving.model.orders;

import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.weakie.driving.model.Coordinate;

/**
 * 添加新订单
 * @author weakie,lin
 *
 */
public class OrderCreating {

	private String customerID;
	private String aptmtPlace;
	private Coordinate aptmtCoordt;
	@DateTimeFormat(pattern="yyyy/MM/dd HH:mm")
	private Date aptmtTime;
	private int aptmtPeople = 1;
	private String orderSource;
	private boolean auto = false;
	private String comment;
	private String[] drivers;
	
	public OrderCreating() {
		super();
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getAptmtPlace() {
		return aptmtPlace;
	}

	public void setAptmtPlace(String aptmtPlace) {
		this.aptmtPlace = aptmtPlace;
	}

	public Coordinate getAptmtCoordt() {
		return aptmtCoordt;
	}

	public void setAptmtCoordt(Coordinate aptmtCoordt) {
		this.aptmtCoordt = aptmtCoordt;
	}

	public Date getAptmtTime() {
		return aptmtTime;
	}

	public void setAptmtTime(Date aptmtTime) {
		this.aptmtTime = aptmtTime;
	}

	public int getAptmtPeople() {
		return aptmtPeople;
	}

	public void setAptmtPeople(int aptmtPeople) {
		this.aptmtPeople = aptmtPeople;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean isAuto) {
		this.auto = isAuto;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String[] getDrivers() {
		return drivers;
	}

	public void setDrivers(String[] drivers) {
		this.drivers = drivers;
	}

	@Override
	public String toString() {
		return "OrderCreating [customerID=" + customerID + ", aptmtPlace=" + aptmtPlace + ", aptmtCoordt="
				+ aptmtCoordt + ", aptmtTime=" + aptmtTime + ", aptmtPeople=" + aptmtPeople + ", orderSource="
				+ orderSource + ", isAuto=" + auto + ", comment=" + comment + ", drivers=" + Arrays.toString(drivers)
				+ "]";
	}
	
	
	
}
