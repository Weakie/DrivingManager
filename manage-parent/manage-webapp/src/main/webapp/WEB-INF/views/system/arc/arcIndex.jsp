<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="../../include/resource_link.jsp"%>
<title>地区收费-代价管理系统</title>
</head>
<body>
	<div class="container">
		<br>
		<div class="row clearfix">
			<div class="col-md-10 column"></div>
			<div class="col-md-2 column" style="text-align: right">
				<a role="button" class="btn btn-primary" href="<c:url value="/arc"/>">添加新地区</a>
			</div>
		</div>
		<br>
		<div class="page_turning">
			<c:import url="/arcs">
				<c:param name="type" value="none" />
				<c:param name="pageIndex" value="1" />
				<c:param name="pageNum" value="10" />
			</c:import>
		</div>
	</div>
</body>
</html>