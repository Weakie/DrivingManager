<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="./include/resource_link_sysconfig.jsp"%>
<title>系统配置-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="12" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="tabbable" id="tabs-236691">
			<ul class="nav nav-tabs">
				<li <c:if test="${panel==0 }">class="active"</c:if>><a href="#panel-16699" data-toggle="tab" role="button">基础配置</a></li>
				<li <c:if test="${panel==1 }">class="active"</c:if>><a href="#panel-16700" data-toggle="tab" role="button">APP设置</a></li>
				<li <c:if test="${panel==2 }">class="active"</c:if>><a href="#panel-16701" data-toggle="tab" role="button">代驾协议</a></li>
				<li <c:if test="${panel==3 }">class="active"</c:if>><a href="#panel-16702" data-toggle="tab" role="button">招商内容</a></li>
				<li <c:if test="${panel==4 }">class="active"</c:if>><a href="#panel-16703" data-toggle="tab" role="button">支付配置</a></li>
				<li <c:if test="${panel==5 }">class="active"</c:if>><a href="#panel-16704" data-toggle="tab" role="button">派单设置</a></li>
			</ul>
			<br>
			<div class="tab-content">
				<div id="panel-16699" class="tab-pane <c:if test="${panel==0 }">active</c:if>">
					<c:import url="/sysconfig/basic" />
				</div>
				<div id="panel-16700" class="tab-pane <c:if test="${panel==1 }">active</c:if>">
					<c:import url="/sysconfig/app" />
				</div>
				<div id="panel-16701" class="tab-pane <c:if test="${panel==2 }">active</c:if>">
					<c:import url="/sysconfig/protocol" />
				</div>
				<div id="panel-16702" class="tab-pane <c:if test="${panel==3 }">active</c:if>">
					<c:import url="/sysconfig/invest" />
				</div>
				<div id="panel-16703" class="tab-pane <c:if test="${panel==4 }">active</c:if>">
					<c:import url="/sysconfig/pay" />
				</div>
				<div id="panel-16704" class="tab-pane <c:if test="${panel==5 }">active</c:if>">
					<c:import url="/sysconfig/distribution" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>