package com.weakie.driving.utils;

/**
 * 定义了翻页信息
 * @author weakie,lin
 *
 */
public class PageControl {

	private int pageIndex = 1;
	private int pageNum = 10;
	private int totalNum = -1;
	
	private String path;//请求的URL路径
	private String data;//请求的参数信息
	
	public PageControl() {
		super();
	}
	
	public PageControl(String path, String data) {
		super();
		this.path = path;
		this.data = data;
	}

	public PageControl(int pageIndex, int pageNum, int totalNum) {
		super();
		this.pageIndex = pageIndex;
		this.pageNum = pageNum;
		this.totalNum = totalNum;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public int getTotalPage(){
		return totalNum/pageNum;
	}
}
