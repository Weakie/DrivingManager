package com.weakie.driving.model;

import java.util.Date;

/**
 * 消费信息
 * @author weakie,lin
 *
 */
public class ConsumeInfo {

	private String id;
	private Date time;
	private String ope;
	private String comment;
	private double amount;
	
	public ConsumeInfo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getOpe() {
		return ope;
	}
	public void setOpe(String ope) {
		this.ope = ope;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ConsumeInfo [id=" + id + ", time=" + time + ", ope=" + ope + ", comment=" + comment + ", amount="
				+ amount + "]";
	}
	
	
}
