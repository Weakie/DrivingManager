package com.weakie.driving.service.system;

import com.weakie.driving.model.system.sysconfig.BasicConfig;

public interface SysConfigService {

	public BasicConfig getBasicConfig();
	public void putBasicConfig(BasicConfig config);
}
