<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<script src="${resourceRoot}/js/jquery.tools.min.js"></script>
<title>客户-代驾管理系统</title>
<style type="text/css">
div.apple_overlay {
	/* overlay背景图 */
	background-image: url(${resourceRoot}/img/white.jpg);
	/* overlay的最终尺寸，可以由此改变overlay大小  */
	width: 600px;
	height: 550px;
	/* overlay默认隐藏 */
	display: none;
	/* 设定内嵌元素padding，获得好的视觉效果  */
	padding: 55px;
}
</style>
</head>
<body>
	<div class="apple_overlay" id="consume_history">
		<div class="page_turning"></div>
	</div>
	<div class="container">
		<c:set var="nav" value="5" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="tabbable" id="tabs-236691">
			<div class="row clearfix">
				<div class="col-md-4 column">
					<div class="btn-group">
						<a class="btn btn-default" href="#panel-16699" role="button" data-toggle="tab">个人用户</a> <a class="btn btn-default" href="#panel-16700" role="button" data-toggle="tab">企业用户</a> <a class="btn btn-default" href="#panel-16701"
							role="button" data-toggle="tab">VIP用户</a>
					</div>
				</div>
				<div class="col-md-4 column">
					<input type="text" class="form-control" placeholder="请输入联系人、客户来源、手机号、车牌号">
				</div>
				<div class="col-md-1 column" style="padding-left: 0px">
					<button type="button" class="btn btn-default">搜索</button>
				</div>
				<div class="col-md-1 column"></div>
				<div class="col-md-2 column" style="text-align: right">
					<a role="button" class="btn btn-primary" href="<c:url value="/customer"/>">添加新客户</a>
				</div>
			</div>
			<br>
			<div class="tab-content">
				<div class="tab-pane active" id="panel-16699">
					<div class="page_turning">
						<c:import url="/customers">
							<c:param name="type" value="individual" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>
				<div class="tab-pane" id="panel-16700">
					<div class="page_turning">
						<c:import url="/customers">
							<c:param name="type" value="enterprise" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>
				<div class="tab-pane" id="panel-16701">
					<div class="page_turning">
						<c:import url="/customers">
							<c:param name="type" value="vip" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>