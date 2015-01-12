package com.weakie.driving.web.controller.driver;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.service.company.CompanyListService;
import com.weakie.driving.service.system.PaymentService;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/driver")
public class DriverController {

	private CompanyListService companyService;
	private PaymentService paymentService;
	
	@Autowired
	public void setCompanyService(CompanyListService companyService) {
		this.companyService = companyService;
	}
	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	private Map<String,String> getCompanys(){
		Map<String,String> company = this.companyService.getCompanyIDNameMapping();
		return company;
	}
	private Map<String,String> getPayments(){
		Map<String,String> payment = this.paymentService.getPaymentIDNameMapping();
		return payment;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String newDriver(ModelMap model) {
		model.addAttribute("title", "添加新司机");
		model.addAttribute("method", "post");
		model.addAttribute("company", this.getCompanys());
		model.addAttribute("payment", this.getPayments());
		return "/driver/driverCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newDriver(ModelMap model,DriverDetail driver) {
		model.addAttribute("title", "编辑司机");
		model.addAttribute("method", "put");
		model.addAttribute("company", this.getCompanys());
		model.addAttribute("payment", this.getPayments());
		model.addAttribute("driver", driver);
		LogUtil.debug("DriverController create Driver:"+driver);
		return "/driver/driverCreate";
	}
}
