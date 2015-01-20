package com.weakie.driving.utils;

/**
 * 调用service的返回结果
 * @author weakie,lin
 *
 */
public class InvokeResult {

	private boolean success = true;
	private String msg = "";

	public InvokeResult() {
		super();
	}
	public InvokeResult(boolean result, String msg) {
		super();
		this.success = result;
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "InvokeResult [result=" + success + ", msg=" + msg + "]";
	}
	
	
}
