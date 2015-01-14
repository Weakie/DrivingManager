package com.weakie.driving.service.impl.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.Customer;
import com.weakie.driving.model.Driver;
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
public class OrderListServiceImpl implements OrderListService {

	private Customer Customer = new Customer("", "haha", "1231");
	private Driver driver = new Driver("haha","王","1281203483","一米");
	
	@Override
	public List<NewOrder> getNewOrders(PageControl pageControl) {
		
		List<NewOrder> orderList = new ArrayList<NewOrder>();
		for (int i = 0; i < 10; i++) {
			NewOrder order = new NewOrder.Builder("12409001920290"+i).customer(new Customer("", "haha", "1231"))
					.orderSource("一键下单").orderType("一键下单").aptmtPlace("shanghai").aptmtTime(new Date())
					.aptmtCoordt(new Coordinate(100, 200)).build();
			order.setComment("我是备注信息");
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<AcceptedOrder> getAcceptedOrders(PageControl pageControl) {
		List<AcceptedOrder> orderList = new ArrayList<AcceptedOrder>();
		
		for (int i = 0; i < 10; i++) {
			AcceptedOrder order = new AcceptedOrder("0099000"+i,"一键下单","客户端",new Date(),
					"shanghai",this.Customer,"无",this.driver,new Date());
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<DispatchedOrder> getDispatchedOrders(PageControl pageControl) {
		List<DispatchedOrder> orderList = new ArrayList<DispatchedOrder>();
		
		for (int i = 0; i < 10; i++) {
			DispatchedOrder order = new DispatchedOrder("00992310000998"+i,"一键下单","客户端",new Date(),
					"shanghai",this.Customer,"无",this.driver);
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<DrivingOrder> getDrivingOrders(PageControl pageControl) {
		List<DrivingOrder> orderList = new ArrayList<DrivingOrder>();
		for (int i = 0; i < 10; i++) {
			DrivingOrder order = new DrivingOrder("121440099000"+i,this.Customer,this.driver,
					new Date(),"shanghai","09-02 12:57 行程27.7公里");
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<DestroyedOrder> getDestroyedOrders(PageControl pageControl) {
		List<DestroyedOrder> orderList = new ArrayList<DestroyedOrder>();
		
		for (int i = 0; i < 10; i++) {
			DestroyedOrder order = new DestroyedOrder("46440099000"+i,"一键下单","客户端",new Date(),
					"shanghai",this.Customer,"无",this.driver,
					new Date(),new Date());
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<PayedOrder> getPayedOrders(PageControl pageControl) {
		List<PayedOrder> orderList = new ArrayList<PayedOrder>();
		
		for (int i = 0; i < 10; i++) {
			PayedOrder order = new PayedOrder("56430099000"+i,"一键下单",
					this.Customer,this.driver,"shanghai",
					new Date(),20,20,"沪A1231");
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public  List<ReportedOrder> getReportedOrders(PageControl pageControl) {
		List<ReportedOrder> orderList = new ArrayList<ReportedOrder>();
		
		for (int i = 0; i < 10; i++) {
			ReportedOrder order = new ReportedOrder("12450099000"+i,"一键下单",
					this.Customer,this.driver,"备注信息","shanghai",
					new Date(),20,20,"沪A1231");
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

	@Override
	public List<ReportedOrder> searchOrders(String queryString, PageControl pageControl) {
		List<ReportedOrder> orderList = new ArrayList<ReportedOrder>();
		
		for (int i = 0; i < 10; i++) {
			ReportedOrder order = new ReportedOrder("22130099000"+i,"一键下单",
					this.Customer,this.driver,"备注信息","shanghai",
					new Date(),20,20,"沪A1231");
			orderList.add(order);
		}
		pageControl.setTotalNum(100);
		return orderList;
	}

}
