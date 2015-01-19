<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="../../include/resource_link.jsp"%>
<title>用户管理-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="12" />
		<%@ include file="../../include/navigator.jsp"%>
		<div class="row clearfix">
			<div class="col-md-2 column">
				<input type="text" class="form-control" placeholder="账号">
			</div>
			<div class="col-md-1 column" style="padding-left: 0px">
				<button type="button" class="btn btn-default">搜索</button>
			</div>
			<div class="col-md-7 column"></div>
			<div class="col-md-2 column" style="text-align: right">
				<a role="button" class="btn btn-primary" href="<c:url value="/user"/>">添加新用户</a>
			</div>
		</div>
		<br>
		<div class="page_turning">
			<c:import url="/users">
				<c:param name="type" value="none" />
				<c:param name="pageIndex" value="1" />
				<c:param name="pageNum" value="10" />
			</c:import>
		</div>
	</div>
</body>
</html>