package com.weakie.driving.web.controller.orders;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.orders.OrderCreating;

/**
 * 订单详细操作
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@ModelAttribute("date")
	public Date getDate(){
		return new Date();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String newOrder() {
		return "/order/orderCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newOrder(OrderCreating order) {
		System.out.println(order);
		return "/order/orderCreate";
	}
	
	@RequestMapping(value="/{orderID}", method = RequestMethod.GET)
	public ModelAndView showDetail(@PathVariable("orderID") String orderID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/orderDetail");
		return mav;
	}
}
