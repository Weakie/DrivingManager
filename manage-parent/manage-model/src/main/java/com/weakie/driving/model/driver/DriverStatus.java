package com.weakie.driving.model.driver;

public enum DriverStatus {

	ALL, 		// 全部
	NONE,		// Invalid
	BUSY,		// 忙碌
	
	
	FREE, 		// 空闲
	DISPATCHED, // 已派单
	ACCEPT, 	// 前往预约地
	WAITING, 	// 等待客户
	DRIVING, 	// 前往目的地
	BACKING, 	// 返程
	OFF, 		// 未上班
	WORKINGCAR;	// 工作车
	
	public static DriverStatus statusMapping(DriverStatus status){
		switch (status) {
		case FREE:
			return FREE;
		case WORKINGCAR:
			return WORKINGCAR;
		case DISPATCHED: // 已派单
		case ACCEPT: 	// 前往预约地
		case WAITING: 	// 等待客户
		case DRIVING: 	// 前往目的地
		case BACKING: 	// 返程
			return BUSY;
		default:
			return NONE;
		}
	}
}
