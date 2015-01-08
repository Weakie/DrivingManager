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
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=balance")
	public ModelAndView getBalanceInsufficientDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("script", "script");
		mav.addObject("driverList", this.driverListService.getBalanceUnderDrivers(p, 200));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=freeze")
	public ModelAndView getFreezedDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.getFreezedDrivers(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=unapproved")
	public ModelAndView getUnapprovedDrivers(@ModelAttribute("pc") PageControl p){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/driverList");
		mav.addObject("driverList", this.driverListService.getUnApprovedDrivers(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchDrivers(@RequestParam("q") String q, @ModelAttribute("pc") PageControl p) {
		return null;
	}
	
	@RequestMapping(value="/call",method = RequestMethod.GET)
	public ModelAndView getDriverCallRecords(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/driver/pages/callRecords");
		mav.addObject("callRecords", this.driverListService.getDriverCallRecords(p));
		return mav;
	}
}
