package com.weakie.driving.model.system.payment;

import java.util.List;

public class Payment {

	private String id;
	private String name;
	private List<Period> periods;
	public Payment() {
		super();
	}
	public Payment(String id, String name, List<Period> periods) {
		super();
		this.id = id;
		this.name = name;
		this.periods = periods;
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
	public List<Period> getPeriods() {
		return periods;
	}
	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", name=" + name + ", periods=" + periods + "]";
	}
	
	
}
