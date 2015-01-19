package com.weakie.driving.web.controller.system.arc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.system.arc.AreaCharge;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/arc")
public class AreaChargeController {

	@RequestMapping(method = RequestMethod.GET)
	public String newCompany(ModelMap model) {
		model.addAttribute("title", "添加地区收费");
		model.addAttribute("method", "post");
		return "/system/arc/arcCreate";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String newCustomer(ModelMap model,AreaCharge arc) {
		model.addAttribute("title", "编辑地区收费");
		model.addAttribute("method", "put");
		model.addAttribute("arc", arc);
		LogUtil.debug("AreaChargeController create arc:"+arc);
		return "/system/arc/arcCreate";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String updateCustomer(ModelMap model,AreaCharge arc) {
		model.addAttribute("title", "编辑地区收费");
		model.addAttribute("method", "put");
		model.addAttribute("arc", arc);
		LogUtil.debug("AreaChargeController update arc:"+arc);
		return "/system/arc/arcCreate";
	}
}
