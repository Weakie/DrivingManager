package com.weakie.driving.web.controller.system.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.system.user.User;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String newCompany(ModelMap model) {
		model.addAttribute("title", "添加新用户");
		model.addAttribute("method", "post");
		return "/system/user/userCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model,User user) {
		model.addAttribute("title", "编辑用户信息");
		model.addAttribute("method", "put");
		model.addAttribute("user", user);
		LogUtil.debug("UserController create user:"+user);
		return "/system/user/userCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updateCustomer(ModelMap model,User user) {
		model.addAttribute("title", "编辑用户信息");
		model.addAttribute("method", "put");
		model.addAttribute("user", user);
		LogUtil.debug("UserController update user:"+user);
		return "/system/user/userCreate";
	}
}
