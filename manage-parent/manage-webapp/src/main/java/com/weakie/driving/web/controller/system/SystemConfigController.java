package com.weakie.driving.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.mappings.StaticMappingCollections;
import com.weakie.driving.model.system.sysconfig.BasicConfig;
import com.weakie.driving.service.system.SysConfigService;
import com.weakie.driving.utils.LogUtil;

@Controller
@RequestMapping("/sysconfig")
public class SystemConfigController {

	private SysConfigService sysConfigService;
	
	@Autowired
	public void setSysConfigService(SysConfigService sysConfigService) {
		this.sysConfigService = sysConfigService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String sysConfigIndex(ModelMap model,Integer panel) {
		if(panel == null){
			panel = new Integer(0);
		}
		model.addAttribute("panel", panel);
		return "/sysconfig/index";
	}
	
	@RequestMapping(value="basic",method = RequestMethod.GET)
	public String basicConfig(ModelMap model) {
		model.addAttribute("basic", this.sysConfigService.getBasicConfig());
		model.addAttribute("startTimes", this.generateStartTime());
		model.addAttribute("debPeriods", StaticMappingCollections.getInstance().getDebitedPeroidMapping());
		LogUtil.debug("SystemConfigController return basic.");
		return "/sysconfig/pages/basic";
	}
	
	@RequestMapping(value="basic",method = RequestMethod.PUT)
	public String basicConfig(ModelMap model,BasicConfig basicConfig) {
		this.sysConfigService.putBasicConfig(basicConfig);
		LogUtil.debug("SystemConfigController update basic:"+basicConfig);
		return "redirect:/sysconfig?panel=0";
	}
	
	@RequestMapping(value="app",method = RequestMethod.GET)
	public String appConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/app";
	}
	
	@RequestMapping(value="protocol",method = RequestMethod.GET)
	public String protocolConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/protocol";
	}
	
	@RequestMapping(value="invest",method = RequestMethod.GET)
	public String investConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/invest";
	}
	
	@RequestMapping(value="pay",method = RequestMethod.GET)
	public String payConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/pay";
	}
	
	@RequestMapping(value="distribution",method = RequestMethod.GET)
	public String distributionConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/distribution";
	}
	
	private List<String> generateStartTime(){
		List<String> startTime = new ArrayList<String>();
		for(int i=0;i<24;i++){
			for(int j=0;j<60;j+=15){
				startTime.add((i<10?"0"+i:i)+":"+(j==0?j+"0":j));
			}
		}
		return startTime;
	}
}
