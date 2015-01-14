<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<div class="page_turning">
			<c:import url="/orders">
				<c:param name="type" value="driving" />
				<c:param name="pageIndex" value="1" />
				<c:param name="pageNum" value="10" />
			</c:import>
		</div>
	</div>
</div>