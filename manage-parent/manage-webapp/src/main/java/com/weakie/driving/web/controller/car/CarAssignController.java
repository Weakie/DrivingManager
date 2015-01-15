package com.weakie.driving.web.controller.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.model.car.CarDetail;
import com.weakie.driving.service.driver.DriverListService;
import com.weakie.driving.utils.PageControl;


@Controller
@RequestMapping("/car/assign")
public class CarAssignController {

	private DriverListService driverListService;
	
	@Autowired
	public void setDriverListService(DriverListService driverListService) {
		this.driverListService = driverListService;
	}

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/car/assign");
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "id")
	public ModelAndView getCarAssigns(@ModelAttribute("pc") PageControl p,@RequestParam("id")String id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carAssignList");
		mav.addObject("assignList", null);
		return mav;
	}
	
	@RequestMapping(value="/{carID}",method = RequestMethod.GET)
	public ModelAndView updateCarAssign(@PathVariable("carID")String carID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carAssign");
		CarDetail detail = new CarDetail();
		detail.setCarNumber("云A45518");
		detail.setId("110");
		mav.addObject("carDetail", detail);
		mav.addObject("driverMap", this.driverListService.getDriverIDNameMapping());
		return mav;
	}
	
}
