package com.weakie.driving.service.customer;

import java.util.List;

import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.utils.PageControl;

public interface CustomerListService {

	public List<CustomerDetail> getIndividualCustomer(PageControl p);
	
	public List<CustomerDetail> getEnterpriseCustomer(PageControl p);
	
	public List<CustomerDetail> getVIPCustomer(PageControl p);
	
	public List<CustomerDetail> searchCustomer(PageControl p,String q);
}
