package com.weakie.driving.model.system.payment;

public class Period {

	private String beginTime;
	private String endTime;
	private Pay payment;
	
	public Period() {
		super();
	}

	public Period(String beginTime, String endTime, Pay payment) {
		super();
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.payment = payment;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Pay getPayment() {
		return payment;
	}

	public void setPayment(Pay payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Period [beginTime=" + beginTime + ", endTime=" + endTime + ", payment=" + payment + "]";
	}
	
	
}
