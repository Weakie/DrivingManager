package com.weakie.driving.web.controller.orders;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.model.customer.CustomerProfile;
import com.weakie.driving.model.orders.OrderCreating;
import com.weakie.driving.model.orders.OrderProfile;
import com.weakie.driving.service.customer.CustomerService;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;
import com.weakie.driving.web.json.OpeResult;

/**
 * 创建新订单一系列流程
 * 
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/orderCreate")
public class OrderCreateController {

	private CustomerService customerService;
	private OrderListService orderListService;
	private DriverLocationService driverLocationService;

	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Autowired
	public void setOrderListService(OrderListService orderListService) {
		this.orderListService = orderListService;
	}

	@Autowired
	public void setDriverLocationService(DriverLocationService driverLocationService) {
		this.driverLocationService = driverLocationService;
	}

	@ModelAttribute("date")
	public Date getDate() {
		return new Date();
	}

	/**
	 * 创建新订单
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newOrder() {
		return "/order/orderCreate";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String newOrder(OrderCreating order,@RequestParam("withSend")boolean withSend) {
		LogUtil.info("OrderController create new Order:" + order+", with send " + withSend);
		// InvokeResult ir = this.orderService.createNewOrder(order);
		// TODO 确定操作成功之后返回到那个页面
		return "/order/orderCreate";
	}

	/**
	 * 创建订单的时候获取客户信息
	 * @param tel
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/customer/{tel}", method = RequestMethod.GET)
	public CustomerProfile getCustomerByTel(@PathVariable("tel") String tel) {
		LogUtil.debug("getCustomerByTel :" + tel);
		CustomerDetail detail = this.customerService.getCustomerInfoByTel(tel);
		if(detail == null){
			return new CustomerProfile();
		}
		return new CustomerProfile(detail);
	}
	
	/**
	 * 创建订单时添加新的客户信息
	 * @param name
	 * @param tel
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/customer", method = RequestMethod.PUT, params = {"name","tel"})
	public OpeResult createNewCustomer(@RequestParam("name") String name, @RequestParam("tel") String tel) {
		LogUtil.info("createNewCustomer name:" + name + " ,tel:" + tel);
		InvokeResult ir = this.customerService.createCustomer(name, tel);
		return new OpeResult(ir, "创建新客户-姓名:" + name + ",电话:" + tel);
	}
	
	/**
	 * 获取客户未完成订单
	 * @param customerID
	 * @return
	 */
	@RequestMapping(value = "/customer/{customerID}/orders", method = RequestMethod.GET)
	public ModelAndView showUnresolvedOrder(@PathVariable("customerID") String customerID, @ModelAttribute("pc") PageControl pc) {
		LogUtil.debug("Invoke OrderCreateController.showUnresolvedOrder():" + customerID);
		// TODO
		/**
		 * 获取客户未完成订单ID列表,获取相应的订单Profile信息,组成Lst返回,用于创建新订单时客户未完成订单显示
		 */
		pc.setPagePath("/orderCreate/customer/"+customerID+"/orders");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/pages/incompletedOrderList");
		List<String> orderID = this.customerService.getUnresolvedOrderID(customerID,pc);
		List<OrderProfile> orders = this.orderListService.getOrderProfileByOrderID(orderID);
		mav.addObject("orderList", orders);
		return mav;
	}

	/**
	 * 获取可以派单的司机
	 * @param c
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET)
	public ModelAndView getAvailableDriven(@RequestParam("coordinate") Coordinate c, @ModelAttribute("pc") PageControl pc) {
		LogUtil.debug("Invoke OrderCreateController.getAvailableDriven():" + c);
		pc.setPagePath("/orderCreate/drivers");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/pages/availableDriverList");
		mav.addObject("driverList", this.driverLocationService.getDriverLocationInfosByPosition(c, pc));
		return mav;
	}
}
