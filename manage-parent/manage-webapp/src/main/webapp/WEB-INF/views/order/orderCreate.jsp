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
							<h3 class="panel-title">输入代驾地点定位，在地图上点击精确定位</h3>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-8 column" style="padding-right: 0px">
							<div class="input-group">
								<span class="input-group-addon">地点</span> 
								<input id="aptmtPlace" type="text" name="aptmtPlace" required="required" autofocus="autofocus" class="form-control" placeholder="输入详细地点"> 
								<input id="aptmtCoordt" type="hidden" name="aptmtCoordt" value=""> <!-- value="(123,123)" -->
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
										value="<fmt:formatDate value="${date }"  type="both" pattern="yyyy/MM/dd HH:mm"/>" required="required" readonly> 
										<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> 
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-5 column">
							<div class="input-group">
								<span class="input-group-addon">人数</span> 
								<input type="Number" name="aptmtPeople" value="1" required="required" class="form-control" placeholder="代驾人数">
							</div>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-8 column">
							<div class="input-group">
								<span class="input-group-addon">客户手机</span> 
								<input id="customerTel" type="text" required="required" class="form-control" placeholder="请输入11位客户手机号"> 
								<input id="customerID" type="hidden" name="customerID" value="">
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
								<span class="input-group-addon">客户姓名</span> 
								<input id="customerName" type="text" class="form-control" value="自动" placeholder="请输入客户姓名">
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
						<label>是否自动派单</label> 
						<label> 
							<input name="auto" value="true" type="checkbox">
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
						<input id="createOrder" type="submit" disabled="disabled" class="btn btn-primary" value="创建订单">
						<input id="withSend" name="withSend" type="hidden" value="false">
						<button id="createAndSend" type="button" disabled="disabled" class="btn btn-primary">创建并派单</button>
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
			//check place
			$("#aptmtPlace").blur(function() {
				var location = $('#aptmtPlace').val();
				if(location == null || location.length == 0){
					errorData("[表单错误]请输入预约地点");
					setTimeout("closeDangerAlert()" ,6000);
					$("#aptmtPlace").parent(".input-group").attr("class","input-group has-error");
				}
			});
			$("#aptmtPlace").change(function(){
				infoData("[坐标数据未生效]请点击定位按钮");
				setTimeout("closeWarningAlert()" ,6000);
				$("#createOrder").attr("disabled", "disabled");
				$("#aptmtPlace").parent(".input-group").attr("class","input-group has-warning");
			});
			
			//check customer telephone
			$("#customerTel").blur(function() {
				var tel = $("#customerTel").val();
				var myreg = /^(((13[0-9]{1})|159|153)+\d{8})$/;
				if(tel != null && tel.length != 0 && myreg.test(tel)){
					getCustomerInfo(tel, updateCustomerInfo);
				}else{
					errorData("[表单错误]请输入有效的客户手机号");
					setTimeout("closeDangerAlert()" ,6000);
					$("#customerTel").parent(".input-group").attr("class","input-group has-error");
				}
			});
			
			//check driver number
			$("[name=aptmtPeople]").change(checkDriverNumber);
			
			$("#createCustomer").hide();
			$("#createCustomer").click(function() {
				$("#createCustomer").attr("disabled", "disabled")
				//send request
				var tel = $("#customerTel").val();
				var name = $("#customerName").val();
				if(tel != null && tel.length > 0 && name !=null && name.length>0){
					createCustomer(tel, name);
				}else{
					errorData("[表单错误]请输入客户手机号和姓名");
					setTimeout("closeDangerAlert()" ,6000);
					$("#customerName").focus();
				}
			});
			
			$("#createAndSend").click(function(){
				//判断客户,判断时间,判断人数
				if(!$("form")[0].checkValidity())
		        {
					$("form").find(':submit').click();
					return;
		        }
				//判断司机
				var num = Number($("[name=aptmtPeople]").val());
				if(num != $(":checkbox[name=drivers]:checked").length){
					errorData("[表单错误]选取司机数必须等于人数");
					setTimeout("closeDangerAlert()" ,6000);
					return;
				}
				//设为send = true
				$("#withSend").val("true");
		        $("form").submit();
			});
		});
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
					flag=false;
					$('#aptmtCoordt').val("(" + point.lng + "," + point.lat + ")");
					//get available drivers
					afterChooseLocation();
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
			flag = false;
			$('#aptmtCoordt').val("(" + e.point.lng + "," + e.point.lat + ")");
			//get available drivers
			afterChooseLocation();
		});
	</script>
</body>
</html>