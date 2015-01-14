package com.weakie.driving.web.controller.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.car.CarListService;
import com.weakie.driving.utils.PageControl;


@Controller
@RequestMapping("/cars")
public class CarListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/cars");
	}
	
	private CarListService carListService;
	
	@Autowired
	public void setCarListService(CarListService carListService) {
		this.carListService = carListService;
	}

	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String customerIndex() {
		return "/car/carIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=shuttle")
	public ModelAndView getCarShuttles(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carShuttleList");
		mav.addObject("shuttleList", this.carListService.getCarShuttleList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchCarShuttles(@ModelAttribute("pc") PageControl p,@RequestParam("q")String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carShuttleList");
		mav.addObject("shuttleList", this.carListService.searchCarShuttleList(p, q));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=area")
	public ModelAndView getCarAreas(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carAreaList");
		mav.addObject("areaList", this.carListService.getCarAreaList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type=detail")
	public ModelAndView getCarDetails(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/car/pages/carDetailList");
		mav.addObject("detailList", this.carListService.getCarDetailList(p));
		return mav;
	}
}
