<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="zh-cn">
<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<%@ include file="./include/resource_link_order.jsp"%>
<title>订单创建-代驾管理系统</title>
</head>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=kUGSGKh2rsGPL0G6bkiuA3xI"></script>
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
				<div id="map"  style="height: 600px"></div>
				<br>
				<div id="unresolvedOrders" class="page_turning">
					<!-- 发送ajax请求 -->
				</div>
			</div>
			<div class="col-md-0 column"></div>
			<div class="col-md-4 column" style="padding-left: 0px;">
				<form action="<c:url value="/orderCreate"/>" method="post">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">输入代驾地点定位，或地图上点击定位</h3>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-8 column" style="padding-right: 0px">
							<div class="input-group">
								<span class="input-group-addon">地点</span> <input id="aptmtPlace" type="text" name="aptmtPlace"
									class="form-control" placeholder=""> <input id="aptmtCoordt" type="hidden" name="aptmtCoordt"
									value="(123,123)">
							</div>
						</div>
						<div class="col-md-4 column" style="padding-left: 0px">
							<button id="locateBtn" type="button" class="btn btn-default" onclick="locate()">定位</button>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-12 column">
							<div class="input-group">
								<span class="input-group-addon">时间</span>
								<div class="input-group date form_datetime col-md-10" data-date-format="yyyy/mm/dd hh:ii"
									data-link-field="dtp_input1" style="padding-left: 0px">
									<input id="dtp_input1" class="form-control" size="16" type="text" name="aptmtTime"
										value="<fmt:formatDate value="${date }"  type="both" pattern="yyyy/MM/dd HH:mm"/>" readonly> <span
										class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> <span
										class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
								</div>
								<input type="hidden" id="dtp_input1" value="" /><br />
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-5 column">
							<div class="input-group">
								<span class="input-group-addon">人数</span> <input type="Number" name="aptmtPeople" value="1" class="form-control"
									placeholder="代驾人数">
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-8 column">
							<div class="input-group">
								<span class="input-group-addon">客户手机</span> <input id="customerTel" type="text" class="form-control"> <input
									id="customerID" type="hidden" name="customerID" value="">
							</div>
						</div>
						<div class="col-md-4 column" style="top: 10px">
							<span id="customerType" class="label label-info">个人用户</span>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-8 column">
							<div class="input-group">
								<span class="input-group-addon">客户姓名</span> <input id="customerName" type="text" class="form-control"
									placeholder="自动">
							</div>
						</div>
						<div class="col-md-4 column" style="top: 10px">
							<span class="label label-warning"><span id="customerBalance">0</span>元</span>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-4 column" style="top: 5px">
							<p>
								总下单量：<span id="totalNum">0</span>
							</p>
						</div>
						<div class="col-md-4 column" style="top: 5px">
							<p>
								总下单量：<span id="monthNum">0</span>
							</p>
						</div>
						<div class="col-md-4 column" style="margin-bottom: 12px;">
							<button id="createCustomer" type="button" class="btn btn-warning btn-sm">创建客户</button>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-10 column">
							<div class="input-group">
								<span class="input-group-addon">订单来源</span> <input type="text" name="orderSource" class="form-control">
							</div>
						</div>
					</div>
					<br>
					<div class="checkbox">
						<label>是否自动派单</label> <label> <input name="auto" value="true" type="checkbox">
						</label>
					</div>
					<div>
						<label><font style="font-weight: 400">订单备注：</font></label>
					</div>
					<div>
						<textarea rows="3" name="comment" class="form-control"></textarea>
					</div>
					<br>
					<div>
						<button type="button" class="btn btn-primary" onclick="this.form.submit()">创建订单</button>
						<button id="getNearbyDrivers" type="button" class="btn btn-primary">获取附近司机</button>
					</div>
					<br>
					<div id="availableDrivers" class="page_turning">
						<!-- AJAX司机列表 -->
					</div>
				</form>
			</div>
		</div>
	</div>
	<script>
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

		$(document).ready(function() {
			$("#createCustomer").hide();
			$("#createCustomer").click(function() {
				$("#createCustomer").attr("disabled", "disabled")
				//send request
				var tel = $("#customerTel").val();
				var name = $("#customerName").val();
				createCustomer(tel, name);
			});

			$("#customerTel").blur(function() {
				var tel = $("#customerTel").val();
				getCustomerInfo(tel, updateCustomerInfo);
			});
			$("#getNearbyDrivers").click(showAvailableDriver);
		});

		function showAvailableDriver() {
			var coordinate = $("#aptmtCoordt").val();
			getAvailableDrivers(coordinate);
			$("#getNearbyDrivers").text("创建并派单");
			//alert("hello");
			$("#getNearbyDrivers").unbind("click",showAvailableDriver);
		}

		function updateCustomerInfo(data) {
			if (!data.newCustomer) {
				$("#customerID").val(data.id);
				$("#createCustomer").hide();
				getUnresolvedOrders(data.id);
			} else {
				$("#createCustomer").show();
				$("#createCustomer").removeAttr("disabled");
			}
			$("#customerType").text(data.type);
			$("#customerName").val(data.name);
			$("#customerBalance").text(data.balance);
			$("#totalNum").text(data.allAmount);
			$("#monthNum").text(data.monthAmount);
		}
	</script>
	<script type="text/javascript">
		var map = new BMap.Map("map");
		var point = new BMap.Point(116.331398, 39.897445);
		map.centerAndZoom(point, 16);
		map.enableScrollWheelZoom(true);
		var flag = true;
		var myGeo = new BMap.Geocoder();
		var geolocation = new BMap.Geolocation();
		geolocation.getCurrentPosition(function(r) {
			if (this.getStatus() == BMAP_STATUS_SUCCESS) {
				map.panTo(r.point);
			} else {
				alert('failed' + this.getStatus());
			}
		}, {
			enableHighAccuracy : true
		});
		function locate() {
			var location = $('#aptmtPlace').val();
			myGeo.getPoint(location, function(point) {
				if (flag == false) {
					map.clearOverlays();
				}
				if (point) {
					var mk = new BMap.Marker(point);
					map.addOverlay(mk);
					map.panTo(point);
					$('#aptmtCoordt').val("(" + e.point.lng + "," + e.point.lat + ")");
					flag=false;
					//alert(location);
				}
			}, "");
		}
		map.addEventListener("click", function(e) {
			if (flag == false) {
				map.clearOverlays();
			}

			var pointTempt = new BMap.Point(e.point.lng, e.point.lat);
			var marker = new BMap.Marker(pointTempt);
			map.addOverlay(marker);
			$('#aptmtCoordt').val("(" + e.point.lng + "," + e.point.lat + ")");
			flag = false;
		});
	</script>
</body>
</html>