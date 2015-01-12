<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>公司-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="7" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="row clearfix">
			<div class="col-md-4 column">
				<input type="text" class="form-control" placeholder="输入公司名称、拼音首字母、简称">
			</div>
			<div class="col-md-1 column" style="padding-left: 0px">
				<button type="button" class="btn btn-default">搜索</button>
			</div>
			<div class="col-md-5 column"></div>
			<div class="col-md-2 column" style="text-align: right">
				<a role="button" class="btn btn-primary" href="<c:url value="/company"/>">添加子公司</a>
			</div>
		</div>
		<br>
		<div style="border: 1px solid #D3D3D3">
			<c:import url="/companys">
				<c:param name="type" value="none" />
				<c:param name="pageIndex" value="1" />
				<c:param name="pageNum" value="10" />
			</c:import>
		</div>
	</div>
</body>
</html>