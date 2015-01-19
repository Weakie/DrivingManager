package com.weakie.driving.model.system.payment;

public class Pay {

	private PayType type;
	private int value;
	
	
	public Pay() {
		super();
	}
	public Pay(PayType type, int value) {
		super();
		this.type = type;
		this.value = value;
	}
	public PayType getType() {
		return type;
	}
	public void setType(PayType type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Pay [type=" + type + ", value=" + value + "]";
	}
	
	
}
