package com.weakie.driving.web.controller.system.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.system.PaymentService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/payments")
public class PaymentListController {
	
	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/payments");
	}
	
	private PaymentService paymentService;
	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String paymentIndex() {
		return "/system/payment/paymentIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getPayments(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/payment/pages/paymentList");
		mav.addObject("paymentList", this.paymentService.getPaymentList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchPayments(@ModelAttribute("pc") PageControl p,@RequestParam("q") String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/payment/pages/paymentList");
		mav.addObject("paymentList", this.paymentService.searchPaymentList(p, q));
		return mav;
	}
}
