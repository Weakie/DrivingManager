package com.weakie.driving.model.car;

import java.util.Date;

/**
 * 工作车指派信息
 * @author weakie,lin
 *
 */
public class CarAssign {
	private String carID;
	private String driverID;
	private String driverName;
	private Date assginDate;
	
	public CarAssign() {
		super();
	}
	public CarAssign(String carID, String driverID, String driverName, Date assginDate) {
		super();
		this.carID = carID;
		this.driverID = driverID;
		this.driverName = driverName;
		this.assginDate = assginDate;
	}
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Date getAssginDate() {
		return assginDate;
	}
	public void setAssginDate(Date assginDate) {
		this.assginDate = assginDate;
	}
	@Override
	public String toString() {
		return "CarAssign [carID=" + carID + ", driverID=" + driverID + ", driverName=" + driverName + ", assginDate="
				+ assginDate + "]";
	}
	
	
}
