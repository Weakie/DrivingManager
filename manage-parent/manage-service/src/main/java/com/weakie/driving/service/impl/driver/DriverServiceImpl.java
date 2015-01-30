package com.weakie.driving.service.impl.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.weakie.driving.model.ConsumeInfo;
import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.service.driver.DriverService;
import com.weakie.driving.utils.InvokeResult;
import com.weakie.driving.utils.PageControl;

@Service
public class DriverServiceImpl implements DriverService {

	private DriverDetail detail = new DriverDetail();
	@Override
	public InvokeResult createDriver(DriverDetail driver) {
		this.detail = driver;
		this.detail.setBinding(true);
		return new InvokeResult();
	}

	@Override
	public InvokeResult updateDriver(DriverDetail driver) {
		this.detail = driver;
		return new InvokeResult();
	}

	@Override
	public InvokeResult deleteDriver(String driverID) {
		this.detail = new DriverDetail();
		return new InvokeResult();
	}

	@Override
	public DriverDetail getDriverInfo(String driverID) {

		return this.detail;
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
		this.detail.setBinding(false);
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
		for (int i = pc.getPageIndex() * pc.getPageNum(); i < pc.getPageIndex() * pc.getPageNum() + pc.getPageNum(); i++) {
			ConsumeInfo info = new ConsumeInfo();
			info.setId("id-" + i);
			info.setAmount(200);
			info.setOpe("消费");
			info.setComment("备注信息");
			info.setTime(new Date());
			infos.add(info);
		}
		pc.setTotalNum(100);
		return infos;
	}

	@Override
	public InvokeResult checkValidate(String field, String value) {
		if (StringUtils.equalsIgnoreCase("ID", field)) {
			if (StringUtils.equalsIgnoreCase("123", value)) {
				return new InvokeResult(false,"工号已经存在");
			}
			return new InvokeResult(true,"工号可以使用");
		} else if (StringUtils.equalsIgnoreCase("PID", field)) {
			if (StringUtils.equalsIgnoreCase("123", value)) {
				return new InvokeResult(false,"身份证号已被使用");
			}
			return new InvokeResult(true,"身份证号可以使用");
		} else if (StringUtils.equalsIgnoreCase("TEL", field)) {
			if (StringUtils.equalsIgnoreCase("123", value)) {
				return new InvokeResult(false,"手机号已被注册");
			}
			return new InvokeResult(true,"手机号可以使用");
		}
		return new InvokeResult();
	}

}
