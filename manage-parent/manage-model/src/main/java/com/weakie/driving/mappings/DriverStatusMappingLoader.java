package com.weakie.driving.mappings;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.utils.LogUtil;

class DriverStatusMappingLoader extends StaticResourceLoader {

	private static final String MAPPING_DRIVER_STATUS = "driverStatusMapping.properties";
	public DriverStatusMappingLoader() {
		super(MAPPING_DRIVER_STATUS);
	}

	@Override
	public void loadStaticResource() throws IOException {
		Resource r = new ClassPathResource(super.getResourceFileName());
		Properties prop = new Properties();
		prop.load(new InputStreamReader(r.getInputStream()));
		
		for(DriverStatus key:DriverStatus.values()){
			if(!prop.containsKey(key.toString())){
				LogUtil.info("load driverStatusMapping,key="+key, new Exception("key not exist!"));
				continue;
			}
			mapping.put(key.toString(), prop.getProperty(key.toString()));
		}
	}

}
