package com.weakie.driving.service.impl.system;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.sysconfig.BasicConfig;
import com.weakie.driving.model.system.sysconfig.DebitedPeriod;
import com.weakie.driving.service.system.SysConfigService;
import com.weakie.driving.utils.LogUtil;

@Service
public class SysConfigServiceImpl implements SysConfigService {

	@Override
	public BasicConfig getBasicConfig() {
		return new BasicConfig("08:30",DebitedPeriod.ACCEPTING,20,120,false,"www.easymi.com");
	}

	@Override
	public void putBasicConfig(BasicConfig config) {
		LogUtil.debug(config);
	}

}
