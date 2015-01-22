package com.weakie.driving.service.driver;

import com.weakie.driving.model.driver.DriverDetail;
import com.weakie.driving.utils.InvokeResult;

public interface DriverService {

	public InvokeResult createDriver(DriverDetail driver);
	
	public InvokeResult updateDriver(DriverDetail driver);
	
	public InvokeResult deleteDriver(String driverID);
	
	public DriverDetail getDriverInfo(String driverID);
	
	/**
	 * 是否冻结司机
	 * @param driverID
	 * @param block
	 * @return
	 */
	public InvokeResult blockDriver(String driverID,boolean block);
	
	/**
	 * 修改司机密码
	 * @param diverID
	 * @param pwd
	 * @return
	 */
	public InvokeResult changeDriverPwd(String diverID,String pwd);
	
	/**
	 * 为司机充值
	 * @param driverID
	 * @param value
	 * @return
	 */
	public InvokeResult rechargeDriver(String driverID,double value);
	
	/**
	 * 解绑司机电话
	 * @param driverID
	 * @return
	 */
	public InvokeResult unbindDriverTel(String driverID);
	
	/**
	 * 司机下线
	 * @param driverID
	 * @return
	 */
	public InvokeResult offlineDriver(String driverID);
	
	/**
	 * 审核司机信息
	 * @param driverID
	 * @param value
	 * @return
	 */
	public InvokeResult verifyDriver(String driverID,boolean value);
}
