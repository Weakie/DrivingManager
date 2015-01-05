package com.weakie.driving.web.utils;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public class ResourcePathExposer implements ServletContextAware {

	private ServletContext servletContext;
	private String resourceRoot;
	private String version = "1.0.0";

	public void init() {
		this.resourceRoot = "/resources-" + version;
		this.getServletContext().setAttribute("resourceRoot",
				this.getServletContext().getContextPath() + this.resourceRoot);
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getResourceRoot() {
		return resourceRoot;
	}

}
