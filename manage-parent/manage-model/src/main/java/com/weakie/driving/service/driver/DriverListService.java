package com.weakie.driving.service.driver;

import java.util.List;
import java.util.Map;

import com.weakie.driving.model.driver.DriverProfile;
import com.weakie.driving.utils.PageControl;

public interface DriverListService {

	public List<DriverProfile> getAllApprovedDrivers(PageControl p);
	
	public List<DriverProfile> getBalanceUnderDrivers(PageControl p,int num);
	
	public List<DriverProfile> getFreezedDrivers(PageControl p);
	
	public List<DriverProfile> getUnApprovedDrivers(PageControl p);
	
	public List<DriverProfile> searchDrivers(PageControl p,String q);
	
	public Map<String,String> getDriverIDNameMapping();
}
