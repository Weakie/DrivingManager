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
import com.weakie.driving.model.orders.OrderCreating;
import com.weakie.driving.model.orders.OrderProfile;
import com.weakie.driving.service.customer.CustomerService;
import com.weakie.driving.service.driver.DriverLocationService;
import com.weakie.driving.service.order.OrderListService;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;

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
	public String newOrder(OrderCreating order) {
		LogUtil.info("OrderController create new Order:" + order);
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
		return new CustomerProfile(detail);
	}

	/**
	 * 获取客户未完成订单
	 * 
	 * @param customerID
	 * @return
	 */
	@RequestMapping(value = "/customer/orders/{customerID}", method = RequestMethod.GET)
	public ModelAndView showUnresolvedOrder(@PathVariable("customerID") String customerID, @ModelAttribute("pc") PageControl pc) {
		ModelAndView mav = new ModelAndView();
		// TODO
		/**
		 * 获取客户未完成订单ID列表,获取相应的订单Profile信息,组成Lst返回,用于创建新订单时客户未完成订单显示
		 */
		List<String> orderID = this.customerService.getUnresolvedOrderID(customerID,pc);
		List<OrderProfile> orders = this.orderListService.getOrderProfileByOrderID(orderID);
		mav.addObject("orderList", orders);
		mav.setViewName("/order/pages/incompletedOrderList");
		return mav;
	}

	/**
	 * 获取可以派单的司机
	 * 
	 * @param c
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/drivers", method = RequestMethod.GET)
	public ModelAndView getAvailableDriven(@RequestParam("coordinate") Coordinate c, @ModelAttribute("pc") PageControl pc) {
		LogUtil.debug("Invoke OrderController.getAvailableDriven():" + c);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/pages/availableDriverList");
		mav.addObject("driverList", this.driverLocationService.getDriverLocationInfosByPosition(c, pc));
		return mav;
	}

	/**
	 * 客户信息,创建订单的时候使用
	 * 
	 * @author weakie,lin
	 */
	public static class CustomerProfile {
		private String tel;
		private String name;
		private String id;
		private String type;
		private double balance;
		private int allAmount;
		private int monthAmount;

		public CustomerProfile(CustomerDetail detail) {
			this.tel = detail.getTel();
			this.name = detail.getName();
			this.id = detail.getId();
			// TODO 修改客户类型为中文
			this.type = detail.getType().toString();
			this.balance = detail.getBalance();
			this.allAmount = detail.getAllAmount();
			this.monthAmount = detail.getMonthAmount();
		}

		public String getTel() {
			return tel;
		}

		public String getName() {
			return name;
		}

		public String getId() {
			return id;
		}

		public String getType() {
			return type;
		}

		public double getBalance() {
			return balance;
		}

		public int getAllAmount() {
			return allAmount;
		}

		public int getMonthAmount() {
			return monthAmount;
		}
	}
}
