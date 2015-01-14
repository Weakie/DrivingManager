package com.weakie.driving.web.controller.car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.utils.PageControl;


@Controller
@RequestMapping("/car/assign")
public class CarAssignController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/car/assign");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String newCarDetail() {
		return "/car/pages/carAssign";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getCarAreas(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carAssignList");
		mav.addObject("assignList", null);
		return mav;
	}
}
