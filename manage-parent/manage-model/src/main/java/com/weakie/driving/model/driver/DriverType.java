package com.weakie.driving.model.driver;

import org.apache.commons.lang3.StringUtils;

public enum DriverType {

	PARTTIME, FULLTIME;

	@Deprecated
	public static String convertToString(DriverType type) {
		if (type != null) {
			switch (type) {
			case PARTTIME:
				return "兼职";
			case FULLTIME:
				return "全职";
			}
		}
		return StringUtils.EMPTY;
	}
}
