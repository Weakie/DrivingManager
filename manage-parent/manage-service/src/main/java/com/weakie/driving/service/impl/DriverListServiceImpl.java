package com.weakie.driving.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.driver.DriverProfile;
import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.model.driver.DriverType;
import com.weakie.driving.service.driver.DriverListService;
import com.weakie.driving.utils.PageControl;

@Service
public class DriverListServiceImpl implements DriverListService {

	private DriverProfile profile = new DriverProfile();
	
	private List<DriverProfile> list= new ArrayList<DriverProfile>();
	public DriverListServiceImpl(){
		this.profile.setDriverID("easymi");
		this.profile.setNickName("易米");
		this.profile.setRealName("易米");
		this.profile.setIdentity("330990123402101123");
		this.profile.setSex(true);
		this.profile.setTelephone("18721905532");
		this.profile.setLicenseTime(new Date());
		this.profile.setType(DriverType.PARTTIME);
		this.profile.setCompanyName("易米");
		this.profile.setRegisteTime(new Date());
		this.profile.setBalance(20);
		this.profile.setVersion("1.2.1");
		this.profile.setState(DriverStatus.ACCEPT);
		for(int i=0;i<10;i++){
			this.list.add(profile);
		}
	}
	@Override
	public List<DriverProfile> getAllApprovedDrivers(PageControl p) {
		return list;
	}

	@Override
	public List<DriverProfile> getBalanceUnderDrivers(PageControl p, int num) {
		p.setTotalNum(200);
		return list;
	}

	@Override
	public List<DriverProfile> getFreezedDrivers(PageControl p) {
		return list;
	}

	@Override
	public List<DriverProfile> getUnApprovedDrivers(PageControl p) {
		return list;
	}

	@Override
	public List<DriverProfile> searchDrivers(PageControl p, String q) {
		return list;
	}

	@Override
	public Map<String, String> getDriverIDNameMapping() {
		return Collections.emptyMap();
	}

}
