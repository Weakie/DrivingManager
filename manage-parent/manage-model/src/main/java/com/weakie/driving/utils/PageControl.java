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
	
	private String pagePath;//请求的URL路径
	private String pageData;//请求的参数信息
	
	public PageControl() {
		super();
	}
	
	public PageControl(String path) {
		super();
		this.pagePath = path;
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
	public String getPagePath() {
		return pagePath;
	}
	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}
	public String getPageData() {
		return pageData;
	}
	public void setPageData(String pageData) {
		this.pageData = pageData;
	}

	public int getTotalPage(){
		return totalNum/pageNum;
	}

	@Override
	public String toString() {
		return "PageControl [pageIndex=" + pageIndex + ", pageNum=" + pageNum + ", totalNum=" + totalNum
				+ ", pagePath=" + pagePath + ", pageData=" + pageData + "]";
	}
	
}
