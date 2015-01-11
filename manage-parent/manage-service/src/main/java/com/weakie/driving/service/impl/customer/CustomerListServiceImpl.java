package com.weakie.driving.service.impl.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.model.customer.CustomerType;
import com.weakie.driving.service.customer.CustomerListService;
import com.weakie.driving.utils.PageControl;

@Service
public class CustomerListServiceImpl implements CustomerListService {
	
	@Override
	public List<CustomerDetail> getIndividualCustomer(PageControl p) {
		List<CustomerDetail> details = new ArrayList<CustomerDetail>();
		for(int i=0;i<10;i++){
			details.add(new CustomerDetail("123"+i,"易米"+i,"补单生成","13867541234"+i,true,20,"易米",CustomerType.INDIVIDUAL));
		}
		p.setTotalNum(100);
		return details;
	}

	@Override
	public List<CustomerDetail> getEnterpriseCustomer(PageControl p) {
		List<CustomerDetail> details = new ArrayList<CustomerDetail>();
		for(int i=0;i<10;i++){
			details.add(new CustomerDetail("234"+i,"易米"+i,"补单生成","13867541234"+i,true,20,"易米",CustomerType.ENTERPRISE));
		}
		p.setTotalNum(100);
		return details;
	}

	@Override
	public List<CustomerDetail> getVIPCustomer(PageControl p) {
		List<CustomerDetail> details = new ArrayList<CustomerDetail>();
		for(int i=0;i<10;i++){
			details.add(new CustomerDetail("345"+i,"易米"+i,"补单生成","13867541234"+i,true,20,"易米",CustomerType.VIP));
		}
		p.setTotalNum(100);
		return details;
	}

	@Override
	public List<CustomerDetail> searchCustomer(PageControl p, String q) {
		List<CustomerDetail> details = new ArrayList<CustomerDetail>();
		for(int i=0;i<10;i++){
			details.add(new CustomerDetail("121"+i,"易米"+i,"补单生成","13867541234"+i,true,20,"易米",CustomerType.INDIVIDUAL));
		}
		p.setTotalNum(100);
		return details;
	}

}
