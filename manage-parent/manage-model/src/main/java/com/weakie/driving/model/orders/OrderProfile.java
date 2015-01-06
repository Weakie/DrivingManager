package com.weakie.driving.model.orders;

import java.util.Date;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Customer;

/**
 * 订单简单信息
 * @author weakie,lin
 *
 */
public class OrderProfile {
	private String orderID;
	private String orderType;
	private String orderSource;
	
	private Date aptmtTime;
	private String aptmtPlace;
	
	private Customer customer;
	private Coordinate aptmtCoordt;
	
	private OrderStatus orderStatus;

	public OrderProfile() {
		super();
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Coordinate getAptmtCoordt() {
		return aptmtCoordt;
	}

	public void setAptmtCoordt(Coordinate aptmtCoordt) {
		this.aptmtCoordt = aptmtCoordt;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderProfile [orderID=" + orderID + ", orderType=" + orderType + ", orderSource=" + orderSource
				+ ", aptmtTime=" + aptmtTime + ", aptmtPlace=" + aptmtPlace + ", customer=" + customer
				+ ", aptmtCoordt=" + aptmtCoordt + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
