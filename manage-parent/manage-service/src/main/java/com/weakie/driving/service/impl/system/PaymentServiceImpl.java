package com.weakie.driving.service.impl.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.payment.Pay;
import com.weakie.driving.model.system.payment.PayType;
import com.weakie.driving.model.system.payment.Payment;
import com.weakie.driving.model.system.payment.Period;
import com.weakie.driving.service.system.PaymentService;
import com.weakie.driving.utils.PageControl;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Map<String, String> getPaymentIDNameMapping() {
		Map<String,String> payment = new HashMap<String,String>();
		payment.put("111", "35开");
		payment.put("222", "20开");
		return payment;
	}

	@Override
	public List<Payment> getPaymentList(PageControl p) {
		List<Payment> ps = new ArrayList<Payment>();
		for(int i=0;i<10;i++){
			Pay pp1 = new Pay(PayType.percent,50);
			Pay pp2 = new Pay(PayType.fixed,30);
			Period p1 = new Period("08-00","17-59",pp1);
			Period p2 = new Period("18-00","07-59",pp2);
			List<Period> period = new ArrayList<Period>();
			period.add(p1);
			period.add(p2);
			Payment pay = new Payment("001"+i,"易米",period);
			ps.add(pay);
		}
		p.setTotalNum(100);
		return ps;
	}

	@Override
	public List<Payment> searchPaymentList(PageControl p, String q) {
		return this.getPaymentList(p);
	}

}
