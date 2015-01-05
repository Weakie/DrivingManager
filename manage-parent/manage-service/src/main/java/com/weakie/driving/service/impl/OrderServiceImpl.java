package com.weakie.driving.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.orders.Customer;
import com.weakie.driving.model.orders.Driver;
import com.weakie.driving.model.orders.type.AcceptedOrder;
import com.weakie.driving.model.orders.type.DestroyedOrder;
import com.weakie.driving.model.orders.type.DispatchedOrder;
import com.weakie.driving.model.orders.type.DrivingOrder;
import com.weakie.driving.model.orders.type.NewOrder;
import com.weakie.driving.model.orders.type.PayedOrder;
import com.weakie.driving.model.orders.type.ReportedOrder;
import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.PageControl;

@Service
public class OrderServiceImpl implements OrderListService {

	private Customer Customer = new Customer("", "haha", "1231");
	private Driver driver = new Driver("haha","王","1281203483","一米");
	
	@Override
	public List<NewOrder> getNewOrders(PageControl pageControl) {
		NewOrder order = new NewOrder.Builder("09001920290").customer(new Customer("", "haha", "1231"))
				.orderSource("一键下单").orderType("一键下单").aptmtPlace("shanghai").aptmtTime(new Date())
				.aptmtCoordt(new Coordinate(100, 200)).build();
		List<NewOrder> orderList = new ArrayList<NewOrder>();
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<AcceptedOrder> getAcceptedOrders(PageControl pageControl) {
		List<AcceptedOrder> orderList = new ArrayList<AcceptedOrder>();
		AcceptedOrder order = new AcceptedOrder("0099000","一键下单","客户端",new Date(),
				"shanghai",this.Customer,"无",this.driver,new Date());
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public  List<DispatchedOrder> getDispatchedOrders(PageControl pageControl) {
		List<DispatchedOrder> orderList = new ArrayList<DispatchedOrder>();
		DispatchedOrder order = new DispatchedOrder("00992310000998","一键下单","客户端",new Date(),
				"shanghai",this.Customer,"无",this.driver);
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public  List<DrivingOrder> getDrivingOrders(PageControl pageControl) {
		List<DrivingOrder> orderList = new ArrayList<DrivingOrder>();
		DrivingOrder order = new DrivingOrder("0099000",this.Customer,this.driver,
				new Date(),"shanghai","09-02 12:57 行程27.7公里");
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public  List<DestroyedOrder> getDestroyedOrders(PageControl pageControl) {
		List<DestroyedOrder> orderList = new ArrayList<DestroyedOrder>();
		DestroyedOrder order = new DestroyedOrder("0099000","一键下单","客户端",new Date(),
				"shanghai",this.Customer,"无",this.driver,
				new Date(),new Date());
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public  List<PayedOrder> getPayedOrders(PageControl pageControl) {
		List<PayedOrder> orderList = new ArrayList<PayedOrder>();
		PayedOrder order = new PayedOrder("0099000","一键下单",
				this.Customer,this.driver,"shanghai",
				new Date(),20,20,"沪A1231");
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

	@Override
	public  List<ReportedOrder> getReportedOrder(PageControl pageControl) {
		List<ReportedOrder> orderList = new ArrayList<ReportedOrder>();
		ReportedOrder order = new ReportedOrder("0099000","一键下单",
				this.Customer,this.driver,"shanghai",
				new Date(),20,20,"沪A1231");
		for (int i = 0; i < 10; i++) {
			orderList.add(order);
		}
		return orderList;
	}

}
