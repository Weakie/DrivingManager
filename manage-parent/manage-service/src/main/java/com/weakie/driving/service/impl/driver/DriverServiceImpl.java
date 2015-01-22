package com.weakie.driving.service.impl.driver;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.service.driver.DriverService;
import com.weakie.driving.utils.InvokeResult;

@Service
public class DriverServiceImpl implements DriverService {

	@Override
	public InvokeResult createDriver(DriverDetail driver) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult updateDriver(DriverDetail driver) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult deleteDriver(String driverID) {
		
		return new InvokeResult();
	}

	@Override
	public DriverDetail getDriverInfo(String driverID) {
		
		return new DriverDetail();
	}

	@Override
	public InvokeResult blockDriver(String driverID, boolean block) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult changeDriverPwd(String diverID, String pwd) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult rechargeDriver(String driverID, double value) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult unbindDriverTel(String driverID) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult offlineDriver(String driverID) {
		
		return new InvokeResult();
	}

	@Override
	public InvokeResult verifyDriver(String driverID, boolean value) {
		
		return new InvokeResult();
	}

}
