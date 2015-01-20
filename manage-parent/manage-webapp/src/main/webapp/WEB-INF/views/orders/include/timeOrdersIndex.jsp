<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	$(function() {
		$('#collapseOne').collapse('hide')
	});
</script>
<!--新工单-->
<div class="panel panel-info">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-11 column">新工单</div>
			<div class="col-md-1 column" style="text-align: right">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"> 展开 </a>
			</div>
		</div>
	</div>
	<div id="collapseOne" class="panel-collapse collapse">
		<div class="panel-body">
			<div id="newOrders" class="page_turning">
				<c:import url="/orders">
					<c:param name="type" value="new" />
					<c:param name="pageIndex" value="1" />
					<c:param name="pageNum" value="10" />
				</c:import>
			</div>
		</div>
	</div>
</div>
<!--已派单-->
<div class="panel panel-warning">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-11 column">已派单</div>
			<div class="col-md-1 column" style="text-align: right">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"> 展开 </a>
			</div>
		</div>
	</div>
	<div id="collapseTwo" class="panel-collapse collapse">
		<div class="panel-body">
			<div id="dispatchedOrders" class="page_turning">
				<c:import url="/orders">
					<c:param name="type" value="dispatched" />
					<c:param name="pageIndex" value="1" />
					<c:param name="pageNum" value="10" />
				</c:import>
			</div>
		</div>
	</div>
</div>
<!--正在前往预约地-->
<div class="panel panel-success">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-11 column">正在前往预约地</div>
			<div class="col-md-1 column" style="text-align: right">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseThree"> 展开 </a>
			</div>
		</div>
	</div>
	<div id="collapseThree" class="panel-collapse collapse">
		<div class="panel-body">
			<div id="acceptedOrders" class="page_turning">
				<c:import url="/orders">
					<c:param name="type" value="accepted" />
					<c:param name="pageIndex" value="1" />
					<c:param name="pageNum" value="10" />
				</c:import>
			</div>
		</div>
	</div>
</div>
<!--即将完成工单-->
<div class="panel panel-danger">
	<div id="collapseFourHead" class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-11 column">即将完成工单</div>
			<div class="col-md-1 column" style="text-align: right">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"> 展开 </a>
			</div>
		</div>
	</div>
	<div id="collapseFour" class="panel-collapse collapse">
		<div class="panel-body">
			<div id="drivingOrders" class="page_turning">
				<c:import url="/orders">
					<c:param name="type" value="driving" />
					<c:param name="pageIndex" value="1" />
					<c:param name="pageNum" value="10" />
				</c:import>
			</div>
		</div>
	</div>
</div>
<!--未完成接送-->
<div class="panel panel-primary">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-11 column">未完成接送</div>
			<div class="col-md-1 column" style="text-align: right">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseFive"> 展开 </a>
			</div>
		</div>
	</div>
	<div id="collapseFive" class="panel-collapse collapse">
		<div class="panel-body">
			<div id="shuttle" class="page_turning">
				<c:import url="/cars">
					<c:param name="type" value="shuttle" />
					<c:param name="pageIndex" value="1" />
					<c:param name="pageNum" value="10" />
				</c:import>
			</div>
		</div>
	</div>
</div>