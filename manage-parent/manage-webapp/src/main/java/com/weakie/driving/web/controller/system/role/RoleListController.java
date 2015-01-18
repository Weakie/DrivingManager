package com.weakie.driving.web.controller.system.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.system.RoleListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/roles")
public class RoleListController {
	
	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/roles");
	}
	
	private RoleListService roleListService;
	@Autowired
	public void setRoleListService(RoleListService roleListService) {
		this.roleListService = roleListService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String customerIndex() {
		return "/system/role/roleIndex";
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getCompanys(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/role/pages/roleList");
		mav.addObject("roleList", this.roleListService.getRoleList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchCompanys(@ModelAttribute("pc") PageControl p,@RequestParam("q") String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/role/pages/roleList");
		mav.addObject("roleList", this.roleListService.searchRoleList(p, q));
		return mav;
	}
}
