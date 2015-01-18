package com.weakie.driving.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weakie.driving.mappings.StaticMappingCollections;
import com.weakie.driving.model.system.sysconfig.APPConfig;
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

	//index
	@ModelAttribute("panel")
	private int getShowedPanel(){
		return 0;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String sysConfigIndex(ModelMap model) {
		return "/sysconfig/index";
	}
	
	//basic
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
		model.addAttribute("panel", 0);
		LogUtil.debug("SystemConfigController update basic:"+basicConfig);
		return "/sysconfig/index";
	}
	
	//app
	@RequestMapping(value="app",method = RequestMethod.GET)
	public String appConfig(ModelMap model) {
		model.addAttribute("app", this.sysConfigService.getAPPConfig());
		LogUtil.debug("SystemConfigController return app.");
		return "/sysconfig/pages/app";
	}
	
	@RequestMapping(value="app",method = RequestMethod.PUT)
	public String appConfig(ModelMap model,APPConfig appConfig) {
		this.sysConfigService.putAPPConfig(appConfig);
		model.addAttribute("panel", 1);
		LogUtil.debug("SystemConfigController update app:"+appConfig);
		return "/sysconfig/index";
	}
	
	//protocol
	@RequestMapping(value="protocol",method = RequestMethod.GET)
	public String protocolConfig(ModelMap model) {
		model.addAttribute("protocol", this.sysConfigService.getProtocol());
		LogUtil.debug("SystemConfigController return protocol.");
		return "/sysconfig/pages/protocol";
	}
	
	@RequestMapping(value="protocol",method = RequestMethod.PUT)
	public String protocolConfig(ModelMap model,String protocol) {
		this.sysConfigService.putProtocol(protocol);
		model.addAttribute("panel", 2);
		LogUtil.debug("SystemConfigController update protocol:"+protocol);
		return "/sysconfig/index";
	}
	
	//invest
	@RequestMapping(value="invest",method = RequestMethod.GET)
	public String investConfig(ModelMap model) {
		model.addAttribute("invest", this.sysConfigService.getInvest());
		LogUtil.debug("SystemConfigController return invest.");
		return "/sysconfig/pages/invest";
	}
	
	@RequestMapping(value="invest",method = RequestMethod.PUT)
	public String investConfig(ModelMap model,String invest) {
		this.sysConfigService.putInvest(invest);
		model.addAttribute("panel", 3);
		LogUtil.debug("SystemConfigController update invest:"+invest);
		return "/sysconfig/index";
	}
	
	//pay
	@RequestMapping(value="pay",method = RequestMethod.GET)
	public String payConfig(ModelMap model) {
		model.addAttribute("area", null);
		LogUtil.debug("SystemConfigController create area:"+null);
		return "/sysconfig/pages/pay";
	}
	
	//distribution
	@RequestMapping(value="distribution",method = RequestMethod.GET)
	public String distributionConfig(ModelMap model) {
		model.addAttribute("distance", this.sysConfigService.getDistance());
		LogUtil.debug("SystemConfigController return distance.");
		return "/sysconfig/pages/distribution";
	}
	
	@RequestMapping(value="distribution",method = RequestMethod.PUT)
	public String distributionConfig(ModelMap model,String distance) {
		try{
			double d = Double.parseDouble(distance);
			this.sysConfigService.putDistance(d);
		}catch(Exception e){
			LogUtil.error("SystemConfigController update distance.",e);
		}
		model.addAttribute("panel", 5);
		LogUtil.debug("SystemConfigController update distance:"+distance);
		return "/sysconfig/index";
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
