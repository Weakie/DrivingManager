package com.weakie.driving.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weakie.driving.service.system.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Map<String, String> getPaymentIDNameMapping() {
		Map<String,String> payment = new HashMap<String,String>();
		payment.put("111", "35开");
		payment.put("222", "20开");
		return payment;
	}

}
