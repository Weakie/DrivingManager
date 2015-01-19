<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="8" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">工作车管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">添加新工作区域</div>
			<div class="panel-body">
				<form action="<c:url value="/car/area"/>" method="POST">
					<input type="hidden" name="_method" value="${method }"> 
					<input type="hidden" name="id" value="${area.id }">
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
							<font color="red">*</font>城市：
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" name="city" value="${area.city }" class="form-control">
						</div>
						<div class="col-md-5 column" style="padding-left: 0px; padding-top: 8px">请准确填写城市的名称，如北京市、上海市等</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
							<font color="red">*</font>区名：
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" name="district" value="${area.district }" class="form-control">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-2 column"></div>
						<div class="col-md-2 column" style="padding-top: 8px; text-align: right">
							<font color="red">*</font>选择区域：
						</div>
						<div class="col-md-8 column" style="padding-left: 0px">
							<div class="panel panel-default">
								<div class="panel-heading">1.在地图中点击右键。2.选择起始点和结束点确定区域范围</div>
								<div class="panel-body" style="background-image: url(../img/map.jpg); height: 473px"></div>
								<input type="hidden" name="p1" value="${area.p1.value }"> <input type="hidden" name="p2" value="${area.p2.value }">
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px"></div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<button type="submit" class="btn btn-primary">提交</button>
							<button type="button" class="btn btn-default">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>