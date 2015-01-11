package com.weakie.driving.web.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.customer.CustomerListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/customers")
public class CustomerListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/customers");
	}
	
	private CustomerListService customerListService;
	
	@Autowired
	public void setCustomerListService(CustomerListService customerListService) {
		this.customerListService = customerListService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String customerIndex() {
		return "/customer/customerIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=individual")
	public ModelAndView getIndividualCustomers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/customer/pages/customerList");
		mav.addObject("customerList", this.customerListService.getIndividualCustomer(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=enterprise")
	public ModelAndView getEnterpriseCustomers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/customer/pages/customerList");
		mav.addObject("customerList", this.customerListService.getEnterpriseCustomer(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=vip")
	public ModelAndView getVIPCustomers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/customer/pages/customerList");
		mav.addObject("customerList", this.customerListService.getVIPCustomer(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchCustomers(@RequestParam("q") String q, @ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/customer/pages/customerList");
		mav.addObject("customerList", this.customerListService.searchCustomer(p, q));
		return mav;
	}
}
