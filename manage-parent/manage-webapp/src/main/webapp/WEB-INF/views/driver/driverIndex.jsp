<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<script src="${resourceRoot}/js/jquery.tools.min.js"></script>
<title>司机管理-代驾管理系统</title>
<style type="text/css">
div.info {
	font-size: 12px
}
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
		<c:set var="nav" value="4" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="tabbable" id="tabs-236691">
			<div class="row clearfix">
				<div class="col-md-5 column">
					<div class="btn-group">
						<a role="button" data-toggle="tab" href="#panel-16699" class="btn btn-default">全部</a> <a role="button" data-toggle="tab" href="#panel-16700" class="btn btn-default"> 余额少于200-<span id='balanceUnder200' class="label label-danger">59</span>
						</a> <a role="button" data-toggle="tab" href="#panel-16701" class="btn btn-default">已冻结</a> <a role="button" data-toggle="tab" href="#panel-16702" class="btn btn-default">通话记录</a> <a role="button" data-toggle="tab" href="#panel-16703" class="btn btn-default">司机审核</a>
					</div>
				</div>
				<div class="col-md-3 column">
					<input type="text" class="form-control" placeholder="输入账号、姓名、手机">
				</div>
				<div class="col-md-1 column" style="padding-left: 0px">
					<button type="button" class="btn btn-default">搜索</button>
				</div>
				<div class="col-md-1 column"></div>
				<div class="col-md-2 column" style="text-align: right">
					<a class="btn btn-primary" href="<c:url value="/driver"/>" role="button">添加新司机</a>
				</div>
			</div>
			<br>
			<div class="tab-content">
				<div class="tab-pane active" id="panel-16699">
					<div class="page_turning">
						<c:import url="/drivers">
							<c:param name="type" value="all" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>

				<div class="tab-pane" id="panel-16700">
					<div class="page_turning">
						<c:import url="/drivers">
							<c:param name="type" value="balance" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>

				<div class="tab-pane" id="panel-16701">
					<div class="page_turning">
						<c:import url="/drivers">
							<c:param name="type" value="freeze" />
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>

				<div class="tab-pane" id="panel-16702">
					<div class="page_turning">
						<c:import url="/call">
							<c:param name="pageIndex" value="1" />
							<c:param name="pageNum" value="10" />
						</c:import>
					</div>
				</div>

				<div class="tab-pane" id="panel-16703">
					<div class="page_turning">
						<c:import url="/drivers">
							<c:param name="type" value="unapproved" />
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