package com.weakie.driving.mappings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 各种枚举的中文字符串转换器
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
	
	private StaticResourceLoader debitedPeroidMapping = new DebitedPeroidMappingLoader();
	private StaticResourceLoader driverStatusMapping = new DriverStatusMappingLoader();
	private StaticResourceLoader driverTypeMapping = new DriverTypeMappingLoader();
	private List<StaticResourceLoader> loaders= new ArrayList<StaticResourceLoader>();
	
	private StaticMappingCollections(){
		this.loaders.add(debitedPeroidMapping);
		this.loaders.add(driverStatusMapping);
		this.loaders.add(driverTypeMapping);
	}
	
	public void initialize(){
		for(StaticResourceLoader l:this.loaders){
			l.load();
		}
	}
	
	public Map<String,String> getDebitedPeroidMapping(){
		return this.debitedPeroidMapping.getMapping();
	}
	
	public String getDebitedPeriodMapping(String key){
		return this.debitedPeroidMapping.getMapping(key);
	}
	
	public Map<String,String> getDriverStatusMapping(){
		return this.driverStatusMapping.getMapping();
	}
	
	public String getDriverStatusMapping(String key){
		return this.driverStatusMapping.getMapping(key);
	}
	
	public Map<String,String> getDriverTypeMapping(){
		return this.driverTypeMapping.getMapping();
	}
	
	public String getDriverTypeMapping(String key){
		return this.driverTypeMapping.getMapping(key);
	}
	
	
}
