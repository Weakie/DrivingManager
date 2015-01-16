package com.weakie.driving.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.model.system.sysconfig.BasicConfig;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/sysconfig")
public class SystemConfigController {

	@RequestMapping(method = RequestMethod.GET)
	public String sysConfigIndex() {
		return "/sysconfig/index";
	}
	
	@RequestMapping(value="basic",method = RequestMethod.GET)
	public String basicConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/basic";
	}
	
	@RequestMapping(value="basic",method = RequestMethod.PUT)
	public String basicConfig(BasicConfig basicConfig) {
		
		LogUtil.debug("CarAreaController create area:"+basicConfig);
		return "/sysconfig/pages/basic";
	}
	
	@RequestMapping(value="app",method = RequestMethod.GET)
	public String appConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/app";
	}
	
	@RequestMapping(value="protocol",method = RequestMethod.GET)
	public String protocolConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/protocol";
	}
	
	@RequestMapping(value="invest",method = RequestMethod.GET)
	public String investConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/invest";
	}
	
	@RequestMapping(value="pay",method = RequestMethod.GET)
	public String payConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/pay";
	}
	
	@RequestMapping(value="distribution",method = RequestMethod.GET)
	public String distributionConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("CarAreaController create area:"+null);
		return "/sysconfig/pages/distribution";
	}
	
}
