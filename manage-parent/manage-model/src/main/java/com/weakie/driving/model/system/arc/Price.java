package com.weakie.driving.model.system.arc;

import java.util.List;

public class Price {

	private String beginTime;
	private String endTime;
	private int startingPrice;
	private List<MileagePrice> mileagePrice;
	private RegularIncrease regularIncrease;
	
	public Price() {
		super();
	}
	public Price(String beginTime, String endTime, int startingPrice, List<MileagePrice> mileagePrice,
			RegularIncrease regularIncrease) {
		super();
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.startingPrice = startingPrice;
		this.mileagePrice = mileagePrice;
		this.regularIncrease = regularIncrease;
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
	public int getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(int startingPrice) {
		this.startingPrice = startingPrice;
	}
	public List<MileagePrice> getMileagePrice() {
		return mileagePrice;
	}
	public void setMileagePrice(List<MileagePrice> mileagePrice) {
		this.mileagePrice = mileagePrice;
	}
	public RegularIncrease getRegularIncrease() {
		return regularIncrease;
	}
	public void setRegularIncrease(RegularIncrease regularIncrease) {
		this.regularIncrease = regularIncrease;
	}
	@Override
	public String toString() {
		return "Price [beginTime=" + beginTime + ", endTime=" + endTime + ", startingPrice=" + startingPrice
				+ ", mileagePrice=" + mileagePrice + ", regularIncrease=" + regularIncrease + "]";
	}
	
	
}
