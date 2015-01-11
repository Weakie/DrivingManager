package com.weakie.driving.model.customer;

public class CustomerDetail {

	private String id;
	private String name;
	private String source;
	private String tel;
	private boolean overdraft;
	private double balance;
	private String company;
	
	private String comment;
	private String companyAddr;
	private String avatarImage;
	private CustomerType type;
	private String carNumber;
	
	private int allAmount;
	private int monthAmount;
	
	public CustomerDetail() {
		super();
	}
	public CustomerDetail(String id, String name, String source, String tel, boolean overdraft, double balance,
			String company, CustomerType type) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.tel = tel;
		this.overdraft = overdraft;
		this.balance = balance;
		this.company = company;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isOverdraft() {
		return overdraft;
	}
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getAvatarImage() {
		return avatarImage;
	}
	public void setAvatarImage(String avatarImage) {
		this.avatarImage = avatarImage;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getAllAmount() {
		return allAmount;
	}
	public void setAllAmount(int allAmount) {
		this.allAmount = allAmount;
	}
	public int getMonthAmount() {
		return monthAmount;
	}
	public void setMonthAmount(int monthAmount) {
		this.monthAmount = monthAmount;
	}
	
	@Override
	public String toString() {
		return "CustomerDetail [id=" + id + ", name=" + name + ", source=" + source + ", tel=" + tel + ", overdraft="
				+ overdraft + ", balance=" + balance + ", company=" + company + ", type=" + type + "]";
	}
}
