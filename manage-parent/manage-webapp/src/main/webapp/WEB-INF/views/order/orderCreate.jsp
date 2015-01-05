<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${resourceRoot}/css/bootstrap.min.css" rel="stylesheet">
<link href="${resourceRoot}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="${resourceRoot}/css/global.css" rel="stylesheet">
<script src="${resourceRoot}/js/jquery.min.js"></script>
<script src="${resourceRoot}/js/bootstrap.min.js"></script>
<script src="${resourceRoot}/js/bootstrap-datetimepicker.js" type="text/javascript" charset="UTF-8"></script>
<script src="${resourceRoot}/js/bootstrap-datetimepicker.fr.js" type="text/javascript" charset="UTF-8"></script>
<title>订单创建-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="1" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<div style="padding-left: 15px">
				<ul class="breadcrumb">
					<li><a href="#">订单管理</a> <span class="divider"></span></li>
					<li class="active">创建新订单<span class="divider"></span>
					</li>
					<li><a href="#">返回</a> <span class="divider"></span></li>
				</ul>
			</div>
		</div>
		<br>
		<div class="row clearfix">
			<div class="col-md-8 column">
				<div>
					<img src="../img/map.jpg" width="100%" height="500px">
				</div>
				<br>
				<div>
					<table class="table" style="border: 1px solid #D3D3D3">
						<thead>
							<tr>
								<th style="width: 15%">状态</th>
								<th style="width: 20%">单号</th>
								<th style="width: 10%">类型</th>
								<th style="width: 10%">来源</th>
								<th style="width: 15%">预约时间</th>
								<th style="width: 30%">预约地点</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><span class="label label-info">新订单</span></td>
								<td><font color="#1E90FF">***08280003</font></td>
								<td>人工</td>
								<td></td>
								<td>12:24</td>
								<td>昆明新都昌商业广场</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-0 column"></div>
			<div class="col-md-4 column" style="padding-left: 0px;">
				<form action="<c:url value="/order"/>" method="post">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">输入代驾地点定位，或地图上右击定位</h3>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-8 column" style="padding-right: 0px">
							<div class="input-group">
								<span class="input-group-addon">地点</span> <input type="text" name="aptmtPlace" class="form-control" placeholder="">
								<input type="hidden" name="aptmtCoordt" value="(123,123)">
							</div>
						</div>
						<div class="col-md-4 column" style="padding-left: 0px">
							<button type="button" class="btn btn-default">定位</button>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-12 column">
							<div class="input-group">
								<span class="input-group-addon">时间</span>
								<div class="input-group date form_datetime col-md-10" data-date-format="yyyy/mm/dd hh:ii" data-link-field="dtp_input1" style="padding-left: 0px">
									<input id="dtp_input1" class="form-control" size="16" type="text" name="aptmtTime" value="<fmt:formatDate value="${date }"  type="both" pattern="yyyy/MM/dd HH:mm"/>" readonly> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> <span class="input-group-addon"><span
										class="glyphicon glyphicon-th"></span></span>
								</div>
								<input type="hidden" id="dtp_input1" value="" /><br />
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-4 column">
							<div class="input-group">
								<span class="input-group-addon">人数</span> <input type="text" name="aptmtPeople" value="1" class="form-control" placeholder="代驾人数">
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-8 column">
							<div class="input-group">
								<span class="input-group-addon">客户手机</span> <input type="text" class="form-control">
								<input type="hidden" name="customerID" value="kehu">
							</div>
						</div>
						<div class="col-md-4 column" style="vertical-align: middle; position: relative; top: 50%">
							<span class="label label-info" style="vertical-align: middle">个人用户</span>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-8 column">
							<div class="input-group">
								<span class="input-group-addon">客户姓名</span> <input type="text" class="form-control" placeholder="自动">
							</div>
						</div>
						<div class="col-md-4 column" style="vertical-align: center">
							<span class="label label-warning" style="vertical-align: middle">0元</span>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-4 column">
							<p>总下单量：22</p>
						</div>
						<div class="col-md-6 column">
							<p>总下单量：22</p>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon">订单来源</span> <input type="text" name="orderSource" class="form-control">
					</div>
					<br>
					<div class="checkbox">
						<label>是否自动派单</label> <label> <input name="auto" value="true" type="checkbox">
						</label>
					</div>
					<div>
						<label><font font-weight=400>订单备注：</font></label>
					</div>
					<div>
						<textarea rows="3" name="comment" class="form-control"></textarea>
					</div>
					<br>
					<div>
						<button type="button" class="btn btn-primary" onclick="this.form.submit()">创建订单</button>
						<button type="button" class="btn btn-primary">创建并派单</button>
					</div>
					<br>
					<div>
						<table class="table table-bordered">
							<thead>
								<tr>
									<th>#</th>
									<th>司机姓名</th>
									<th>距离(公里)</th>
									<th>本日代驾</th>
									<th>本月代驾</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><label> <input type="checkbox">
									</label></td>
									<td>冯志恒</td>
									<td>25.09</td>
									<td>0次</td>
									<td>0次</td>
								</tr>
							</tbody>
						</table>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$('.form_datetime').datetimepicker({
			//language:  'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			forceParse : 0,
			showMeridian : 1
		});
	</script>
</body>
</html>