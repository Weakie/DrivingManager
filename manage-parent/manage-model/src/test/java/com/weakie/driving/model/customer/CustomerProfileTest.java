package com.weakie.driving.model.customer;

import java.io.IOException;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class CustomerProfileTest {

	@Test
	public void test() throws IOException {
		CustomerProfile p = new CustomerProfile();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
		jsonGenerator.writeObject(p);
	}

}
