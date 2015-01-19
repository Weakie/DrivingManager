<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>订单详情-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="1"/>
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 200px;">
			<div style="padding-left: 15px">
				<ul class="breadcrumb">
					<li><a href="#">订单管理</a> <span class="divider"></span></li>
					<li>查看订单信息 <span class="divider"></span></li>
					<li class="active">当前单号：${order.orderID }</li>
					<li><a href="#">返回</a> <span class="divider"></span></li>
				</ul>
			</div>
			<!--进度条-->
			<div class="progressBar" style="padding-left: 100px; padding-right: 20px">
				<div class="progress progress-striped">
					<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
						<span class="sr-only">40% 完成</span>
					</div>
					<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
						<span class="sr-only">30% 完成（信息）</span>
					</div>
					<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
						<span class="sr-only">20% 完成（警告）</span>
					</div>
				</div>
			</div>
			<div style="padding-left: 15px">
				<ul class="breadcrumb">
					<li><a href="#">订单跟踪</a> <span class="divider"></span></li>
					<li><a href="#">订单轨迹</a> <span class="divider"></span></li>
				</ul>
			</div>
			<hr />
		</div>
		<!--订单跟踪信息-->
		<div style="border: 1px solid #D3D3D3">
			<table class="table table-hover">
				<thead style="background-color: #E6E6FA">
					<tr>
						<th style="width: 20%">时间</th>
						<th style="width: 80%">跟踪信息</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>09月04 18:57</td>
						<td><font color="#1E90FF"> [马52]补单</font></td>
					</tr>
					<tr>
						<td>Sachin</td>
						<td><font color="#1E90FF"> Mumbai</font></td>
					</tr>
				</tbody>
			</table>
		</div>
		<br>
		<!-- 订单信息-->
		<div class="row clearfix">
			<div class="col-md-6 column">
				<table class="table" style="border: 1px solid #D3D3D3">
					<thead style="background-color: #E6E6FA">
						<tr>
							<th>订单信息</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>创建时间：${order.createTime }</td>
						</tr>
						<tr>
							<td>订单类型：${order.orderType }</td>
						</tr>
						<tr>
							<td>订单来源：${order.orderSource }</td>
						</tr>
						<tr>
							<td>代驾地点：${order.aptmtPlace }</td>
						</tr>
						<tr>
							<td>预约时间：${order.aptmtTime }</td>
						</tr>
						<tr>
							<td>客户姓名：${order.customer.name }</td>
						</tr>
						<tr>
							<td>客户手机：${order.customer.telephone }</td>
						</tr>
						<tr>
							<td>当前状态：${order.orderStatus }</td>
						</tr>
						<tr>
							<td>订单备注：${order.comment }</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-1 column"></div>
			<!--付款信息-->
			<div class="col-md-5 column">
				<table class="table" style="border: 1px solid #D3D3D3">
					<thead style="background-color: #E6E6FA">
						<tr>
							<th>付款信息</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>等待时间：${order.waitingTime }</td>
						</tr>
						<tr>
							<td>代驾耗时：${order.drivingTime }</td>
						</tr>
						<tr>
							<td>行驶公里：${order.driverMileage }</td>
						</tr>
						<tr>
							<td>应收金额：${order.shouldPay }</td>
						</tr>
						<tr>
							<td>实收金额：<input type="text" style="width:50px" value="${actualPay }">&nbsp;<button type="button" class="btn btn-default btn-xs">修改</button></td>
						</tr>
						<tr>
							<td>报销金额：${order.reimburse }(备注：${order.reimburseNotes })</td>
						</tr>
						<tr>
							<td>付款方式：${order.payMethod }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div style="text-align: center">
			<button type="button" class="btn btn-default" style="margin: 0 auto">返回</button>
		</div>
	</div>
</body>
</html>