<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>派单-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="3" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="row clearfix">
			<div class="col-md-9 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row clearfix">
							<div class="col-md-11 column">
								上班中的司机，查找司机按Ctrl+F <span class="label label-success">空闲</span> <span class="label label-info">工作车</span> <span class="label label-danger">忙碌</span>
							</div>
							<div class="col-md-1 column">
								<button type="button" class="btn btn-default btn-xs">刷新</button>
							</div>
						</div>
					</div>
					<div id="000" class="panel-body">
						<c:import url="/send/drivers"></c:import>
					</div>
				</div>
			</div>
			<div class="col-md-3 column">
				<div class="panel panel-default">
					<div class="panel-heading">派单</div>
					<div class="panel-body">
						<input type="text" class="form-control" placeholder="输入司机姓名、手机号、工号即可进行搜索"> <br>
						<div id="111">
							<!-- 可选司机 -->
						</div>
						<hr>
						<div class="panel panel-default">
							<div class="panel-heading">
								<div class="row clearfix">
									<div class="col-md-9 column">未派工单：</div>
									<div class="col-md-2 column">
										<button type="button" class="btn btn-default btn-xs">刷新</button>
									</div>
								</div>
							</div>
							<div id="222" class="panel-body">
								<c:import url="/send/orders"></c:import>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>