package com.weakie.driving.service.system;

import com.weakie.driving.model.system.sysconfig.APPConfig;
import com.weakie.driving.model.system.sysconfig.BasicConfig;

public interface SysConfigService {

	public BasicConfig getBasicConfig();
	public void putBasicConfig(BasicConfig config);
	
	public APPConfig getAPPConfig();
	public void putAPPConfig(APPConfig config);
	
	public String getProtocol();
	public void putProtocol(String p);
	
	public String getInvest();
	public void putInvest(String invest);
	
	public double getDistance();
	public void putDistance(double d);
}
