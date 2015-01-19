package com.weakie.driving.model.system.arc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class AreaChargeTest {

	@Test
	public void test() throws IOException {
		List<Price> prices = new ArrayList<Price>();
		List<MileagePrice> pp = new ArrayList<MileagePrice>();
		MileagePrice mp11 = new MileagePrice(0,3,0);
		MileagePrice mp12 = new MileagePrice(3,5,10);
		pp.add(mp11);
		pp.add(mp12);
		RegularIncrease ri = new RegularIncrease();
		Price p1 = new Price("00-01","08-00",38,pp,ri);
		Price p2 = new Price("00-01","08-00",58,pp,ri);
		prices.add(p1);
		prices.add(p2);
		AreaCharge arc = new AreaCharge("上海市","上海市收费标准",prices);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
		jsonGenerator.writeObject(arc);
		
		String s = objectMapper.writeValueAsString(arc);
		System.out.println("\n"+s);
	}

}
