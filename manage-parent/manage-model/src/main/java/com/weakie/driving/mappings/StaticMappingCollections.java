package com.weakie.driving.mappings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.weakie.driving.model.driver.DriverStatus;
import com.weakie.driving.model.driver.DriverType;
import com.weakie.driving.model.system.sysconfig.DebitedPeriod;

/**
 * 各种 静态资源,枚举的中文字符串转换器
 * @author weakie,lin
 * 这不是一个单例模式！！！
 */
public class StaticMappingCollections {

	private static StaticMappingCollections instance = new StaticMappingCollections();
	public static StaticMappingCollections getInstance(){
		return instance;
	}
	public static void setInstance(StaticMappingCollections instance){
		StaticMappingCollections.instance = instance;
	}
	
	private DebitedPeroidMappingLoader debitedPeroidMapping = new DebitedPeroidMappingLoader();
	private DriverStatusMappingLoader driverStatusMapping = new DriverStatusMappingLoader();
	private DriverTypeMappingLoader driverTypeMapping = new DriverTypeMappingLoader();
	private List<StaticResourceLoader<?>> loaders= new ArrayList<StaticResourceLoader<?>>();
	
	private StaticMappingCollections(){
		this.loaders.add(debitedPeroidMapping);
		this.loaders.add(driverStatusMapping);
		this.loaders.add(driverTypeMapping);
	}
	
	public void initialize(){
		for(StaticResourceLoader<?> l:this.loaders){
			l.load();
		}
	}
	
	public Map<DebitedPeriod, String> getDebitedPeroidMapping(){
		return this.debitedPeroidMapping.getMapping();
	}
	
	public String getDebitedPeriodMapping(DebitedPeriod key){
		return this.debitedPeroidMapping.getMapping(key);
	}
	
	public Map<DriverStatus,String> getDriverStatusMapping(){
		return this.driverStatusMapping.getMapping();
	}
	
	public String getDriverStatusMapping(DriverStatus key){
		return this.driverStatusMapping.getMapping(key);
	}
	
	public Map<DriverType,String> getDriverTypeMapping(){
		return this.driverTypeMapping.getMapping();
	}
	
	public String getDriverTypeMapping(DriverType key){
		return this.driverTypeMapping.getMapping(key);
	}
	
}
