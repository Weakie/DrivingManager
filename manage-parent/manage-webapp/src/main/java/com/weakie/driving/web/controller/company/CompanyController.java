package com.weakie.driving.web.controller.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weakie.driving.model.company.CompanyDetail;
import com.weakie.driving.service.company.CompanyService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.web.json.OpeResult;

@Controller
@RequestMapping("/company")
public class CompanyController {

	private CompanyService companyService;
	
	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	@ModelAttribute("cityList")
	public List<String> getCityList() {
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
	public String newCompany(ModelMap model, CompanyDetail company) {
		// TODO 跳转到指定页面
		this.companyService.createCompany(company);
		LogUtil.debug("CompanyController create Company:" + company);
		return "/company/companyCreate";
	}

	@RequestMapping(value = "/{companyID}", method = RequestMethod.GET)
	public String updateCompany(ModelMap model, @PathVariable("companyID") String companyID) {
		model.addAttribute("title", "编辑公司信息");
		model.addAttribute("method", "put");
		model.addAttribute("companyID", companyID);
		model.addAttribute("company", this.companyService.getCompanyInfo(companyID));
		return "/company/companyCreate";
	}

	@RequestMapping(value = "/{companyID}", method = RequestMethod.PUT)
	public String updateCompany(ModelMap model, @PathVariable("companyID") String companyID, CompanyDetail company) {
		// TODO 跳转到指定页面
		this.companyService.updateCompany(company);
		LogUtil.debug("CompanyController update Company:" + company);
		return "/company/companyCreate";
	}

	/**
	 * 删除公司信息
	 * @param companyID
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{companyID}", method = RequestMethod.DELETE)
	public OpeResult deleteCompany(@PathVariable("companyID") String companyID) {
		LogUtil.info("deleteCompany :" + companyID);
		InvokeResult ir = this.companyService.deleteCompany(companyID);
		return new OpeResult(ir, "删除-公司号:" + companyID);
	}
}
