<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
					<div class="panel-body">
						<div id="onWorkingDrivers" class="page_turning">
							<c:import url="/send/drivers"></c:import>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 column">
				<div class="panel panel-default">
					<div class="panel-heading">派单</div>
					<div class="panel-body">
						<input type="text" class="form-control" placeholder="输入司机姓名、手机号、工号即可进行搜索"> <br>
						<div id="availableDrivers" class="page_turning">
							<c:if test="${not empty order }">
								<c:import url="/send/drivers">
									<c:param name="coordinate" value="${order.aptmtCoordt.value }" />
									<c:param name="orderID" value="${order.orderID }" />
									<c:param name="pageIndex" value="1" />
									<c:param name="pageNum" value="5" />
								</c:import>
							</c:if>
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
							<div class="panel-body">
								<div id="unsendOrders" class="page_turning">
									<c:if test="${not empty order }">
										<ul class="list-group">
											<li class="list-group-item">
												<font size="1"> 
													<label class="checkbox-inline" style="padding-left: 0px"> 
														<input type="radio" name="radio" id="radio-${order.orderID }" value="${order.orderID }" checked> 
														<fmt:formatDate value="${order.aptmtTime }" type="both" pattern="HH:mm" />
														${order.aptmtPlace }
														<input type="hidden" name="coordt" value="${order.aptmtCoordt.value }">
													</label>
												</font>
											</li>
										</ul>
									</c:if>
									<c:import url="/send/orders"></c:import>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	$(document).ready(function() {
		if($("#availableDrivers").children().attr("id") == null){
			$("#availableDrivers").html("<div style='text-align: center'><span>选择订单进行派单</span><div>");
		}
		registerOrderRadioBtnEvent();
	});
</script>
</html>