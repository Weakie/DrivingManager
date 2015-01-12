package com.weakie.driving.web.controller.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.weakie.driving.utils.LogUtil;

import com.weakie.driving.model.company.CompanyDetail;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@ModelAttribute("cityList")
	public List<String> getCityList(){
		List<String> citysList = new ArrayList<String>();
		citysList.add("成都市");
		citysList.add("上海市");
		return citysList;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String newCompany(ModelMap model) {
		model.addAttribute("title", "添加新公司");
		model.addAttribute("method", "post");
		return "/company/companyCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model,CompanyDetail company) {
		model.addAttribute("title", "编辑公司信息");
		model.addAttribute("method", "put");
		model.addAttribute("company", company);
		LogUtil.debug("CompanyController create Company:"+company);
		return "/company/companyCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updateCustomer(ModelMap model,CompanyDetail company) {
		model.addAttribute("title", "编辑公司信息");
		model.addAttribute("method", "put");
		model.addAttribute("company", company);
		LogUtil.debug("CompanyController update Company:"+company);
		return "/company/companyCreate";
	}
	
	
}
