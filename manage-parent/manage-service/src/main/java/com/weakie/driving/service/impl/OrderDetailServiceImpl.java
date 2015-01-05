package com.weakie.driving.service.impl;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.orders.OrderDetail;
import com.weakie.driving.service.order.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Override
	public OrderDetail getOrderDetailByOrderID(String orderID) {
		// TODO Auto-generated method stub
		return new OrderDetail();
	}

}
