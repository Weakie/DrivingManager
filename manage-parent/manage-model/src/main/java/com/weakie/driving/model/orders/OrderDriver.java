package com.weakie.driving.model.orders;

public class OrderDriver {

	private String id;
	private String name;
	private String telephone;
	private String company;
	
	
	public OrderDriver() {
		super();
	}
	public OrderDriver(String id, String name, String telephone, String company) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.company = company;
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
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", telephone=" + telephone + ", company=" + company + "]";
	}
	
	
}
