package com.weakie.driving.model.system.user;


public class User {

	private String id;
	private String pwd;
	private String companyID;
	private String companyName;
	private boolean freezed;
	private String roleID;
	
	public User() {
		super();
	}

	public User(String id, String pwd, String companyID, String companyName, boolean freezed, String role) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.companyID = companyID;
		this.companyName = companyName;
		this.freezed = freezed;
		this.roleID = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public boolean isFreezed() {
		return freezed;
	}

	public void setFreezed(boolean freezed) {
		this.freezed = freezed;
	}

	public String getRole() {
		return roleID;
	}

	public void setRole(String role) {
		this.roleID = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", companyID=" + companyID + ", companyName=" + companyName
				+ ", freezed=" + freezed + ", role=" + roleID + "]";
	}
	
	
}
