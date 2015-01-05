package com.weakie.driving.service.order;

import java.util.List;

import com.weakie.driving.model.orders.type.AcceptedOrder;
import com.weakie.driving.model.orders.type.DestroyedOrder;
import com.weakie.driving.model.orders.type.DispatchedOrder;
import com.weakie.driving.model.orders.type.DrivingOrder;
import com.weakie.driving.model.orders.type.NewOrder;
import com.weakie.driving.model.orders.type.PayedOrder;
import com.weakie.driving.model.orders.type.ReportedOrder;
import com.weakie.driving.utils.PageControl;

/**
 * 获取订单列表信息
 * @author weakie,lin
 *
 */
public interface OrderListService {

	public List<NewOrder> getNewOrders(PageControl pageControl);
	
	public List<AcceptedOrder> getAcceptedOrders(PageControl pageControl);
	
	public List<DispatchedOrder> getDispatchedOrders(PageControl pageControl);
	
	public List<DrivingOrder> getDrivingOrders(PageControl pageControl);
	
	public List<DestroyedOrder> getDestroyedOrders(PageControl pageControl);
	
	public List<PayedOrder> getPayedOrders(PageControl pageControl);
	
	public List<ReportedOrder> getReportedOrder(PageControl pageControl);

}
