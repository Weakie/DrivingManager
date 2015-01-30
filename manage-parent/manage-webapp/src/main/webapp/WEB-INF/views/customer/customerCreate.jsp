<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.weakie.driving.model.customer.CustomerType"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="5" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">客户管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">填写用户信息</div>
			<div class="panel-body">
				<div class="row clearfix">
					<div class="col-md-4 column">
						<b>客户头像：</b> <br> <br>
						<c:if test="${not empty cus.avatarImage }">
							<img src="${cus.avatarImage }" width="60%">
						</c:if>
						<c:if test="${empty cus.avatarImage }">
							<img src="${resourceRoot}/img/portrait.jpg" width="60%">
						</c:if>
					</div>
					<div class="col-md-6 column">
						<b>客户信息：</b> <br> <br>
						<form action="<c:url value="/customer/${customerID }"/>" method="POST" class="form-horizontal" role="form">
							<input type="hidden" name="_method" value="${method }"> <input type="hidden" name="id" value="${cus.id }">
							<div class="form-group">
								<c:if test="${not empty cus.id }">
									<label for="name" class="col-sm-2 control-label"><b>客户ID</b></label>
									<div class="col-sm-10">
										<p class="form-control-static">${cus.id }</p>
									</div>
								</c:if>
							</div>
							<div class="form-group">
								<label for="type" class="col-sm-2 control-label"><b>客户类型<font color="red">*</font></b></label>
								<div class="col-sm-10">
									<select class="form-control" name="type" id="type">
										<option value="<%=CustomerType.INDIVIDUAL%>" <c:if test="${cus.type eq 'INDIVIDUAL'}">selected</c:if>>个人用户</option>
										<option value="<%=CustomerType.ENTERPRISE%>" <c:if test="${cus.type eq 'ENTERPRISE'}">selected</c:if>>企业用户</option>
										<option value="<%=CustomerType.VIP %>" <c:if test="${cus.type eq 'VIP'}">selected</c:if>>VIP用户</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label"><b>联系人<font color="red">*</font></b></label>
								<div class="col-sm-10">
									<input type="text" name="name" id="name" value="${cus.name }" required="required" class="form-control" placeholder="联系人姓名（必填）">
								</div>
							</div>
							<div class="form-group">
								<label for="tel" class="col-sm-2 control-label"><b>手机号<font color="red">*</font></b></label>
								<div class="col-sm-10">
									<input type="text" name="tel" id="tel" value="${cus.tel }" required="required" pattern="[0-9]{11}" class="form-control" placeholder="联系人手机号（必填）">
								</div>
							</div>
							<div class="form-group">
								<label for="source" class="col-sm-2 control-label"><b>客户来源</b></label>
								<div class="col-sm-10">
									<input type="text" name="source" id="source" value="${cus.source }" class="form-control" placeholder="客户来源（可选）">
								</div>
							</div>
							<div class="form-group">
								<label for="company" class="col-sm-2 control-label"><b>单位名称</b></label>
								<div class="col-sm-10">
									<input type="text" name="company" id="company" value="${cus.company }" class="form-control" placeholder="客户单位名称（可选）">
								</div>
							</div>
							<div class="form-group">
								<label for="companyAddr" class="col-sm-2 control-label"><b>单位地址</b></label>
								<div class="col-sm-10">
									<textarea name="companyAddr" id="companyAddr" rows="3" class="form-control" placeholder="客户单位地址（256字符以内）（可选）">${cus.companyAddr }</textarea>
								</div>
							</div>
							<div class="form-group">
								<label for="comment" class="col-sm-2 control-label"><b>备注</b></label>
								<div class="col-sm-10">
									<textarea name="comment" id="comment" rows="3" class="form-control" placeholder="备注信息（256字符以内）（可选）">${cus.comment }</textarea>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label> <input type="checkbox" name="overdraft" value="true" <c:if test="${cus.overdraft }">checked</c:if>> <b>是否允许透支</b>
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-default">保存</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>