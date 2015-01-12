package com.weakie.driving.service.company;

import java.util.List;
import java.util.Map;

import com.weakie.driving.model.company.CompanyDetail;
import com.weakie.driving.utils.PageControl;

public interface CompanyListService {

	public List<CompanyDetail> getCompany(PageControl p);
	
	public List<CompanyDetail> searchCompany(PageControl p,String q);
	
	public Map<String,String> getCompanyIDNameMapping();
}
