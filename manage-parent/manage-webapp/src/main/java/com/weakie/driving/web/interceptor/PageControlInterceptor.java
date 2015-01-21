package com.weakie.driving.web.interceptor;

import java.util.Iterator;

import org.apache.commons.lang.StringUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import com.weakie.driving.utils.LogUtil;
import com.weakie.driving.utils.PageControl;

public class PageControlInterceptor implements WebRequestInterceptor {

	@Override
	public void preHandle(WebRequest request) throws Exception {

	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		if (model != null && model.containsAttribute("pc")) {
			StringBuilder sb = new StringBuilder();
			Iterator<String> iter = request.getParameterNames();
			while (iter.hasNext()) {
				String c = iter.next();
				if (StringUtils.equals(c, "pageIndex")) {
					continue;
				}
				if (StringUtils.equals(c, "pageNum")) {
					continue;
				}
				sb.append("&"+ c + "=" + request.getParameter(c));
			}
			if (sb.length() > 0) {
				sb.deleteCharAt(0);
				PageControl pc = (PageControl) model.get("pc");
				pc.setPageData(sb.toString());
			}
			LogUtil.debug("After handle PageData:" + model.get("pc"));
		}
	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex) throws Exception {
		
	}

}
