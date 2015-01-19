<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="../../include/resource_link.jsp"%>
<title>${title }-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="12" />
		<%@ include file="../../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">地区收费管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="row clearfix">
					<div class="col-md-2 column">
						<input type="text" class="form-control" placeholder="输入城市名">
					</div>
					<div class="col-md-7 column"></div>
					<div class="col-md-3 column">
						<button type="button" class="btn btn-primary btn-xs">保存</button>
						<button type="button" class="btn btn-info btn-xs">修改</button>
						<button type="button" class="btn btn-success btn-xs">新增时间段</button>
						<button type="button" class="btn btn-danger btn-xs">删除</button>
					</div>
				</div>
			</div>
			<div class="panel-body">
				<%@ include file="./include/arcPrices.jsp"%>
				<p style="color: #428bca">收费说明：</p>
				<div class="row clearfix">
					<div class="col-md-5 column">
						<textarea rows="3" class="form-control"></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	$(function() {
		$('#collapseOne').collapse('hide')
	});
</script>
</html>