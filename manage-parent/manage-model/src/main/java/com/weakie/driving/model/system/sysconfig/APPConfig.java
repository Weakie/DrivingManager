package com.weakie.driving.model.system.sysconfig;

public class APPConfig {

	private boolean allowPeemptiveOrder;
	private int peemptiveDistance;
	private boolean openWorkingCar;
	private boolean transOrderWorkingCar;
	private boolean transOrderDriver;
	private boolean targetRequired;
	private boolean cusInfoRequired;
	
	private int nearbyDriverDistance;
	private String shareContents;

	public APPConfig() {
		super();
	}
	public APPConfig(boolean allowPeemptiveOrder, int peemptiveDistance, boolean openWorkingCar,
			boolean transOrderWorkingCar, boolean transOrderDriver, boolean targetRequired, boolean cusInfoRequired,
			int nearbyDriverDistance, String shareContents) {
		super();
		this.allowPeemptiveOrder = allowPeemptiveOrder;
		this.peemptiveDistance = peemptiveDistance;
		this.openWorkingCar = openWorkingCar;
		this.transOrderWorkingCar = transOrderWorkingCar;
		this.transOrderDriver = transOrderDriver;
		this.targetRequired = targetRequired;
		this.cusInfoRequired = cusInfoRequired;
		this.nearbyDriverDistance = nearbyDriverDistance;
		this.shareContents = shareContents;
	}
	public boolean isAllowPeemptiveOrder() {
		return allowPeemptiveOrder;
	}
	public void setAllowPeemptiveOrder(boolean allowPeemptiveOrder) {
		this.allowPeemptiveOrder = allowPeemptiveOrder;
	}
	public int getPeemptiveDistance() {
		return peemptiveDistance;
	}
	public void setPeemptiveDistance(int peemptiveDistance) {
		this.peemptiveDistance = peemptiveDistance;
	}
	public boolean isOpenWorkingCar() {
		return openWorkingCar;
	}
	public void setOpenWorkingCar(boolean openWorkingCar) {
		this.openWorkingCar = openWorkingCar;
	}
	public boolean isTransOrderWorkingCar() {
		return transOrderWorkingCar;
	}
	public void setTransOrderWorkingCar(boolean transOrderWorkingCar) {
		this.transOrderWorkingCar = transOrderWorkingCar;
	}
	public boolean isTransOrderDriver() {
		return transOrderDriver;
	}
	public void setTransOrderDriver(boolean transOrderDriver) {
		this.transOrderDriver = transOrderDriver;
	}
	public boolean isTargetRequired() {
		return targetRequired;
	}
	public void setTargetRequired(boolean targetRequired) {
		this.targetRequired = targetRequired;
	}
	public boolean isCusInfoRequired() {
		return cusInfoRequired;
	}
	public void setCusInfoRequired(boolean cusInfoRequired) {
		this.cusInfoRequired = cusInfoRequired;
	}
	public int getNearbyDriverDistance() {
		return nearbyDriverDistance;
	}
	public void setNearbyDriverDistance(int nearbyDriverDistance) {
		this.nearbyDriverDistance = nearbyDriverDistance;
	}
	public String getShareContents() {
		return shareContents;
	}
	public void setShareContents(String shareContents) {
		this.shareContents = shareContents;
	}
	@Override
	public String toString() {
		return "APPConfig [allowPeemptiveOrder=" + allowPeemptiveOrder + ", peemptiveDistance=" + peemptiveDistance
				+ ", openWorkingCar=" + openWorkingCar + ", transOrderWorkingCar=" + transOrderWorkingCar
				+ ", transOrderDriver=" + transOrderDriver + ", targetRequired=" + targetRequired
				+ ", cusInfoRequired=" + cusInfoRequired + ", nearbyDriverDistance=" + nearbyDriverDistance
				+ ", shareContents=" + shareContents + "]";
	}
	
	
}
