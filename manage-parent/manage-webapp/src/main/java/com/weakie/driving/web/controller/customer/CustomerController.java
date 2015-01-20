package com.weakie.driving.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping(method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {
		model.addAttribute("title", "添加新客户");
		model.addAttribute("method", "post");
		return "/customer/customerCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model,CustomerDetail customer) {
		model.addAttribute("title", "编辑客户信息");
		model.addAttribute("method", "put");
		model.addAttribute("cus", customer);
		LogUtil.debug("CustomerController create Customer:"+customer);
		return "/customer/customerCreate";
	}
	
}
