package com.weakie.driving.web.controller.customer;

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

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.service.customer.CustomerService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;
import com.weakie.driving.web.json.OpeResult;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;
	
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {
		model.addAttribute("title", "添加新客户");
		model.addAttribute("method", "post");
		return "/customer/customerCreate";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model, CustomerDetail customer) {
		// TODO 跳转到指定页面
		this.customerService.createCustomer(customer);
		LogUtil.debug("CustomerController create Customer:" + customer);
		return "/customer/customerCreate";
	}

	@RequestMapping(value = "/{customerID}", method = RequestMethod.GET)
	public String updateCustomer(ModelMap model, @PathVariable("customerID") String customerID) {
		model.addAttribute("title", "编辑客户信息");
		model.addAttribute("method", "put");
		model.addAttribute("customerID", customerID);
		model.addAttribute("cus", this.customerService.getCustomerInfo(customerID));
		return "/customer/customerCreate";
	}

	@RequestMapping(value = "/{customerID}", method = RequestMethod.PUT)
	public String updateCustomer(ModelMap model, @PathVariable("customerID") String customerID, CustomerDetail customer) {
		// TODO 跳转到指定页面
		this.customerService.updateCustomer(customer);
		LogUtil.debug("CustomerController create Customer:" + customer);
		return "/customer/customerCreate";
	}
	
	/**
	 * 删除客户信息
	 * @param customerID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{customerID}", method = RequestMethod.DELETE)
	public OpeResult deleteCustomer(@PathVariable("customerID") String customerID) {
		LogUtil.info("deleteCustomer :" + customerID);
		InvokeResult ir = this.customerService.deleteCustomer(customerID);
		return new OpeResult(ir, "删除-客户号:" + customerID);
	}
	
	/**
	 * 客户充值
	 * @param customerID
	 * @param amount
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{customerID}", method = RequestMethod.PUT, params = "amount")
	public OpeResult rechargeCustomerAmount(@PathVariable("customerID") String customerID,
			@RequestParam("amount") String amount) {
		LogUtil.info("rechargeCustomerAmount :" + customerID + " ,amt:" + amount);
		try {
			double amt = Double.parseDouble(amount);
			InvokeResult ir = this.customerService.rechargeCustomer(customerID, amt);
			return new OpeResult(ir, "充值-客户号:" + customerID+",金额"+amount);
		} catch (NumberFormatException e) {
			return new OpeResult(OpeResult.RES_FAIL, "客户号:" + customerID, "请输入一个数字");
		}
	}
	
	/**
	 * 获取客户消费记录
	 * @param driverID
	 * @param pc
	 * @return
	 */
	@RequestMapping(value = "/{customerID}/consume_history", method = RequestMethod.GET)
	public ModelAndView getConsumeHistory(@PathVariable("customerID") String customerID, @ModelAttribute("pc") PageControl pc) {
		pc.setPagePath("/customer/"+customerID+"/consume_history");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/consumeList");
		mav.addObject("consumeList", this.customerService.getConsmeHistory(customerID, pc));
		LogUtil.debug("CustomerController getConsumeHistory:" + customerID);
		return mav;
	}
	
}
