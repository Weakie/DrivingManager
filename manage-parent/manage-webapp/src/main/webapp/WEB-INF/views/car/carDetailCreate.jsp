<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代价管理系统</title>
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
			<div class="panel-heading">填写工作车信息</div>
			<div class="panel-body">
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
						<font color="red">*</font>车牌号：
					</div>
					<div class="col-md-3 column" style="padding-left: 0px">
						<input type="text" class="form-control">
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
						<font color="red">*</font>车型：
					</div>
					<div class="col-md-3 column" style="padding-left: 0px">
						<input type="text" class="form-control">
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">工作区域：</div>
					<div class="col-md-3 column" style="padding-left: 0px">
						<select class="form-control">
							<option>--全部--</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
						</select>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">备注：</div>
					<div class="col-md-3 column" style="padding-left: 0px">
						<textarea rows="3" class="form-control"></textarea>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px"></div>
					<div class="col-md-3 column" style="padding-left: 0px">
						<button type="button" class="btn btn-primary">提交</button>
						<button type="button" class="btn btn-default">返回</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>