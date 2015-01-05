<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--新工单-->
<div class="panel panel-info">
	<div class="panel-heading">新工单</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="new" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>
<!--已派单-->
<div class="panel panel-warning">
	<div class="panel-heading">已派单</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="dispatched" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>
<!--正在前往预约地-->
<div class="panel panel-success">
	<div class="panel-heading">正在前往预约地</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="accepted" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>
<!--即将完成工单-->
<div class="panel panel-danger">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-2 column">即将完成工单</div>
			<div class="col-md-9 column"></div>
			<div class="col-md-1 column">
				<a href="#" style="padding-right: 0px">全部刷新</a>
			</div>
		</div>
	</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="driving" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>
<!--未完成接送-->
<div class="panel panel-primary">
	<div class="panel-heading">未完成接送</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="driving" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>