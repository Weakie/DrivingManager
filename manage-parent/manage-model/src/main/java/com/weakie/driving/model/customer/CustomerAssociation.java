package com.weakie.driving.model.customer;

/**
 * 企业客户关联号码
 * @author weakie,lin
 *
 */
public class CustomerAssociation {

	private String customerID;
	private String tel;
	private String name;
	private String addr;
	private String carNumber;
	
	public CustomerAssociation() {
		super();
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "CustomerAssociation [customerID=" + customerID + ", tel=" + tel + ", name=" + name + ", addr=" + addr
				+ ", carNumber=" + carNumber + "]";
	}
	
	
}
