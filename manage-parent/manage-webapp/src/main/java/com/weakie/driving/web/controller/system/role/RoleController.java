package com.weakie.driving.web.controller.system.role;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.system.role.Role;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/role")
public class RoleController {

	@RequestMapping(method = RequestMethod.GET)
	public String newCompany(ModelMap model) {
		model.addAttribute("title", "添加新角色");
		model.addAttribute("method", "post");
		return "/system/role/roleCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model,Role role) {
		model.addAttribute("title", "编辑角色信息");
		model.addAttribute("method", "put");
		model.addAttribute("role", role);
		LogUtil.debug("RoleController create Company:"+role);
		return "/system/role/roleCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updateCustomer(ModelMap model,Role role) {
		model.addAttribute("title", "编辑角色信息");
		model.addAttribute("method", "put");
		model.addAttribute("role", role);
		LogUtil.debug("RoleController update Company:"+role);
		return "/system/role/roleCreate";
	}
}
