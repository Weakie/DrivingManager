package com.weakie.driving.model.orders;

import java.util.Date;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Customer;
import com.weakie.driving.model.Driver;

/**
 * 订单详细信息
 * @author weakie,lin
 *
 */
public class OrderDetail {

	private String orderID;
	private String orderType;
	private String orderSource;

	private Date aptmtTime;
	private String aptmtPlace;//代驾地点

	private Customer customer;
	private Coordinate aptmtCoordt;

	private String comment;

	private Date createTime;	// 09订单创建时间
	private Date dispatchedTime;// 10订单创建时间
	
	private Driver driver;
	private Date acceptTime;	// 15接单时间
	private Date arrivedTime;	// 16到达时间
	
	private Date departTime; 	// 17 出发时间
	private String destination; // 18 目的地
	private String predictInfo; // 19 预计到达
	
	private Date payedTime;		// 20 结算时间
	private int shouldPay;		// 21 应收金额
	private int actualPay;		// 22 实收金额
	private String carNumber;	// 23 车牌号
	
	private int waitingTime;
	private int drivingTime;
	private int midWaitTime;
	private float driverMileage;
	
	private int reimburse;		//报销金额
	private String reimburseNotes;	//报销说明
	private Date reimburseTime;
	private String payMethod;
	private OrderStatus orderStatus;
	private Date destroyedTime;	//32 销单时间
	
	
	public OrderDetail() {
		super();
	}
	public OrderDetail(String orderID, String orderType, String orderSource, Date aptmtTime, String aptmtPlace,
			Customer customer, Coordinate aptmtCoordt, String comment, Date createTime, Date dispatchedTime,
			Driver driver, Date acceptTime, Date arrivedTime, Date departTime, String destination, String predictInfo,
			Date payedTime, int shouldPay, int actualPay, String carNumber, int waitingTime, int drivingTime,
			int midWaitTime, float driverMileage, int reimburse, String reimburseNotes, Date reimburseTime,
			String payMethod, OrderStatus orderStatus, Date destroyedTime) {
		super();
		this.orderID = orderID;
		this.orderType = orderType;
		this.orderSource = orderSource;
		this.aptmtTime = aptmtTime;
		this.aptmtPlace = aptmtPlace;
		this.customer = customer;
		this.aptmtCoordt = aptmtCoordt;
		this.comment = comment;
		this.createTime = createTime;
		this.dispatchedTime = dispatchedTime;
		this.driver = driver;
		this.acceptTime = acceptTime;
		this.arrivedTime = arrivedTime;
		this.departTime = departTime;
		this.destination = destination;
		this.predictInfo = predictInfo;
		this.payedTime = payedTime;
		this.shouldPay = shouldPay;
		this.actualPay = actualPay;
		this.carNumber = carNumber;
		this.waitingTime = waitingTime;
		this.drivingTime = drivingTime;
		this.midWaitTime = midWaitTime;
		this.driverMileage = driverMileage;
		this.reimburse = reimburse;
		this.reimburseNotes = reimburseNotes;
		this.reimburseTime = reimburseTime;
		this.payMethod = payMethod;
		this.orderStatus = orderStatus;
		this.destroyedTime = destroyedTime;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public Date getAptmtTime() {
		return aptmtTime;
	}
	public void setAptmtTime(Date aptmtTime) {
		this.aptmtTime = aptmtTime;
	}
	public String getAptmtPlace() {
		return aptmtPlace;
	}
	public void setAptmtPlace(String aptmtPlace) {
		this.aptmtPlace = aptmtPlace;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Coordinate getAptmtCoordt() {
		return aptmtCoordt;
	}
	public void setAptmtCoordt(Coordinate aptmtCoordt) {
		this.aptmtCoordt = aptmtCoordt;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getDispatchedTime() {
		return dispatchedTime;
	}
	public void setDispatchedTime(Date dispatchedTime) {
		this.dispatchedTime = dispatchedTime;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Date getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	public Date getArrivedTime() {
		return arrivedTime;
	}
	public void setArrivedTime(Date arrivedTime) {
		this.arrivedTime = arrivedTime;
	}
	public Date getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPredictInfo() {
		return predictInfo;
	}
	public void setPredictInfo(String predictInfo) {
		this.predictInfo = predictInfo;
	}
	public Date getPayedTime() {
		return payedTime;
	}
	public void setPayedTime(Date payedTime) {
		this.payedTime = payedTime;
	}
	public int getShouldPay() {
		return shouldPay;
	}
	public void setShouldPay(int shouldPay) {
		this.shouldPay = shouldPay;
	}
	public int getActualPay() {
		return actualPay;
	}
	public void setActualPay(int actualPay) {
		this.actualPay = actualPay;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(int waitingTime) {
		this.waitingTime = waitingTime;
	}
	public int getDrivingTime() {
		return drivingTime;
	}
	public void setDrivingTime(int drivingTime) {
		this.drivingTime = drivingTime;
	}
	public int getMidWaitTime() {
		return midWaitTime;
	}
	public void setMidWaitTime(int midWaitTime) {
		this.midWaitTime = midWaitTime;
	}
	public float getDriverMileage() {
		return driverMileage;
	}
	public void setDriverMileage(float driverMileage) {
		this.driverMileage = driverMileage;
	}
	public int getReimburse() {
		return reimburse;
	}
	public void setReimburse(int reimburse) {
		this.reimburse = reimburse;
	}
	public String getReimburseNotes() {
		return reimburseNotes;
	}
	public void setReimburseNotes(String reimburseNotes) {
		this.reimburseNotes = reimburseNotes;
	}
	public Date getReimburseTime() {
		return reimburseTime;
	}
	public void setReimburseTime(Date reimburseTime) {
		this.reimburseTime = reimburseTime;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getDestroyedTime() {
		return destroyedTime;
	}
	public void setDestroyedTime(Date destroyedTime) {
		this.destroyedTime = destroyedTime;
	}
	@Override
	public String toString() {
		return "OrderDetail [orderID=" + orderID + ", orderType=" + orderType + ", orderSource=" + orderSource
				+ ", aptmtTime=" + aptmtTime + ", aptmtPlace=" + aptmtPlace + ", customer=" + customer
				+ ", aptmtCoordt=" + aptmtCoordt + ", comment=" + comment + ", createTime=" + createTime
				+ ", dispatchedTime=" + dispatchedTime + ", driver=" + driver + ", acceptTime=" + acceptTime
				+ ", arrivedTime=" + arrivedTime + ", departTime=" + departTime + ", destination=" + destination
				+ ", predictInfo=" + predictInfo + ", payedTime=" + payedTime + ", shouldPay=" + shouldPay
				+ ", actualPay=" + actualPay + ", carNumber=" + carNumber + ", waitingTime=" + waitingTime
				+ ", drivingTime=" + drivingTime + ", midWaitTime=" + midWaitTime + ", driverMileage=" + driverMileage
				+ ", reimburse=" + reimburse + ", reimburseNotes=" + reimburseNotes + ", reimburseTime="
				+ reimburseTime + ", payMethod=" + payMethod + ", orderStatus=" + orderStatus + ", destroyedTime="
				+ destroyedTime + "]";
	}
	
	
}
