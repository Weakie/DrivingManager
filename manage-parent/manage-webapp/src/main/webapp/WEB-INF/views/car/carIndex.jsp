<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>工作车-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="8" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="row clearfix">
			<div class="col-md-4 column">
				<div class="btn-group">
					<button type="button" class="btn btn-default" id="transfer">接送记录</button>
					<button type="button" class="btn btn-default" id="workarea">工作区域</button>
					<button type="button" class="btn btn-default" id="workcars">工作车</button>
				</div>
			</div>
			<div id="transfer_btn" class="col-md-8 column" style="padding-right: 0px; text-align: right">
				<div class="col-md-6 column"></div>
				<div class="col-md-4 column" style="padding-right: 0px">
					<input type="text" class="form-control" placeholder="输入订单号">
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; text-align: left">
					<button type="button" class="btn btn-default">搜索</button>
				</div>
			</div>
			<div id="workarea_btn" class="col-md-8 column" style="padding-right: 0px; text-align: right">
				<div class="col-md-9 column"></div>
				<div class="col-md-3 column">
					<button type="button" class="btn btn-primary">添加新工作区域</button>
				</div>
			</div>
			<div id="workcars_btn" class="col-md-8 column" style="padding-right: 0px; text-align: right">
				<div class="col-md-9 column"></div>
				<div class="col-md-3 column">
					<button type="button" class="btn btn-primary">添加新工作车</button>
				</div>
			</div>
		</div>
		<br>
		<div id="table_area" style="border: 1px solid #D3D3D3"></div>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		//init document 
		hideAll();
		$("#transfer_btn").show();
		loadCarShuttleList();
		
		//init button 
		$("#transfer").click(function() {
			hideAll();
			$("#transfer_btn").show();
			loadCarShuttleList()
		});
		$("#workarea").click(function() {
			hideAll();
			$("#workarea_btn").show();
			loadCarAreaList();
		});
		$("#workcars").click(function() {
			hideAll();
			$("#workcars_btn").show();
			loadCarDetailList();
		});
	});
	function hideAll() {
		$("#transfer_btn").hide();
		$("#workarea_btn").hide();
		$("#workcars_btn").hide();
	}
	
	function loadCarShuttleList(){
		$("#table_area").load('<c:url value="/cars"/>','type=shuttle');
	}
	function loadCarAreaList(){
		$("#table_area").load('<c:url value="/cars"/>','type=area');
	}
	function loadCarDetailList(){
		$("#table_area").load('<c:url value="/cars"/>','type=detail');
	}
	
	function searchCarShuttleList(){
		var data;
		$("#table_area").load('<c:url value="/cars"/>','q='+data);
	}
</script>
</html>