package com.weakie.driving.web.controller.system.payment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.system.payment.Payment;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@RequestMapping(method = RequestMethod.GET)
	public String newpayment(ModelMap model) {
		model.addAttribute("title", "添加新提成");
		model.addAttribute("method", "post");
		return "/system/payment/paymentCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newPayment(ModelMap model,Payment payment) {
		model.addAttribute("title", "编辑提成信息");
		model.addAttribute("method", "put");
		model.addAttribute("payment", payment);
		LogUtil.debug("PaymentController create payment:"+payment);
		return "/system/payment/paymentCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updatePayment(ModelMap model,Payment payment) {
		model.addAttribute("title", "编辑提成信息");
		model.addAttribute("method", "put");
		model.addAttribute("payment", payment);
		LogUtil.debug("PaymentController update payment:"+payment);
		return "/system/payment/paymentCreate";
	}
}
