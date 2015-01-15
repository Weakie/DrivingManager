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
				<li><a href="#panel-16699" data-toggle="tab" role="button">基础配置</a></li>
				<li><a href="#panel-16700" data-toggle="tab" role="button">APP设置</a></li>
				<li><a href="#panel-16701" data-toggle="tab" role="button">代驾协议</a></li>
				<li><a href="#panel-16702" data-toggle="tab" role="button">招商内容</a></li>
				<li><a href="#panel-16703" data-toggle="tab" role="button">支付配置</a></li>
				<li><a href="#panel-16704" data-toggle="tab" role="button">派单设置</a></li>
			</ul>
			<br>
			<div class="tab-content">
				<div class="tab-pane active" id="panel-16699">
					<c:import url="/sysconfig/basic" />
				</div>
				<div class="tab-pane" id="panel-16700">
					<c:import url="/sysconfig/app" />
				</div>
				<div class="tab-pane" id="panel-16701">
					<c:import url="/sysconfig/protocol" />
				</div>
				<div class="tab-pane" id="panel-16702">
					<c:import url="/sysconfig/invest" />
				</div>
				<div class="tab-pane" id="panel-16703">
					<c:import url="/sysconfig/pay" />
				</div>
				<div class="tab-pane" id="panel-16704">
					<c:import url="/sysconfig/distribution" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>