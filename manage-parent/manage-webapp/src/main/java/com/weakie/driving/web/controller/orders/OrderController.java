package com.weakie.driving.web.controller.orders;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 订单详细操作
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/orders/{orderID}")
public class OrderController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showDetail(@PathVariable("orderID") String orderID) {
		return null;
	}
}
