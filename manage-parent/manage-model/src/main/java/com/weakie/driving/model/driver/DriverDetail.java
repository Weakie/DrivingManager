package com.weakie.driving.model.driver;

import java.util.Date;

public class DriverDetail {

	private String driverID;
	private String nickName;
	private String realName;
	private String identity;
	private boolean sex;//true male
	private String telephone;
	private Date licenseTime;
	private String type;
	private String companyID;
	private String companyName;
	
	private String avatarImage;
	private String licenseImage;
	private String bodyImage;
	private String paymentID;//提成ID
	private String licenseType;
	private String introducer;
	private int height;
	private String nativePlace;
	private String address;
	private String emergPeople;
	private String emergTel;
	private String comment;
	private Date registeTime;
	
	
	public DriverDetail() {
		super();
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
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getLicenseTime() {
		return licenseTime;
	}
	public void setLicenseTime(Date licenseTime) {
		this.licenseTime = licenseTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAvatarImage() {
		return avatarImage;
	}
	public void setAvatarImage(String avatarImage) {
		this.avatarImage = avatarImage;
	}
	public String getLicenseImage() {
		return licenseImage;
	}
	public void setLicenseImage(String licenseImage) {
		this.licenseImage = licenseImage;
	}
	public String getBodyImage() {
		return bodyImage;
	}
	public void setBodyImage(String bodyImage) {
		this.bodyImage = bodyImage;
	}
	public String getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmergPeople() {
		return emergPeople;
	}
	public void setEmergPeople(String emergPeople) {
		this.emergPeople = emergPeople;
	}
	public String getEmergTel() {
		return emergTel;
	}
	public void setEmergTel(String emergTel) {
		this.emergTel = emergTel;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getRegisteTime() {
		return registeTime;
	}
	public void setRegisteTime(Date registeTime) {
		this.registeTime = registeTime;
	}
	@Override
	public String toString() {
		return "DriverDetail [driverID=" + driverID + ", nickName=" + nickName + ", realName=" + realName
				+ ", identity=" + identity + ", sex=" + sex + ", telephone=" + telephone + ", licenseTime="
				+ licenseTime + ", type=" + type + ", companyID=" + companyID + ", companyName=" + companyName
				+ ", avatarImage=" + avatarImage + ", licenseImage=" + licenseImage + ", bodyImage=" + bodyImage
				+ ", paymentID=" + paymentID + ", licenseType=" + licenseType + ", introducer=" + introducer
				+ ", height=" + height + ", nativePlace=" + nativePlace + ", address=" + address + ", emergPeople="
				+ emergPeople + ", emergTel=" + emergTel + ", comment=" + comment + ", registeTime=" + registeTime
				+ "]";
	}
	
	
}
