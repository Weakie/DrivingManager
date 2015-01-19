package com.weakie.driving.service.system;

import java.util.List;
import java.util.Map;

import com.weakie.driving.model.system.payment.Payment;
import com.weakie.driving.utils.PageControl;

/**
 * 提成设置
 * @author weakie,lin
 *
 */
public interface PaymentService {

	public Map<String,String> getPaymentIDNameMapping();
	
	public List<Payment> getPaymentList(PageControl p);

	public List<Payment> searchPaymentList(PageControl p, String q);
}
