package com.weakie.driving.service.impl.customer;

import java.util.ArrayList;
import java.util.List;

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.model.customer.CustomerType;
import com.weakie.driving.service.customer.CustomerService;
import com.weakie.driving.utils.PageControl;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDetail getCustomerInfoByTel(String tel) {
		return new CustomerDetail("123", "易P米", "补单生成", "13867541234", true, 20, "易米", CustomerType.INDIVIDUAL);
	}

	@Override
	public List<String> getUnresolvedOrderID(String customerID,PageControl pc) {
		List<String> l = new ArrayList<String>();
		for(int i=0;i<10;i++){
			l.add("08921212"+i);
		}
		pc.setTotalNum(100);
		return l;
	}

}
