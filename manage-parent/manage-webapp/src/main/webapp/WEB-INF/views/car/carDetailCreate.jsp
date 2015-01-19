<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="8" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">工作车管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">填写工作车信息</div>
			<div class="panel-body">
				<form action="<c:url value="/car/detail"/>" method="POST">
					<input type="hidden" name="_method" value="${method }"> 
					<input type="hidden" name="id" value="${detail.id }">
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
							<font color="red">*</font>车牌号：
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" name="carNumber" value="${detail.carNumber }" class="form-control">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">
							<font color="red">*</font>车型：
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" name="carType" value="${detail.carType }" class="form-control">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">工作区域：</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<select class="form-control" name="area.id">
								<option value="" >--全部--</option>
								<c:forEach items="${areas }" var="carArea">
									<option value="${carArea.id }" <c:if test="${detail.area.id eq carArea.id}">selected</c:if>>${carArea.value }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px">备注：</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<textarea rows="3" name="comment" class="form-control">${detail.comment }</textarea>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px"></div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<button type="submit" class="btn btn-primary">提交</button>
							<button type="button" class="btn btn-default">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>