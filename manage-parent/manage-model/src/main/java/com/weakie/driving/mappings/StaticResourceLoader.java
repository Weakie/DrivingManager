package com.weakie.driving.mappings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.weakie.driving.utils.LogUtil;

abstract class StaticResourceLoader {

	private static final String PREFIX = "com/weakie/driving/mappings/";
	private String resourceFileName;
	protected Map<String,String> mapping = new HashMap<String, String>();
	public StaticResourceLoader(String fileName){
		this.resourceFileName = fileName;
	}

	public String getResourceFileName() {
		return PREFIX+resourceFileName;
	}

	public void setResourceFileName(String resourceFileName) {
		this.resourceFileName = resourceFileName;
	}

	public String getMapping(String key){
		return this.mapping.getOrDefault(key, key);
	}
	
	public Map<String, String> getMapping() {
		return mapping;
	}

	public void load(){
		LogUtil.info("begin  load "+this.resourceFileName);
		try {
			this.loadStaticResource();
		} catch (IOException e) {
			LogUtil.error(e);
		}
		LogUtil.info("finish load "+this.resourceFileName);
	}
	
	protected abstract void loadStaticResource() throws IOException;
}
