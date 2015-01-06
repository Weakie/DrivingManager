package com.weakie.driving.service.order;

import com.weakie.driving.model.orders.OrderDetail;
import com.weakie.driving.model.orders.OrderProfile;

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
}
