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
		<ul class="nav nav-tabs">
			<li class="active"><a href="#" id="basic">基础配置</a></li>
			<li><a href="#" id="app">APP设置</a></li>
			<li><a href="#" id="protocol">代驾协议</a></li>
			<li><a href="#" id="invest">招商内容</a></li>
			<li><a href="#" id="pay">支付配置</a></li>
			<li><a href="#" id="distribution">派单设置</a></li>
		</ul>
		<br>
		<div id="main_body"></div>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$("#main_body").load('<c:url value="/sysconfig/basic"/>');
		
		$("#basic").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/basic"/>');
		});
		$("#app").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/app"/>');
		});
		$("#protocol").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/protocol"/>');
		});
		$("#invest").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/invest"/>');
		});
		$("#pay").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/pay"/>');
		});
		$("#distribution").click(function() {
			$("#main_body").load('<c:url value="/sysconfig/distribution"/>');
		});
	});
</script>
</html>