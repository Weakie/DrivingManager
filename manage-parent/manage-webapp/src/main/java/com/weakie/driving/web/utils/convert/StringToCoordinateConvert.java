package com.weakie.driving.web.utils.convert;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.core.convert.converter.Converter;

import com.weakie.driving.model.Coordinate;

public class StringToCoordinateConvert implements Converter<String, Coordinate> {

	/**
	 * source:(x,y)
	 */
	@Override
	public Coordinate convert(String source) {
		if(StringUtils.isNotEmpty(source)){
			String body = StringUtils.substringBetween(source, "(", ")");
			String[] numbers = StringUtils.split(body, ',');
			double a = NumberUtils.toDouble(numbers[0]);
			double b = NumberUtils.toDouble(numbers[1]);
			return new Coordinate(a,b);
		}
		return new Coordinate();
	}


}
