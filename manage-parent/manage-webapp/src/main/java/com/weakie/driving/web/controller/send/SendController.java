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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.driver.DriverLocationInfo;
import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.service.order.OrderService;
import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;
import com.weakie.driving.web.json.OpeResult;

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
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String orderIndex() {
		return "/sendOrder/sendIndex";
	}

	/**
	 * 派单主页
	 * 带有订单号的派单
	 * @return
	 */
	@RequestMapping(value = "/{orderID}", method = RequestMethod.GET)
	public String orderIndexWithSelected(@PathVariable("orderID") String orderID, ModelMap modelMap) {
		modelMap.addAttribute("order", this.orderService.getOrderProfileByOrderID(orderID));
		return "/sendOrder/sendIndex";
	}

	/**
	 * 派单
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{orderID}", method = RequestMethod.PUT, params = "driverID")
	public OpeResult sendOrder(@PathVariable("orderID") String orderID, @RequestParam("driverID") String driverID) {
		LogUtil.info("sendOrder :" + orderID + " ,driver:" + driverID);
		InvokeResult ir = this.orderService.distributeOrder(orderID, driverID);
		return new OpeResult(ir, "派单-订单号:" + orderID + ", 司机号" + driverID);
	}

	/**
	 * 获取未派送订单列表（新订单）
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ModelAndView getUnSendOrders(@ModelAttribute("pc") PageControl pc) {
		pc.setPagePath("/send/orders");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/unsendOrderList");
		mav.addObject("orderList", this.orderListService.getNewOrders(pc));
		return mav;
	}

	/**
	 * 获取所有在上班的司机列表（司机位置信息）
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET)
	public ModelAndView getOnWorkingDrivens(@ModelAttribute("pc") PageControl pc) {
		pc.setPagePath("/send/drivers");
		List<DriverLocationInfo> list = this.driverLocationService.getDriverLocationInfosByStatus(DriverStatus.ALL, pc);
		list = this.driverLocationService.filterWorkingDriverLocationInfos(list);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/workingDriverList");
		mav.addObject("driverList", list);
		return mav;
	}

	/**
	 * 获取坐标附近的司机列表（司机位置信息）
	 * @param c
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET, params = {"coordinate","orderID"})
	public ModelAndView getAvailableDriven(@RequestParam("coordinate") Coordinate c, @ModelAttribute("orderID") String id, @ModelAttribute("pc") PageControl pc) {
		LogUtil.debug("Invoke SendOrderControl.getAvailableDriven():" + c);
		pc.setPagePath("/send/drivers");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/sendOrder/pages/availableDriverList");
		mav.addObject("driverList", this.driverLocationService.getDriverLocationInfosByPosition(c, pc));
		return mav;
	}

}
