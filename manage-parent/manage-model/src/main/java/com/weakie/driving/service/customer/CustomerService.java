package com.weakie.driving.service.customer;

import java.util.List;

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.utils.PageControl;

public interface CustomerService {

	/**
	 * 根据客户电话获取客户详细信息(创建新订单的时候使用)
	 * @param tel
	 * @return
	 */
	public CustomerDetail getCustomerInfoByTel(String tel);
	
	/**
	 * 获取客户未完成订单ID列表(创建新订单的时候使用)
	 * @param customerID
	 * @return
	 */
	public List<String> getUnresolvedOrderID(String customerID,PageControl pc);
}
