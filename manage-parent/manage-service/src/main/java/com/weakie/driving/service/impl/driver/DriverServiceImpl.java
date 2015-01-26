package com.weakie.driving.service.impl.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.weakie.driving.model.ConsumeInfo;
import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.service.driver.DriverService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.PageControl;

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

	@Override
	public List<ConsumeInfo> getConsmeHistory(String driverID, PageControl pc) {
		List<ConsumeInfo> infos = new ArrayList<ConsumeInfo>();
		for(int i=pc.getPageIndex()*pc.getPageNum();i<pc.getPageIndex()*pc.getPageNum()+pc.getPageNum();i++){
			ConsumeInfo info = new ConsumeInfo();
			info.setId("id-"+i);
			info.setAmount(200);
			info.setOpe("消费");
			info.setComment("备注信息");
			info.setTime(new Date());
			infos.add(info);
		}
		pc.setTotalNum(100);
		return infos;
	}

}
