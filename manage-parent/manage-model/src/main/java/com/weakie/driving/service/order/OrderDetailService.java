package com.weakie.driving.service.order;

import com.weakie.driving.model.orders.OrderDetail;

public interface OrderDetailService {

	/**
	 * 查看订单详情
	 * @param orderID
	 * @return
	 */
	public OrderDetail getOrderDetailByOrderID(String orderID);
}
