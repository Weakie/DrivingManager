<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.weakie.driving.model.driver.DriverType"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
<style type="text/css">
b.info {
	font-size: 12px
}
</style>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="4" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/drivers"/>">司机管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="<c:url value="/drivers"/>">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-body">
				<form action="<c:url value="/driver/${driverID }"/>" method="POST" class="form-horizontal" role="form">
					<div class="row clearfix">
						<input type="hidden" name="_method" value="${method }">
						<div class="col-md-6 column">
							<div class="panel panel-default">
								<div class="panel-heading">填写司机信息(必填)</div>
								<div class="panel-body">
									<div class="form-group">
										<label for="driverID" class="col-sm-2 control-label"><b class="info">工号<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="text" name="driverID" id="driverID" required="required" value="${driver.driverID }" class="form-control" placeholder="请输入司机手机客户端登录工号" <c:if test="${not empty driver.driverID }" >disabled="disabled"</c:if>>
										</div>
									</div>
									<div class="form-group">
										<label for="nickName" class="col-sm-2 control-label"><b class="info">昵称<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="text" name="nickName" id="nickName" required="required" value="${driver.nickName }" class="form-control" placeholder="客户APP显示的司机昵称">
										</div>
									</div>
									<div class="form-group">
										<label for="realName" class="col-sm-2 control-label"><b class="info">真实姓名<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="text" name="realName" id="realName" required="required" value="${driver.realName }" class="form-control" placeholder="司机真实姓名">
										</div>
									</div>
									<div class="form-group">
										<label for="identity" class="col-sm-2 control-label"><b class="info">身份证号<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="text" name="identity" id="identity" required="required" value="${driver.identity }" class="form-control" placeholder="司机身份证号码" pattern="\d{18}|\d{15}">
										</div>
									</div>
									<div class="form-group">
										<label for="optionsRadios3" class="col-sm-2 control-label"><b class="info">性别<font color="red">*</font>
										</b></label>
										<div class="col-sm-10">
											<label class="radio-inline"> <input type="radio" name="sex" id="optionsRadios3" value="true" <c:if test="${driver.sex }" >checked</c:if>> 男
											</label> <label class="radio-inline"> <input type="radio" name="sex" id="optionsRadios4" value="false" <c:if test="${not driver.sex }" >checked</c:if>> 女
											</label>
										</div>
									</div>
									<div class="form-group">
										<label for="telephone" class="col-sm-2 control-label"><b class="info">手机号<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="text" name="telephone" id="telephone" required="required" value="${driver.telephone }" class="form-control" placeholder="请输入绑定的手机号" <c:if test="${driver.binding }" >disabled="disabled"</c:if> pattern="[0-9]{11}">
										</div>
									</div>
									<div class="form-group">
										<label for="licenseTime" class="col-sm-2 control-label"><b class="info">领证时间<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<input type="date" name="licenseTime" id="licenseTime" required="required" class="form-control" placeholder="" value="<fmt:formatDate value="${driver.licenseTime }" pattern="yyyy-MM-dd"/>">
										</div>
									</div>
									<div class="form-group">
										<label for="companyID" class="col-sm-2 control-label"><b class="info">所属公司<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<select name="companyID" id="companyID" required="required" class="form-control">
												<c:forEach var="item" items="${company }">
													<option value="${item.key }" <c:if test="${driver.companyID eq item.key}">selected</c:if>>${item.value }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="type" class="col-sm-2 control-label"><b class="info">员工类型<font color="red">*</font></b></label>
										<div class="col-sm-10">
											<select name="type" id="type" required="required" class="form-control">
												<option value="<%=DriverType.PARTTIME%>" <c:if test="${driver.type eq 'PARTTIME'}">selected</c:if>>兼职</option>
												<option value="<%=DriverType.FULLTIME%>" <c:if test="${driver.type eq 'FULLTIME'}">selected</c:if>>全职</option>
											</select>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 column">
							<div class="panel panel-default">
								<div class="panel-heading">填写司机信息(非必填)</div>
								<div class="panel-body">
									<div class="form-group">
										<label for="paymentID" class="col-sm-2 control-label"><b class="info">提成</b></label>
										<div class="col-sm-10">
											<select name="paymentID" id="paymentID" class="form-control">
												<c:forEach var="item" items="${payment }">
													<option value="${item.key }" <c:if test="${driver.paymentID eq item.key}">selected</c:if>>${item.value }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="licenseType" class="col-sm-2 control-label"><b class="info">驾照类型</b></label>
										<div class="col-sm-10">
											<input type="text" name="licenseType" id="licenseType" value="${driver.licenseType }" class="form-control" placeholder="驾照类型">
										</div>
									</div>
									<div class="form-group">
										<label for="introducer" class="col-sm-2 control-label"><b class="info">介绍人</b></label>
										<div class="col-sm-10">
											<input type="text" name="introducer" id="introducer" value="${driver.introducer }" class="form-control" placeholder="介绍人姓名">
										</div>
									</div>
									<div class="form-group">
										<label for="height" class="col-sm-2 control-label"><b class="info">身高(cm)</b></label>
										<div class="col-sm-10">
											<input type="Number" name="height" id="height" value="${driver.height }" pattern="[0-9]{3}" class="form-control" placeholder="身高厘米">
										</div>
									</div>
									<div class="form-group">
										<label for="nativePlace" class="col-sm-2 control-label"><b class="info">籍贯</b></label>
										<div class="col-sm-10">
											<input type="text" name="nativePlace" id="nativePlace" value="${driver.nativePlace }" class="form-control" placeholder="籍贯">
										</div>
									</div>
									<div class="form-group">
										<label for="address" class="col-sm-2 control-label"><b class="info">家庭住址</b></label>
										<div class="col-sm-10">
											<input type="text" name="address" id="address" value="${driver.address }" class="form-control" placeholder="家庭住址">
										</div>
									</div>
									<div class="form-group">
										<label for="emergPeople" class="col-sm-2 control-label"><b class="info">紧急联系</b></label>
										<div class="col-sm-10">
											<input type="text" name="emergPeople" id="emergPeople" value="${driver.emergPeople }" class="form-control" placeholder="紧急联系人姓名">
										</div>
									</div>
									<div class="form-group">
										<label for="emergTel" class="col-sm-2 control-label"><b class="info">紧急电话</b></label>
										<div class="col-sm-10">
											<input type="text" name="emergTel" id="emergTel" value="${driver.emergTel }" pattern="[0-9]{11}" class="form-control" placeholder="紧急联系人手机号码">
										</div>
									</div>
									<div class="form-group">
										<label for="comment" class="col-sm-2 control-label"><b class="info">备注</b></label>
										<div class="col-sm-10">
											<textarea name="comment" id="comment" class="form-control" rows="3" placeholder="备足信息不超过256个字符">${driver.comment }</textarea>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-12 column" style="text-align: right;padding-right:30">
							<div class="form-group">
								<button type="submit" class="btn btn-primary">保存</button>
								<button type="button" class="btn btn-default">返回</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">上传照片（可选）</div>
			<div class="panel-body">
				<div class="row clearfix">
					<div class="col-md-3 column">
						<div>
							<p>司机头像</p>
						</div>
						<div style="border: 1px solid #A9A9A9">
							<img src="../img/white.jpg" height="200px" width="200px">
						</div>
						<div>
							<p>本地上传图片大小为200x200</p>
						</div>
						<div>
							<button type="button" class="btn btn-primary">本地上传</button>
						</div>
					</div>
					<div class="col-md-6 column">
						<div>
							<p>司机驾驶证</p>
						</div>
						<div style="border: 1px solid #A9A9A9">
							<img src="../img/white.jpg" height="200px" width="500px">
						</div>
						<div>
							<p>本地上传图片大小为550x200</p>
						</div>
						<div>
							<button type="button" class="btn btn-primary">本地上传</button>
						</div>
					</div>
					<div class="col-md-3 column">
						<div>
							<p>司机全身照</p>
						</div>
						<div style="border: 1px solid #A9A9A9">
							<img src="../img/white.jpg" height="200px" width="100px">
						</div>
						<div>
							<p>本地上传图片大小为500x800</p>
						</div>
						<div>
							<button type="button" class="btn btn-primary">本地上传</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	$(document).ready(
			function() {
				$("input[name=driverID]").blur(
						function() {
							value = $("input[name=driverID]").val();
							checkValidate('ID', value, function(data, status) {
								if (data.res == "SUCCESS") {
									$("#driverID").parents(".form-group").attr("class","form-group has-success");
								} else {
									$("#driverID").parents(".form-group").attr("class","form-group has-error");
									alertData(status, data);
								}
							});
						});
				$("input[name=telephone]").blur(
						function() {
							value = $("input[name=telephone]").val();
							checkValidate('TEL', value, function(data, status) {
								if (data.res == "SUCCESS") {
									$("#telephone").parents(".form-group").attr("class","form-group has-success");
								} else {
									$("#telephone").parents(".form-group").attr("class","form-group has-error");
									alertData(status, data);
								}
							});
						});
			});
</script>
</html>