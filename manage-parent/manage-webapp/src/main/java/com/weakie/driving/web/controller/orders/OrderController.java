package com.weakie.driving.web.controller.orders;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.order.OrderService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.web.json.OpeResult;

/**
 * 订单详细操作
 * @author weakie,lin
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	private OrderService orderService;

	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	/**
	 * 查看订单详情
	 * 
	 * @param orderID
	 * @return
	 */
	@RequestMapping(value = "/{orderID}", method = RequestMethod.GET)
	public ModelAndView showDetail(@PathVariable("orderID") String orderID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/order/orderDetail");
		mav.addObject("order", this.orderService.getOrderDetailByOrderID(orderID));
		return mav;
	}

	/**
	 * 销单,收回,强制销单,强制收回
	 * 
	 * @param orderID
	 * @param state
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{orderID}", method = RequestMethod.PUT, params = "state")
	public OpeResult updateOrderState(@PathVariable("orderID") String orderID, @RequestParam("state") String state) {
		LogUtil.info("updateOrderState " + orderID + ", "+state);
		if(StringUtils.equals("destroy", state)){
			InvokeResult ir = this.orderService.destroyOrder(orderID);
			return new OpeResult(ir, "销单-订单号:" + orderID);
		}else if(StringUtils.equals("retrieve", state)){
			InvokeResult ir = this.orderService.retrieveOrder(orderID);
			return new OpeResult(ir, "收回-订单号:" + orderID);
		}
		return new OpeResult(OpeResult.RES_FAIL, "订单号:" + orderID, "不支持此操作");
	}

	/**
	 * 添加备注信息
	 * 
	 * @param orderID
	 * @param comment
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{orderID}", method = RequestMethod.PUT, params = "comment")
	public OpeResult commentOrder(@PathVariable("orderID") String orderID, @RequestParam("comment") String comment) {
		LogUtil.info("commentOrder :" + orderID + " ,cmt:" + comment);
		InvokeResult ir = this.orderService.commentOrder(orderID, comment);
		return new OpeResult(ir, "备注修改-订单号:" + orderID);
	}
	
	/**
	 * 实收金额修改
	 * 
	 * @param orderID
	 * @param comment
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{orderID}", method = RequestMethod.PUT, params = "amount")
	public OpeResult updateOrderRealAmount(@PathVariable("orderID") String orderID, @RequestParam("amount") String amount) {
		LogUtil.info("updateOrderRealAmount :" + orderID + " ,amt:" + amount);
		try{
			double amt = Double.parseDouble(amount);
			InvokeResult ir = this.orderService.updateRealAmount(orderID, amt);
			return new OpeResult(ir, "实收金额修改-订单号:" + orderID);
		}catch(NumberFormatException e){
			return new OpeResult(OpeResult.RES_FAIL, "订单号:" + orderID, "请输入一个数字");
		}
	}
}
