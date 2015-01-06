package com.weakie.driving.model.orders.type;

import java.util.Date;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.orders.OrderCustomer;

public class NewOrder {

	private String orderID;
	private String orderType;
	private String orderSource;
	
	private Date aptmtTime;
	private String aptmtPlace;
	
	private OrderCustomer customer;
	private Coordinate aptmtCoordt;
	
	private String comment;
	
	public NewOrder(){
		super();
	}
	
	public NewOrder(String orderID, String orderType, String orderSource, Date aptmtTime, String aptmtPlace,
			OrderCustomer customer, Coordinate aptmtCoordt, String comment) {
		super();
		this.orderID = orderID;
		this.orderType = orderType;
		this.orderSource = orderSource;
		this.aptmtTime = aptmtTime;
		this.aptmtPlace = aptmtPlace;
		this.customer = customer;
		this.aptmtCoordt = aptmtCoordt;
		this.comment = comment;
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

	public Coordinate getAptmtCoordt() {
		return aptmtCoordt;
	}

	public void setAptmtCoordt(Coordinate aptmtCoordt) {
		this.aptmtCoordt = aptmtCoordt;
	}



	public static class Builder{
		private String orderID;
		private String orderType;
		private String orderSource;
		
		private Date aptmtTime;
		private String aptmtPlace;
		
		private OrderCustomer customer;
		private Coordinate aptmtCoordt;
		private String comment;
		
		public Builder(String orderID){
			this.orderID = orderID;
		}
		
		public Builder orderType(String orderType){
			this.orderType = orderType;
			return this;
		}
		
		public Builder orderSource(String orderSource){
			this.orderSource = orderSource;
			return this;
		}
		
		public Builder aptmtTime(Date date){
			this.aptmtTime = date;
			return this;
		}
		
		public Builder aptmtPlace(String place){
			this.aptmtPlace = place;
			return this;
		}
		
		public Builder comment(String comment){
			this.comment = comment;
			return this;
		}
		
		public Builder customer(OrderCustomer customer){
			this.customer = customer;
			return this;
		}
		
		public Builder aptmtCoordt(Coordinate coodt){
			this.aptmtCoordt = coodt;
			return this;
		}
		
		public NewOrder build(){
			return new NewOrder(this);
		}
	}
	
	private NewOrder(Builder b){
		this.orderID = b.orderID;
		this.orderType = b.orderType;
		this.orderSource = b.orderSource;
		
		this.aptmtTime = b.aptmtTime;
		this.aptmtPlace = b.aptmtPlace;
		
		this.customer = b.customer;
		this.aptmtCoordt = b.aptmtCoordt;
		this.comment = b.comment;
	}
}
