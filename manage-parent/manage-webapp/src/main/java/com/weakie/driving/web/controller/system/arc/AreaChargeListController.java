package com.weakie.driving.web.controller.system.arc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.system.AreaChargeListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/arcs")
public class AreaChargeListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/arcs");
	}
	
	private AreaChargeListService arcListService;
	@Autowired
	public void setArcListService(AreaChargeListService arcListService) {
		this.arcListService = arcListService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String arcIndex() {
		return "/system/arc/arcIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getArcs(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/arc/pages/arcList");
		mav.addObject("arcList", this.arcListService.getAreaChargeList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchArcs(@ModelAttribute("pc") PageControl p,@RequestParam("q") String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/arc/pages/arcList");
		mav.addObject("arcList", this.arcListService.searchAreaChargeList(p, q));
		return mav;
	}
}
