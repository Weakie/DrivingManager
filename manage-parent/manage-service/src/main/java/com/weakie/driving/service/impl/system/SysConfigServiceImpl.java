package com.weakie.driving.service.impl.system;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.system.sysconfig.APPConfig;
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

	@Override
	public APPConfig getAPPConfig() {
		return new APPConfig(false,25,true,false,true,false,true,25,"哈哈哈");
	}

	@Override
	public void putAPPConfig(APPConfig config) {
		LogUtil.debug(config);
	}

	@Override
	public String getProtocol() {
		return "代价协议信息";
	}

	@Override
	public void putProtocol(String p) {
		LogUtil.debug(p);
	}

	@Override
	public String getInvest() {
		return "招商信息";
	}

	@Override
	public void putInvest(String invest) {
		LogUtil.debug(invest);
	}

	@Override
	public double getDistance() {
		return 2.6;
	}

	@Override
	public void putDistance(double d) {
		LogUtil.debug(d);
	}

}
