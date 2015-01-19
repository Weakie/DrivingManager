<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>订单-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="1" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="tabbable" id="tabs-236691">
			<div class="row clearfix">
				<div class="col-md-4 column">
					<a class="btn btn-danger" href="#panel-16699" role="button" data-toggle="tab">时效</a>
					<div class="btn-group">
						<a class="btn btn-default" href="#panel-16700" role="button" data-toggle="tab">执行中</a> 
						<a class="btn btn-default" href="#panel-16701" role="button" data-toggle="tab">已销单</a> 
						<a class="btn btn-default" href="#panel-16702" role="button" data-toggle="tab">已结算</a> 
						<a class="btn btn-default" href="#panel-16703" role="button" data-toggle="tab">已报单</a>
					</div>
				</div>
				<div class="col-md-6 column">
					<p>距离下次刷新还有： 秒</p>
				</div>
				<div class="col-md-2 column">
					<a class="btn btn-primary" href="<c:url value="/orders"/>" role="button">刷新</a> 
					<a class="btn btn-primary" href="<c:url value="/order"/>" role="button">添加新订单</a>
				</div>
			</div>
			<br>

			<div class="tab-content">
				<!-- 时效 -->
				<div class="tab-pane active" id="panel-16699">
					<%@ include file="./include/timeOrdersIndex.jsp"%>
				</div>

				<!-- 执行中 -->
				<div class="tab-pane" id="panel-16700">
					<%@ include file="./include/executeOrdersIndex.jsp"%>
				</div>

				<!-- 已销单 -->
				<div class="tab-pane" id="panel-16701">
					<%@ include file="./include/destroyedOrdersIndex.jsp"%>
				</div>

				<!-- 已结算 -->
				<div class="tab-pane" id="panel-16702">
					<%@ include file="./include/payedOrdersIndex.jsp"%>
				</div>

				<!-- 已报单 -->
				<div class="tab-pane" id="panel-16703">
					<%@ include file="./include/reportedOrdersIndex.jsp"%>
				</div>

			</div>
		</div>
	</div>
</body>
</html>