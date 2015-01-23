package com.weakie.driving.service.impl.company;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.company.CompanyDetail;
import com.weakie.driving.service.company.CompanyService;
import com.weakie.driving.utils.InvokeResult;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public InvokeResult createCompany(CompanyDetail detail) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult updateCompany(CompanyDetail company) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult deleteCompany(String companyID) {
		
		return new InvokeResult();
	}

	@Override
	public CompanyDetail getCompanyInfo(String companyID) {
		CompanyDetail detail = new CompanyDetail("001","成都","SBI创业街",new Coordinate(100,100),"成都易米网络科技有限公司"
				,"易米","4000028393","马青山","18683333373","12421","aaa@gmail.com",100,"400-129201","备注","");
		return detail;
	}

}
