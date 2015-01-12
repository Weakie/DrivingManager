package com.weakie.driving.web.controller.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.company.CompanyListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/companys")
public class CompanyListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/companys");
	}
	
	private CompanyListService companyListService;
	
	@Autowired
	public void setCompanyListService(CompanyListService companyListService) {
		this.companyListService = companyListService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String customerIndex() {
		return "/company/companyIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getCompanys(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/company/pages/companyList");
		mav.addObject("companyList", this.companyListService.getCompany(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchCompanys(@ModelAttribute("pc") PageControl p,@RequestParam("q") String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/company/pages/companyList");
		mav.addObject("companyList", this.companyListService.searchCompany(p, q));
		return mav;
	}
}
