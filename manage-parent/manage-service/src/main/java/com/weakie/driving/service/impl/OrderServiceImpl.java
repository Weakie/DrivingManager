package com.weakie.driving.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Customer;
import com.weakie.driving.model.orders.OrderDetail;
import com.weakie.driving.model.orders.OrderProfile;
import com.weakie.driving.model.orders.OrderStatus;
import com.weakie.driving.service.order.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public OrderDetail getOrderDetailByOrderID(String orderID) {
		// TODO Auto-generated method stub
		return new OrderDetail();
	}

	@Override
	public OrderProfile getOrderProfileByOrderID(String orderID) {
		OrderProfile p = new OrderProfile();
		p.setOrderID("1234208280003");
		p.setOrderSource("客户下单");
		p.setOrderType("一键下单");
		p.setOrderStatus(OrderStatus.NEW);
		p.setCustomer(new Customer("111","222","221213121"));
		p.setAptmtTime(new Date());
		p.setAptmtPlace("上海市");
		p.setAptmtCoordt(new Coordinate(123,344));
		return p;
	}

}
