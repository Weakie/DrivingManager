package com.weakie.driving.utils;

public class OpeResult {

	public static final String RES_SUCCESS = "SUCCESS";
	public static final String RES_FAIL = "FAIL";
	private String res;
	private String com;
	private String additional;
	
	public OpeResult(String res, String com) {
		super();
		this.res = res;
		this.com = com;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getAdditional() {
		return additional;
	}
	public void setAdditional(String additional) {
		this.additional = additional;
	}
	
	
	
}
