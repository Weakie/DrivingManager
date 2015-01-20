package com.weakie.driving.web.controller.send;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.driver.DriverLocationInfo;
import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.service.order.OrderService;
import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;

/**
 * 派单信息
 * 
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/send")
public class SendController {

	private OrderService orderService;
	private OrderListService orderListService;
	private DriverLocationService driverLocationService;

	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Autowired
	public void setOrderListService(OrderListService orderListService) {
		this.orderListService = orderListService;
	}

	@Autowired
	public void setDriverLocationService(DriverLocationService driverLocationService) {
		this.driverLocationService = driverLocationService;
	}

	/**
	 * 派单主页
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String orderIndex() {
		return "/sendOrder/sendIndex";
	}

	/**
	 * 派单主页
	 * 带有订单号的派单
	 * 
	 * @return
	 */
	@RequestMapping(value = "{orderID}", method = RequestMethod.GET)
	public String orderIndexWithSelected(@PathVariable("orderID") String orderID, ModelMap modelMap) {
		modelMap.addAttribute("order", this.orderService.getOrderProfileByOrderID(orderID));
		return "/sendOrder/sendIndexWithSelected";
	}

	/**
	 * 派单主页
	 * 带有订单号的派单
	 * 
	 * @return
	 */
	@RequestMapping(value = "{orderID}", method = RequestMethod.PUT, params = "driverID")
	public String sendOrder(@PathVariable("orderID") String orderID, @RequestParam("driverID") String driverID,
			ModelMap modelMap) {
		modelMap.addAttribute("order", this.orderService.getOrderProfileByOrderID(orderID));
		return "/sendOrder/sendIndexWithSelected";
	}

	/**
	 * 获取未派送订单列表（新订单）
	 * 
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ModelAndView getUnSendOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/unsendOrderList");
		mav.addObject("orderList", this.orderListService.getNewOrders(p));
		return mav;
	}

	/**
	 * 获取所有在上班的司机列表（司机位置信息）
	 * 
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET)
	public ModelAndView getOnWorkingDrivens(@ModelAttribute("pc") PageControl p) {
		List<DriverLocationInfo> list = this.driverLocationService.getDriverLocationInfosByStatus(DriverStatus.ALL, p);
		list = this.driverLocationService.filterWorkingDriverLocationInfos(list);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/workingDriverList");
		mav.addObject("driverList", list);
		return mav;
	}

	/**
	 * 获取坐标附近的司机列表（司机位置信息）
	 * 
	 * @param c
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET, params = "coordinate")
	public ModelAndView getAvailableDriven(@RequestParam("coordinate") Coordinate c, @ModelAttribute PageControl p) {
		LogUtil.debug("Invoke SendOrderControl.getAvailableDriven():" + c);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/availableDriverList");
		mav.addObject("driverList", this.driverLocationService.getDriverLocationInfosByPosition(c, p));
		return mav;
	}

}
