package com.weakie.driving.utils;

import org.apache.log4j.Logger;

public class LogUtil {

	public static void debug(Object s){
		Logger logger = LogUtil.getLogger();
		if(logger.isDebugEnabled()){
			logger.debug(s);
		}
	}
	
	public static void debug(Object s,Throwable t){
		Logger logger = LogUtil.getLogger();
		if(logger.isDebugEnabled()){
			logger.debug(s,t);
		}
	}
	
	public static void info(Object s){
		Logger logger = LogUtil.getLogger();
		if(logger.isInfoEnabled()){
			logger.info(s);
		}
	}
	
	public static void info(Object s,Throwable t){
		Logger logger = LogUtil.getLogger();
		if(logger.isInfoEnabled()){
			logger.info(s,t);
		}
	}

	public static void warn(Object s){
		Logger logger = LogUtil.getLogger();	
		logger.warn(s);
	}
	
	public static void warn(Object s,Throwable t){
		Logger logger = LogUtil.getLogger();	
		logger.warn(s,t);
	}
	
	public static void error(Object s){
		Logger logger = LogUtil.getLogger();	
		logger.error(s);
	}
	
	public static void error(Object s,Throwable t){
		Logger logger = LogUtil.getLogger();	
		logger.error(s,t);
	}
	
	private static Logger getLogger(){
		StackTraceElement[] st = Thread.currentThread().getStackTrace();
		if(st.length>3){
			return Logger.getLogger(st[3].getClassName());
		}
		return Logger.getLogger(LogUtil.class);
	}
}
