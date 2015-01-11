<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.weakie.driving.model.customer.CustomerType"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="5" />
		<%@ include file="../include/navigator.jsp"%>
		<div class="panel panel-default">
			<div class="panel-heading">填写用户信息</div>
			<div class="panel-body">
				<div class="row clearfix">
					<form action="<c:url value="/customer"/>" method="POST">
						<div class="col-md-4 column">
							<b>客户头像：</b> 
							<br> <br> 
							<c:if test="${not empty cus.avatarImage }">
								<img src="${cus.avatarImage }" width="40%"> 
							</c:if>
							<c:if test="${empty cus.avatarImage }">
								<img src="${resourceRoot}/img/portrait.jpg" width="40%"> 
							</c:if>
							<br> <br> 
							<font color="red">*</font><b>客户类型</b> 
							<br> 
							<select class="form-control" name="type">
								<option value="<%=CustomerType.INDIVIDUAL%>" <c:if test="${cus.type eq 'INDIVIDUAL'}">selected</c:if>>个人用户</option>
								<option value="<%=CustomerType.ENTERPRISE%>" <c:if test="${cus.type eq 'ENTERPRISE'}">selected</c:if>>企业用户</option>
								<option value="<%=CustomerType.VIP %>" <c:if test="${cus.type eq 'VIP'}">selected</c:if>>VIP用户</option>
							</select> 
							<br> 
							<input type="hidden" name="_method" value="${method }"> 
							<b>联系人：</b> 
							<br> 
							<input type="text" name="name" value="${cus.name }" required="required" class="form-control" placeholder=""> 
							<br> 
							<b>手机号：</b> 
							<br> 
							<input type="text" name="tel" value="${cus.tel }" required="required" pattern="[0-9]{11}" class="form-control" placeholder="">
							<br>
							<b>客户来源：</b>
							<br> 
							<input type="text" name="source" value="${cus.source }" class="form-control" placeholder=""> 
							<br> 
							<b>单位名称：</b> 
							<br> 
							<input type="text" name="company" value="${cus.company }" class="form-control" placeholder=""> 
							<br> 
							<b>单位地址：</b> 
							<br>
							<textarea name="companyAddr" rows="2" class="form-control">${cus.companyAddr }</textarea>
							<br> <b>备注：</b> <br>
							<textarea name="comment" rows="3" class="form-control">${cus.comment }</textarea>
							<br> <b>是否允许透支：</b><label><input type="checkbox" name="overdraft" value="true" <c:if test="${cus.overdraft }">checked</c:if>></label>
							<br> <br> <input type="submit" class="btn btn-primary" value="保存" />
						</div>
					</form>
					<div class="col-md-8 column">
						<button type="button" class="btn btn-default">添加</button>
						<br>
						<div class="row clearfix">
							<div class="col-md-1 column">#</div>
							<div class="col-md-3 column">手机号</div>
							<div class="col-md-2 column">姓名</div>
							<div class="col-md-3 column">常用地址</div>
							<div class="col-md-2 column">车牌号</div>
							<div class="col-md-1 column">操作</div>
						</div>
						<div class="row clearfix">
							<div class="col-md-1 column" style="padding-right: 0px">1</div>
							<div class="col-md-3 column" style="padding-right: 0px; padding-left: 0px">
								<input type="text" class="form-control" id="">
							</div>
							<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
								<input type="text" class="form-control" id="">
							</div>
							<div class="col-md-3 column" style="padding-right: 0px; padding-left: 0px">
								<input type="text" class="form-control" id="">
							</div>
							<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
								<input type="text" class="form-control" id="">
							</div>
							<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
								<button type="button" class="btn btn-default btn-sm">删除</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>