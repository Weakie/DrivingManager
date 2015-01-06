package com.weakie.driving.web.controller.orders;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.weakie.driving.utils.LogUtil;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.orders.OrderCreating;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.service.order.OrderService;
import com.weakie.driving.utils.PageControl;

/**
 * 订单详细操作
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	private OrderService orderService;
	private DriverLocationService driverLocationService;
	
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@Autowired
	public void setDriverLocationService(DriverLocationService driverLocationService) {
		this.driverLocationService = driverLocationService;
	}
	
	@ModelAttribute("date")
	public Date getDate(){
		return new Date();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String newOrder() {
		return "/order/orderCreate";
	}
	
	/**
	 * 创建新订单
	 * @param order
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String newOrder(OrderCreating order) {
		System.out.println(order);
		return "/order/orderCreate";
	}
	
	@RequestMapping(value="/customer/{customerID}", method = RequestMethod.GET)
	public ModelAndView showIncompleteOrder(@PathVariable("customerID") String customerID) {
		ModelAndView mav = new ModelAndView();
		/**
		 * 获取客户未完成订单ID列表
		 * 获取相应的订单Profile信息
		 * 组成Lst返回，用于创建新订单时客户未完成订单显示
		 */
		mav.setViewName("/order/pages/incompletedOrderList");
		return mav;
	}
	
	@RequestMapping(value="/drivers", method = RequestMethod.GET)
	public ModelAndView getAvailableDriven(@RequestParam("coordinate") Coordinate c, @ModelAttribute PageControl p) {
		LogUtil.debug("Invoke OrderController.getAvailableDriven():"+c);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/pages/availableDriverList");
		mav.addObject("driverList", this.driverLocationService.getDriverLocationInfosByPosition(c, p));
		return mav;
	}
	
	/**
	 * 查看订单详情
	 * @param orderID
	 * @return
	 */
	@RequestMapping(value="/{orderID}", method = RequestMethod.GET)
	public ModelAndView showDetail(@PathVariable("orderID") String orderID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/orderDetail");
		mav.addObject("order", this.orderService.getOrderDetailByOrderID(orderID));
		return mav;
	}
}
