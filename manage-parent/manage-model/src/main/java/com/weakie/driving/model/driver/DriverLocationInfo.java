package com.weakie.driving.model.driver;

import java.util.Date;

import com.weakie.driving.model.Coordinate;

public class DriverLocationInfo {

	private String driverID;
	private String nickName;
	private String realName;
	private String telephone;
	private String company;
	
	private int timesCurrentDay;
	private int timesCurrentMonth;
	
	private double distance;
	
	private DriverStatus currentState;
	private String currentPosition;
	private Coordinate currentCoodte;
	
	private String beginPosition;
	private Coordinate beginCoodte;
	private Date beginTime;
	
	private String endPosition;
	private Coordinate endCoodte;
	private Date endTime;
	
	
	public DriverLocationInfo() {
		super();
	}
	public DriverLocationInfo(String driverID, String nickName, String realName, String telephone, String company,
			int timesCurrentDay, int timesCurrentMonth, double distance, DriverStatus currentState,
			String currentPosition, Coordinate currentCoodte, String beginPosition, Coordinate beginCoodte,
			Date beginTime, String endPosition, Coordinate endCoodte, Date endTime) {
		super();
		this.driverID = driverID;
		this.nickName = nickName;
		this.realName = realName;
		this.telephone = telephone;
		this.company = company;
		this.timesCurrentDay = timesCurrentDay;
		this.timesCurrentMonth = timesCurrentMonth;
		this.distance = distance;
		this.currentState = currentState;
		this.currentPosition = currentPosition;
		this.currentCoodte = currentCoodte;
		this.beginPosition = beginPosition;
		this.beginCoodte = beginCoodte;
		this.beginTime = beginTime;
		this.endPosition = endPosition;
		this.endCoodte = endCoodte;
		this.endTime = endTime;
	}
	public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getTimesCurrentDay() {
		return timesCurrentDay;
	}
	public void setTimesCurrentDay(int timesCurrentDay) {
		this.timesCurrentDay = timesCurrentDay;
	}
	public int getTimesCurrentMonth() {
		return timesCurrentMonth;
	}
	public void setTimesCurrentMonth(int timesCurrentMonth) {
		this.timesCurrentMonth = timesCurrentMonth;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public DriverStatus getCurrentState() {
		return currentState;
	}
	public void setCurrentState(DriverStatus currentState) {
		this.currentState = currentState;
	}
	public String getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	public Coordinate getCurrentCoodte() {
		return currentCoodte;
	}
	public void setCurrentCoodte(Coordinate currentCoodte) {
		this.currentCoodte = currentCoodte;
	}
	public String getBeginPosition() {
		return beginPosition;
	}
	public void setBeginPosition(String beginPosition) {
		this.beginPosition = beginPosition;
	}
	public Coordinate getBeginCoodte() {
		return beginCoodte;
	}
	public void setBeginCoodte(Coordinate beginCoodte) {
		this.beginCoodte = beginCoodte;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndPosition() {
		return endPosition;
	}
	public void setEndPosition(String endPosition) {
		this.endPosition = endPosition;
	}
	public Coordinate getEndCoodte() {
		return endCoodte;
	}
	public void setEndCoodte(Coordinate endCoodte) {
		this.endCoodte = endCoodte;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	@Override
	public String toString() {
		return "DriverLocationInfo [driverID=" + driverID + ", nickName=" + nickName + ", realName=" + realName
				+ ", telephone=" + telephone + ", company=" + company + ", timesCurrentDay=" + timesCurrentDay
				+ ", timesCurrentMonth=" + timesCurrentMonth + ", distance=" + distance + ", currentState="
				+ currentState + ", currentPosition=" + currentPosition + ", currentCoodte=" + currentCoodte
				+ ", beginPosition=" + beginPosition + ", beginCoodte=" + beginCoodte + ", beginTime=" + beginTime
				+ ", endPosition=" + endPosition + ", endCoodte=" + endCoodte + ", endTime=" + endTime + "]";
	}
	
	
}
