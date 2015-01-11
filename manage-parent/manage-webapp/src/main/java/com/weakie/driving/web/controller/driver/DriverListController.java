package com.weakie.driving.web.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.driver.DriverListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/drivers")
public class DriverListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/drivers");
	}
	
	private DriverListService driverListService;
	
	@Autowired
	public void setDriverListService(DriverListService driverListService) {
		this.driverListService = driverListService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String driverIndex() {
		return "/driver/driverIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=all")
	public ModelAndView getAllDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.getAllApprovedDrivers(p));
		p.setTotalNum(100);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=balance")
	public ModelAndView getBalanceInsufficientDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("script", "script");
		mav.addObject("driverList", this.driverListService.getBalanceUnderDrivers(p, 200));
		p.setTotalNum(100);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=freeze")
	public ModelAndView getFreezedDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.getFreezedDrivers(p));
		p.setTotalNum(100);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=unapproved")
	public ModelAndView getUnapprovedDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.getUnApprovedDrivers(p));
		p.setTotalNum(100);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchDrivers(@RequestParam("q") String q, @ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.searchDrivers(p, q));
		p.setTotalNum(100);
		return mav;
	}
}
