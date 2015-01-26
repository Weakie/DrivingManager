package com.weakie.driving.service.impl.customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.weakie.driving.model.ConsumeInfo;
import com.weakie.driving.model.customer.CustomerDetail;
import com.weakie.driving.model.customer.CustomerType;
import com.weakie.driving.service.customer.CustomerService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.PageControl;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDetail getCustomerInfoByTel(String tel) {
		if(StringUtils.equals(tel, "111")){
			return null;
		}
		return new CustomerDetail("123", "易P米", "补单生成", "13867541234", true, 20, "易米", CustomerType.INDIVIDUAL);
	}

	@Override
	public List<String> getUnresolvedOrderID(String customerID,PageControl pc) {
		List<String> l = new ArrayList<String>();
		for(int i=0;i<pc.getPageNum();i++){
			l.add("08921212"+i);
		}
		pc.setTotalNum(100);
		return l;
	}

	@Override
	public InvokeResult createCustomer(String name, String tel) {
		return new InvokeResult();
	}

	@Override
	public InvokeResult createCustomer(CustomerDetail detail) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult updateCustomer(CustomerDetail customer) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult deleteCustomer(String customerID) {
		
		return new InvokeResult();
	}

	@Override
	public CustomerDetail getCustomerInfo(String customerID) {
		
		return new CustomerDetail("123", "易P米", "补单生成", "13867541234", true, 20, "易米", CustomerType.INDIVIDUAL);
	}

	@Override
	public InvokeResult rechargeCustomer(String customerID, double value) {
		
		return new InvokeResult();
	}

	@Override
	public List<ConsumeInfo> getConsmeHistory(String customerID, PageControl pc) {
		List<ConsumeInfo> infos = new ArrayList<ConsumeInfo>();
		for(int i=pc.getPageIndex()*pc.getPageNum();i<pc.getPageIndex()*pc.getPageNum()+pc.getPageNum();i++){
			ConsumeInfo info = new ConsumeInfo();
			info.setId("id-"+i);
			info.setAmount(200);
			info.setOpe("消费");
			info.setComment("备注信息");
			info.setTime(new Date());
			infos.add(info);
		}
		pc.setTotalNum(100);
		return infos;
	}

}
