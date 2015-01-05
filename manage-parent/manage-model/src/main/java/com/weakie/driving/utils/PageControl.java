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
	
	
	public PageControl() {
		super();
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
}
