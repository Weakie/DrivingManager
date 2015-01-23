package com.weakie.driving.service.company;

import com.weakie.driving.model.company.CompanyDetail;
import com.weakie.driving.utils.InvokeResult;

public interface CompanyService {
	
	public InvokeResult createCompany(CompanyDetail detail);

	public InvokeResult updateCompany(CompanyDetail company);

	public InvokeResult deleteCompany(String companyID);

	public CompanyDetail getCompanyInfo(String companyID);
}
