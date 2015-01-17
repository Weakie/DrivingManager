package com.weakie.driving.mappings;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.weakie.driving.model.system.sysconfig.DebitedPeriod;
import com.weakie.driving.utils.LogUtil;

class DebitedPeroidMappingLoader extends StaticResourceLoader {

	private static final String MAPPING_DEBITED_PERIOD = "debitedPeriodMapping.properties";
	public DebitedPeroidMappingLoader() {
		super(MAPPING_DEBITED_PERIOD);
	}

	@Override
	public void loadStaticResource() throws IOException {
		Resource r = new ClassPathResource(super.getResourceFileName());
		Properties prop = new Properties();
		prop.load(new InputStreamReader(r.getInputStream()));
		for(DebitedPeriod key:DebitedPeriod.values()){
			if(!prop.containsKey(key.toString())){
				LogUtil.info("load DebitedPeriodMapping,key="+key, new Exception("key not exist!"));
				continue;
			}
			mapping.put(key.toString(), prop.getProperty(key.toString()));
		}
	}

}
