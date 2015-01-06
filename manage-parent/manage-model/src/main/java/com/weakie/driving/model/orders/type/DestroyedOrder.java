package com.weakie.driving.model.orders.type;

import java.util.Date;

import com.weakie.driving.model.orders.OrderCustomer;
import com.weakie.driving.model.orders.OrderDriver;

public class DestroyedOrder {

	private String orderID;
	private String orderType;
	private String orderSource;
	
	private Date aptmtTime;		// 4 预约时间
	private String aptmtPlace;	// 5 预约地
	
	private OrderCustomer customer;	// 34 6 7
	private String comment;
	private OrderDriver driver;		//11 12 13 14
	
	private Date acceptTime;	//15 接单时间
	private Date destroyedTime;	//32 销单时间
	
	
	public DestroyedOrder() {
		super();
	}
	public DestroyedOrder(String orderID, String orderType, String orderSource, Date aptmtTime, String aptmtPlace,
			OrderCustomer customer, String comment, OrderDriver driver, Date acceptTime, Date destroyedTime) {
		super();
		this.orderID = orderID;
		this.orderType = orderType;
		this.orderSource = orderSource;
		this.aptmtTime = aptmtTime;
		this.aptmtPlace = aptmtPlace;
		this.customer = customer;
		this.comment = comment;
		this.driver = driver;
		this.acceptTime = acceptTime;
		this.destroyedTime = destroyedTime;
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
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public Date getAptmtTime() {
		return aptmtTime;
	}
	public void setAptmtTime(Date aptmtTime) {
		this.aptmtTime = aptmtTime;
	}
	public String getAptmtPlace() {
		return aptmtPlace;
	}
	public void setAptmtPlace(String aptmtPlace) {
		this.aptmtPlace = aptmtPlace;
	}
	public OrderCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(OrderCustomer customer) {
		this.customer = customer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public OrderDriver getDriver() {
		return driver;
	}
	public void setDriver(OrderDriver driver) {
		this.driver = driver;
	}
	public Date getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	public Date getDestroyedTime() {
		return destroyedTime;
	}
	public void setDestroyedTime(Date destroyedTime) {
		this.destroyedTime = destroyedTime;
	}
	
	
}
