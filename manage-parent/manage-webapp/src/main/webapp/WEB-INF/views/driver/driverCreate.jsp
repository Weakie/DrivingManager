<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.weakie.driving.model.driver.DriverType"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
<style type="text/css">
div.info {
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
				<li><a href="#">司机管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="row clearfix">
			<form action="<c:url value="/driver/${driverID }"/>" method="POST">
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">填写司机信息(必填)</div>
						<div class="panel-body">
							<div class="info">
								<font color="red">*</font><b>工号：</b>
							</div>
							<input type="hidden" name="_method" value="${method }" >
							<input type="text" name="driverID" required="required" value="${driver.driverID }" <c:if test="${not empty driver.driverID }" >readonly</c:if> class="form-control" placeholder="">
							<div id="id_info" class="info">请输入手机客户端登录工号</div>
							<br>
							<div class="info">
								<font color="red">*</font><b>昵称：</b>
							</div>
							<input type="text" name="nickName" required="required" value="${driver.nickName }" class="form-control" placeholder=""> <br>
							<div class="info">
								<font color="red">*</font><b>真实姓名：</b>
							</div>
							<input type="text" name="realName" required="required" value="${driver.realName }" class="form-control" placeholder=""> <br>
							<div class="info">
								<font color="red">*</font><b>身份证号：</b>
							</div>
							<input type="text" name="identity" required="required" value="${driver.identity }" pattern="\d{18}|\d{15}" class="form-control" placeholder=""> <br>
							<div style="font-size: 12px" class="row clearfix">
								<div class="col-md-4 column" style="padding-right: 0px">
									<font color="red">*</font><b>性别：</b> <label class="checkbox-inline"> <input type="radio" name="sex" id="optionsRadios3" value="true" <c:if test="${driver.sex }" >checked</c:if>> 男
									</label> <label class="checkbox-inline"> <input type="radio" name="sex" id="optionsRadios4" value="false" <c:if test="${not driver.sex }" >checked</c:if>> 女
									</label>
								</div>
							</div>
							<br>
							<div class="info">
								<font color="red">*</font><b>手机号：</b>
							</div>
							<input type="text" name="telephone" required="required" value="${driver.telephone }" <c:if test="${driver.binding }" >readonly</c:if> pattern="[0-9]{11}" class="form-control" placeholder=""> <br>
							<div class="info">
								<font color="red">*</font><b>领证时间：</b>
							</div>
							<input type="date" name="licenseTime" required="required" value="<fmt:formatDate value="${driver.licenseTime }" pattern="yyyy-MM-dd"/>" class="form-control" placeholder=""> <br>
							<div class="info">
								<font color="red">*</font><b>所属公司：</b>
							</div>
							<select name="companyID" required="required" class="form-control">
								<c:forEach var="item" items="${company }">
									<option value="${item.key }" <c:if test="${driver.companyID eq item.key}">selected</c:if>>${item.value }</option>
								</c:forEach>
							</select> <br>
							<div class="info">
								<font color="red">*</font><b>员工类型：</b>
							</div>
							<select name="type" required="required" class="form-control">
								<option value="<%=DriverType.PARTTIME%>" <c:if test="${driver.type eq 'PARTTIME'}">selected</c:if>>兼职</option>
								<option value="<%=DriverType.FULLTIME%>" <c:if test="${driver.type eq 'FULLTIME'}">selected</c:if>>全职</option>
							</select> <br>
							<div class="info">
								<b>备注：</b>
							</div>
							<textarea name="comment" class="form-control">${driver.comment }</textarea>
						</div>
					</div>
				</div>
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">填写司机信息(非必填)</div>
						<div class="panel-body">
							<div class="info">
								<b>提成：</b>
							</div>
							<select name="paymentID" class="form-control">
								<c:forEach var="item" items="${payment }">
									<option value="${item.key }" <c:if test="${driver.paymentID eq item.key}">selected</c:if>>${item.value }</option>
								</c:forEach>
							</select> <br>
							<div class="info">
								<b>驾照类型：</b>
							</div>
							<input type="text" name="licenseType" value="${driver.licenseType }" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>介绍人：</b>
							</div>
							<input type="text" name="introducer" value="${driver.introducer }" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>身高(cm)：</b>
							</div>
							<input type="Number" name="height" value="${driver.height }" pattern="[0-9]{3}" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>籍贯：</b>
							</div>
							<input type="text" name="nativePlace" value="${driver.nativePlace }" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>家庭住址：</b>
							</div>
							<input type="text" name="address" value="${driver.address }" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>紧急联系人：</b>
							</div>
							<input type="text" name="emergPeople" value="${driver.emergPeople }" class="form-control" placeholder=""> <br>
							<div class="info">
								<b>紧急电话：</b>
							</div>
							<input type="text" name="emergTel" value="${driver.emergTel }" pattern="[0-9]{11}" class="form-control" placeholder=""> <br> <br>
							
							<div  class="info">
								<input type="submit" class="btn btn-primary" value="保存" />
								<button type="button" class="btn btn-default">返回</button>
							</div>
						</div>
					</div>
				</div>
			</form>
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
	$(document).ready(function(){
		var method = $("input[name=_method]").val();
		if(method == 'POST' || method == 'post'){
			$("input[name=driverID]").blur(function(){
				value = $("input[name=driverID]").val();
				checkValidate('ID',value,function(data,status){
					if(data.res=="SUCCESS"){
						$("id_info").html("");
					}else{
						$("id_info").html("");
						alertData(status,data);
					}
				});
			});
		}else{
			
		}
		
	});
</script>
</html>