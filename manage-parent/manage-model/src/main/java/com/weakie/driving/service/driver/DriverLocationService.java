package com.weakie.driving.service.driver;

import java.util.List;

import com.weakie.driving.model.Coordinate;
import com.weakie.driving.model.driver.DriverLocationInfo;
import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.utils.PageControl;

public interface DriverLocationService {

	/**
	 * 获取司机列表信息（按状态分类查询）
	 * @param status
	 * @param p
	 * @return
	 */
	public List<DriverLocationInfo> getDriverLocationInfosByStatus(DriverStatus status,PageControl p);
	
	/**
	 * 获取司机列表信息（按位置查询最近的司机）
	 * @param coordinate
	 * @param p
	 * @return
	 */
	public List<DriverLocationInfo> getDriverLocationInfosByPosition(Coordinate coordinate,PageControl p);
	
	/**
	 * 过滤司机位置信息,留下空闲、工作车、忙碌
	 * @param infos
	 * @return
	 */
	public List<DriverLocationInfo> filterWorkingDriverLocationInfos(List<DriverLocationInfo> infos);
}
