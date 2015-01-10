package com.weakie.driving.web.controller.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.PageControl;

/**
 * 订单列表信息
 * 
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/orders")
public class OrderListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/orders");
	}
	
	private OrderListService orderListService;

	@Autowired
	public void setOrderService(OrderListService orderService) {
		this.orderListService = orderService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String orderIndex() {
		return "/orders/orderIndex";
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=new")
	public ModelAndView getNewOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/newOrderList");
		mav.addObject("orderList", this.orderListService.getNewOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=dispatched")
	public ModelAndView getDispatchedOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/dispatchedOrderList");
		mav.addObject("orderList", this.orderListService.getDispatchedOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=accepted")
	public ModelAndView getAcceptedOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/acceptedOrderList");
		mav.addObject("orderList", this.orderListService.getAcceptedOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=driving")
	public ModelAndView getDrivingOrders(@ModelAttribute("pc") PageControl p) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/drivingOrderList");
		mav.addObject("orderList", this.orderListService.getDrivingOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=destroyed")
	public ModelAndView getDestroyedOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/destroyedOrderList");
		mav.addObject("orderList", this.orderListService.getDestroyedOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=payed")
	public ModelAndView getPayedOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/payedOrderList");
		mav.addObject("orderList", this.orderListService.getPayedOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "type=reported")
	public ModelAndView getReportedOrders(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/reportedOrderList");
		mav.addObject("orderList", this.orderListService.getReportedOrders(p));
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchOrders(@RequestParam("q") String q, @ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/orders/pages/reportedOrderList");
		mav.addObject("orderList", this.orderListService.searchOrders(q, p));
		return mav;
	}

	
}
