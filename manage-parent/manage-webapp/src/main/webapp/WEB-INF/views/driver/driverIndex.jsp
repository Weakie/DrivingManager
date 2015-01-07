<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>司机管理-代价管理系统</title>
<style type="text/css">
div.info {
	font-size: 12px
}
</style>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="4" />
		<%@ include file="../include/navigator.jsp"%>

		<div class="row clearfix">
			<div class="col-md-5 column">
				<div class="btn-group">
					<button type="button" class="btn btn-default">全部</button>
					<button type="button" class="btn btn-default">
						余额少于200-<span class="label label-danger">59</span>
					</button>
					<button type="button" class="btn btn-default">已冻结</button>
					<button type="button" class="btn btn-default">通话记录</button>
					<button type="button" class="btn btn-default">司机审核</button>
				</div>
			</div>
			<div class="col-md-3 column">
				<input type="text" class="form-control" placeholder="输入账号、姓名、手机">
			</div>
			<div class="col-md-1 column" style="padding-left: 0px">
				<button type="button" class="btn btn-default">搜索</button>
			</div>
			<div class="col-md-2 column"></div>
			<div class="col-md-1 column">
				<a class="btn btn-primary" href="<c:url value="/driver"/>" role="button">添加新司机</a>
			</div>
		</div>
		<br>
		<div style="border: 1px solid #D3D3D3">
			<!-- 司机信息 -->
		</div>
	</div>
</body>
</html>