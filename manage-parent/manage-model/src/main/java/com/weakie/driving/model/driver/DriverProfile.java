package com.weakie.driving.model.driver;

import java.util.Date;

import com.weakie.driving.mappings.StaticMappingCollections;

public class DriverProfile {

	private String driverID;
	private String nickName;
	private String realName;
	private String identity;
	private boolean sex;//true male
	private String telephone;
	private Date licenseTime;
	private DriverType type;
	private String companyID;
	private String companyName;
	private Date registeTime;
	
	private double balance;
	private boolean blocked;//是否冻结
	private boolean binding;
	private boolean online;
	private int verify;//-1:未通过，0：未审核，1：通过
	
	private String version;
	private DriverStatus state;
	
	
	public DriverProfile() {
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
	public DriverType getType() {
		return type;
	}
	public String getTypeString(){
		return StaticMappingCollections.getInstance().getDriverTypeMapping(this.type);
	}
	public void setType(DriverType type) {
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
	public Date getRegisteTime() {
		return registeTime;
	}
	public void setRegisteTime(Date registeTime) {
		this.registeTime = registeTime;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public boolean isBinding() {
		return binding;
	}
	public void setBinding(boolean binding) {
		this.binding = binding;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public DriverStatus getState() {
		return state;
	}
	public String getStateString(){
		return StaticMappingCollections.getInstance().getDriverStatusMapping(DriverStatus.reduceStatus(state));
	}
	public void setState(DriverStatus state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "DriverProfile [driverID=" + driverID + ", nickName=" + nickName + ", realName=" + realName
				+ ", identity=" + identity + ", sex=" + sex + ", telephone=" + telephone + ", licenseTime="
				+ licenseTime + ", type=" + type + ", companyID=" + companyID + ", companyName=" + companyName
				+ ", registeTime=" + registeTime + ", balance=" + balance + ", blocked=" + blocked + ", binding="
				+ binding + ", online=" + online + ", verify=" + verify + ", version=" + version + ", state=" + state
				+ "]";
	}
	
	
}
