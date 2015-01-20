package com.weakie.driving.service.order;

import com.weakie.driving.model.orders.OrderCreating;
import com.weakie.driving.model.orders.OrderDetail;
import com.weakie.driving.model.orders.OrderProfile;
import com.weakie.driving.utils.InvokeResult;

public interface OrderService {

	/**
	 * 查看订单详情
	 * @param orderID
	 * @return
	 */
	public OrderDetail getOrderDetailByOrderID(String orderID);
	
	/**
	 * 获取订单简介
	 * @param orderID
	 * @return
	 */
	public OrderProfile getOrderProfileByOrderID(String orderID);
	
	/**
	 * 创建订单
	 * @param newOrder
	 * @return
	 */
	public InvokeResult createNewOrder(OrderCreating newOrder);
	/**
	 * 派单
	 * @param orderID
	 * @return
	 */
	public InvokeResult distributeOrder(String orderID,String driverID);
	
	/**
	 * 销单,强制销单
	 * @param orderID
	 * @return
	 */
	public InvokeResult destroyOrder(String orderID);
	
	/**
	 * 收回,强制收回
	 * @param orderID
	 * @return
	 */
	public InvokeResult retrieveOrder(String orderID);
	
	/**
	 * 修改备注
	 * @param orderID
	 * @param comment
	 * @return
	 */
	public InvokeResult commentOrder(String orderID,String comment);
	
	/**
	 * 修改实收金额
	 * @param orderID
	 * @param amount
	 * @return
	 */
	public InvokeResult updateRealAmount(String orderID,double amount);
}
