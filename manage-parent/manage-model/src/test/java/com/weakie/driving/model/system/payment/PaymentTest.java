package com.weakie.driving.model.system.payment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class PaymentTest {

	@Test
	public void test() throws IOException {
		Pay pp1 = new Pay(PayType.percent,50);
		Pay pp2 = new Pay(PayType.fixed,30);
		Period p1 = new Period("08-00","17-59",pp1);
		Period p2 = new Period("18-00","07-59",pp2);
		List<Period> period = new ArrayList<Period>();
		period.add(p1);
		period.add(p2);
		Payment pay = new Payment("001","易米",period);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
		jsonGenerator.writeObject(pay);
		
		String s = objectMapper.writeValueAsString(pay);
		System.out.println("\n"+s);
	}

}
