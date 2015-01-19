package com.weakie.driving.web.controller.system.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.weakie.driving.service.system.UserListService;
import com.weakie.driving.utils.PageControl;

@Controller
@RequestMapping("/users")
public class UserListController {

	@ModelAttribute("pc")
	public PageControl getPageControl(){
		return new PageControl("/users");
	}
	
	private UserListService userListService;
	@Autowired
	public void setUserListService(UserListService userListService) {
		this.userListService = userListService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = { "!type", "!q" })
	public String userIndex() {
		return "/system/user/userIndex";
	}

	@RequestMapping(method = RequestMethod.GET, params = "type")
	public ModelAndView getUsers(@ModelAttribute("pc") PageControl p) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/user/pages/userList");
		mav.addObject("userList", this.userListService.getUserList(p));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "q")
	public ModelAndView searchUsers(@ModelAttribute("pc") PageControl p,@RequestParam("q") String q) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/system/user/pages/userList");
		mav.addObject("userList", this.userListService.searchUserList(p, q));
		return mav;
	}
}
