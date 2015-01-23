package com.weakie.driving.service.impl.driver;

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

	@Override
	public List<DriverProfile> getAllApprovedDrivers(PageControl p) {
		List<DriverProfile> list = new ArrayList<DriverProfile>();
		for (int i = 0; i < 10; i++) {
			DriverProfile profile = new DriverProfile();
			profile.setDriverID("easymi_0"+i+ (p.getPageIndex() - 1) * p.getPageNum());
			profile.setNickName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRealName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setIdentity("330990123402101123");
			profile.setSex(true);
			profile.setTelephone("18721905532");
			profile.setLicenseTime(new Date());
			profile.setType(DriverType.PARTTIME);
			profile.setCompanyName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRegisteTime(new Date());
			profile.setBalance(20);
			profile.setVersion("1.2.1");
			profile.setState(DriverStatus.ACCEPT);
			profile.setBinding(true);
			profile.setOnline(true);
			profile.setVerify(1);
			list.add(profile);
		}
		p.setTotalNum(200);
		return list;
	}

	@Override
	public List<DriverProfile> getBalanceUnderDrivers(PageControl p, int num) {
		List<DriverProfile> list = new ArrayList<DriverProfile>();
		for (int i = 0; i < 10; i++) {
			DriverProfile profile = new DriverProfile();
			profile.setDriverID("easymi_1"+i+ (p.getPageIndex() - 1) * p.getPageNum());
			profile.setNickName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRealName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setIdentity("330990123402101123");
			profile.setSex(true);
			profile.setTelephone("18721905532");
			profile.setLicenseTime(new Date());
			profile.setType(DriverType.PARTTIME);
			profile.setCompanyName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRegisteTime(new Date());
			profile.setBalance(20);
			profile.setVersion("1.2.1");
			profile.setState(DriverStatus.ACCEPT);
			profile.setVerify(1);
			list.add(profile);
		}
		p.setTotalNum(200);
		return list;
	}

	@Override
	public List<DriverProfile> getFreezedDrivers(PageControl p) {
		List<DriverProfile> list = new ArrayList<DriverProfile>();
		for (int i = 0; i < 10; i++) {
			DriverProfile profile = new DriverProfile();
			profile.setDriverID("easymi_2"+i+ (p.getPageIndex() - 1) * p.getPageNum());
			profile.setNickName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRealName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setIdentity("330990123402101123");
			profile.setSex(true);
			profile.setTelephone("18721905532");
			profile.setLicenseTime(new Date());
			profile.setType(DriverType.PARTTIME);
			profile.setCompanyName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRegisteTime(new Date());
			profile.setBalance(20);
			profile.setVersion("1.2.1");
			profile.setState(DriverStatus.ACCEPT);
			profile.setVerify(1);
			profile.setBlocked(true);
			list.add(profile);
		}
		return list;
	}

	@Override
	public List<DriverProfile> getUnApprovedDrivers(PageControl p) {
		List<DriverProfile> list = new ArrayList<DriverProfile>();
		for (int i = 0; i < 10; i++) {
			DriverProfile profile = new DriverProfile();
			profile.setDriverID("easymi_3"+i+ (p.getPageIndex() - 1) * p.getPageNum());
			profile.setNickName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRealName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setIdentity("330990123402101123");
			profile.setSex(true);
			profile.setTelephone("18721905532");
			profile.setLicenseTime(new Date());
			profile.setType(DriverType.PARTTIME);
			profile.setCompanyName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRegisteTime(new Date());
			profile.setBalance(20);
			profile.setVersion("1.2.1");
			profile.setState(DriverStatus.ACCEPT);
			profile.setVerify(-1+(i%2));
			list.add(profile);
		}
		return list;
	}

	@Override
	public List<DriverProfile> searchDrivers(PageControl p, String q) {
		List<DriverProfile> list = new ArrayList<DriverProfile>();
		for (int i = 0; i < 10; i++) {
			DriverProfile profile = new DriverProfile();
			profile.setDriverID("easymi_4"+i+ (p.getPageIndex() - 1) * p.getPageNum());
			profile.setNickName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRealName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setIdentity("330990123402101123");
			profile.setSex(true);
			profile.setTelephone("18721905532");
			profile.setLicenseTime(new Date());
			profile.setType(DriverType.PARTTIME);
			profile.setCompanyName("易+"+(i+ (p.getPageIndex() - 1) * p.getPageNum())+"+米");
			profile.setRegisteTime(new Date());
			profile.setBalance(20);
			profile.setVersion("1.2.1");
			profile.setState(DriverStatus.ACCEPT);
			list.add(profile);
		}
		return list;
	}

	@Override
	public Map<String, String> getDriverIDNameMapping() {
		return Collections.emptyMap();
	}

}
