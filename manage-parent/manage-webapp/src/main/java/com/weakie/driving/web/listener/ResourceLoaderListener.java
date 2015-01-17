package com.weakie.driving.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.weakie.driving.mappings.StaticMappingCollections;
import com.weakie.driving.utils.LogUtil;

public class ResourceLoaderListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		StaticMappingCollections.getInstance().initialize();
		LogUtil.info("ResourceLoaderListsner initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		LogUtil.info("ResourceLoaderListsner destroyed");

	}

}
