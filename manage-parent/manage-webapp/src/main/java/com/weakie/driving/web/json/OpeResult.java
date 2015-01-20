package com.weakie.driving.web.json;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.weakie.driving.utils.InvokeResult;

/**
 * 用户操作结果
 * 用于以json的格式返回给前端使用
 * @author weakie,lin
 *
 */
public class OpeResult {

	public static final String RES_SUCC = "SUCCESS";
	public static final String RES_FAIL = "FAIL";
	private static final SimpleDateFormat sf = new SimpleDateFormat("(MM-dd a hh:mm:ss) ");
	private String res;
	private String com;
	private String additional;
	private String time;
	
	public OpeResult(String res, String com) {
		super();
		this.res = res;
		this.com = com;
		this.time = sf.format(new Date());
	}

	public OpeResult(InvokeResult ir, String com){
		this.res = (ir.isSuccess() ? RES_SUCC:RES_FAIL);
		this.com = com;
		this.additional = ir.getMsg();
		this.time = sf.format(new Date());
	}
	
	public OpeResult(String res, String com, String add){
		this(res, com);
		this.additional = add;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OpeResult [res=" + res + ", com=" + com + ", additional=" + additional + ", time=" + time + "]";
	}
}
