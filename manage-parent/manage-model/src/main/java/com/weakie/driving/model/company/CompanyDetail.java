package com.weakie.driving.model.company;

import com.weakie.driving.model.Coordinate;

public class CompanyDetail {

	private String id;
	private String city;
	private String addr;
	private Coordinate coord;
	
	private String name;
	private String shortName;
	private String telephone;
	private String principle;
	private String mobileNum;
	
	private String faxNumber;
	private String email;
	private int scale;
	
	private String tel400;
	private String comment;
	private String logoURL;
	
	
	public CompanyDetail() {
		super();
	}
	
	public CompanyDetail(String id, String city, String addr, Coordinate coord, String name, String shortName,
			String telephone, String principle, String mobileNum, String faxNumber, String email, int scale,
			String tel400, String comment, String logoURL) {
		super();
		this.id = id;
		this.city = city;
		this.addr = addr;
		this.coord = coord;
		this.name = name;
		this.shortName = shortName;
		this.telephone = telephone;
		this.principle = principle;
		this.mobileNum = mobileNum;
		this.faxNumber = faxNumber;
		this.email = email;
		this.scale = scale;
		this.tel400 = tel400;
		this.comment = comment;
		this.logoURL = logoURL;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Coordinate getCoord() {
		return coord;
	}
	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPrinciple() {
		return principle;
	}
	public void setPrinciple(String principle) {
		this.principle = principle;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}
	public String getTel400() {
		return tel400;
	}
	public void setTel400(String tel400) {
		this.tel400 = tel400;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getLogoURL() {
		return logoURL;
	}
	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}
	
}
