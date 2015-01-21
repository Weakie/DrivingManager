package com.weakie.driving.model.customer;

/**
 * 客户信息,创建订单的时候使用
 * 
 * @author weakie,lin
 */
public class CustomerProfile {
	private String tel;
	private String name;
	private String id;
	private String type;
	private double balance = 0;
	private int allAmount = 0;
	private int monthAmount = 0;
	private boolean newCustomer = false;
	
	public CustomerProfile(){
		this.name = "自动";
		this.type = "新客户";
		this.newCustomer = true;
	}
	public CustomerProfile(CustomerDetail detail) {
		this.tel = detail.getTel();
		this.name = detail.getName();
		this.id = detail.getId();
		// TODO 修改客户类型为中文
		this.type = detail.getType().toString();
		this.balance = detail.getBalance();
		this.allAmount = detail.getAllAmount();
		this.monthAmount = detail.getMonthAmount();
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
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
	
	public boolean isNewCustomer() {
		return newCustomer;
	}
	public void setNewCustomer(boolean newCustomer) {
		this.newCustomer = newCustomer;
	}
	@Override
	public String toString() {
		return "CustomerProfile [tel=" + tel + ", name=" + name + ", id=" + id + ", type=" + type + ", balance="
				+ balance + ", allAmount=" + allAmount + ", monthAmount=" + monthAmount + ", isNew=" + newCustomer + "]";
	}
}