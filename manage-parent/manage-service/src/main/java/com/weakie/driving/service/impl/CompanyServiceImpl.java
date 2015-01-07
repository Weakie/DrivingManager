package com.weakie.driving.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weakie.driving.service.company.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Override
	public Map<String, String> getCompanyIDNameMapping() {
		Map<String,String> company = new HashMap<String,String>();
		company.put("111", "易米一");
		company.put("222", "易米二");
		return company;
	}

}
