package com.weakie.driving.service.impl.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.company.CompanyDetail;
import com.weakie.driving.service.company.CompanyListService;
import com.weakie.driving.utils.PageControl;

@Service
public class CompanyListServiceImpl implements CompanyListService{

	@Override
	public Map<String, String> getCompanyIDNameMapping() {
		Map<String,String> company = new HashMap<String,String>();
		company.put("111", "易米一");
		company.put("222", "易米二");
		return company;
	}

	@Override
	public List<CompanyDetail> getCompany(PageControl p) {
		List<CompanyDetail> details = new ArrayList<CompanyDetail>();
		for(int i=0;i<10;i++){
			CompanyDetail detail = new CompanyDetail("001"+i+(p.getPageIndex()-1)*p.getPageNum(),"成都","SBI创业街",new Coordinate(100,100),"成都易米网络科技有限公司"
					,"易米","4000028393","马青山","18683333373","12421","aaa@gmail.com",100,"400-129201","备注","");
			details.add(detail);
		}
		p.setTotalNum(100);
		return details;
	}

	@Override
	public List<CompanyDetail> searchCompany(PageControl p,String q) {
		List<CompanyDetail> details = new ArrayList<CompanyDetail>();
		for(int i=0;i<10;i++){
			CompanyDetail detail = new CompanyDetail("001"+i+(p.getPageIndex()-1)*p.getPageNum(),"成都","SBI创业街",new Coordinate(100,100),"成都易米网络科技有限公司"
					,"易米","4000028393","马青山","18683333373","12421","aaa@gmail.com",100,"400-129201","备注","");
			details.add(detail);
		}
		p.setTotalNum(100);
		return details;
	}

}
