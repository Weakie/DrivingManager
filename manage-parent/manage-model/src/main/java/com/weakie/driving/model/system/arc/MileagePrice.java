package com.weakie.driving.model.system.arc;

public class MileagePrice {

	private int beginMileage;
	private int endMileage;
	private int increaseFare;

	public MileagePrice() {
		super();
	}
	public MileagePrice(int beginMileage, int endMileage, int increaseFare) {
		super();
		this.beginMileage = beginMileage;
		this.endMileage = endMileage;
		this.increaseFare = increaseFare;
	}
	public int getBeginMileage() {
		return beginMileage;
	}
	public void setBeginMileage(int beginMileage) {
		this.beginMileage = beginMileage;
	}
	public int getEndMileage() {
		return endMileage;
	}
	public void setEndMileage(int endMileage) {
		this.endMileage = endMileage;
	}
	public int getIncreaseFare() {
		return increaseFare;
	}
	public void setIncreaseFare(int increaseFare) {
		this.increaseFare = increaseFare;
	}
	@Override
	public String toString() {
		return "MileagePrice [beginMileage=" + beginMileage + ", endMileage=" + endMileage + ", increaseFare="
				+ increaseFare + "]";
	}
	
}
