package com.weakie.driving.mappings;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.weakie.driving.model.driver.DriverType;
import com.weakie.driving.utils.LogUtil;

class DriverTypeMappingLoader extends StaticResourceLoader<DriverType> {

	private static final String MAPPING_DRIVER_TYPE = "driverTypeMapping.properties";
	public DriverTypeMappingLoader() {
		super(MAPPING_DRIVER_TYPE);
	}

	@Override
	public void loadStaticResource() throws IOException {
		Resource r = new ClassPathResource(super.getResourceFileName());
		Properties prop = new Properties();
		prop.load(new InputStreamReader(r.getInputStream()));
		for(DriverType key:DriverType.values()){
			if(!prop.containsKey(key.toString())){
				LogUtil.info("load driverTypeMapping,key="+key, new Exception("key not exist!"));
				continue;
			}
			mapping.put(key, prop.getProperty(key.toString()));
		}
	}

}
