<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
</head>
<body>
	<br>
	<div class="container">
		<c:set var="nav" value="7" />
		<%@ include file="../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">子公司管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="row clearfix">
			<div class="col-md-7 column">
				<div class="panel panel-default">
					<div class="panel-heading">公司位置定位</div>
					<div class="panel-body" style="background-image: url(../img/map.jpg); height: 900px"></div>
				</div>
			</div>
			<div class="col-md-5 column">
				<div class="panel panel-default">
					<div class="panel-heading">填写公司信息</div>
					<div class="panel-body">
						<form action="<c:url value="/company"/>" method="POST">
							<input type="hidden" name="_method" value="${method }"> 
							<input type="hidden" name="id" value="${company.id }">
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>地区：</b>
								</div>
								<div class="col-md-8 column">
									<select name="city" class="form-control">
										<c:forEach items="${cityList }" var="cityName">
											<option value="${cityName }" <c:if test="${company.city eq cityName }">selected</c:if>>${cityName }</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>公司地址：</b>
								</div>
								<div class="col-md-8 column">
									<div class="input-group">
										<input type="text" name="addr" value="${company.addr }" class="form-control"> <span class="input-group-btn">
											<button class="btn btn-default" type="button">定位</button>
										</span>
									</div>
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>经度：${company.coord.lng }</b>
								</div>
								<div class="col-md-8 column"></div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>纬度：${company.coord.lat }</b>
								</div>
								<div class="col-md-8 column"></div>
							</div>
							<input type="hidden" name="coord" value="${company.coord.value }">
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>公司名称：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="name" value="${company.name }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>公司简称：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="shortName" value="${company.shortName }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>公司电话：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="telephone" value="${company.telephone }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>负责人：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="principle" value="${company.principle }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<font color="red">*</font><b>手机号码：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="mobileNum" value="${company.mobileNum }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>传真：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="faxNumber" value="${company.faxNumber }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>电子邮件：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="email" value="${company.email }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>规模（人）：</b>
								</div>
								<div class="col-md-8 column">
									<input  type="Number" name="scale" value="${company.scale }" required="required" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>400电话：</b>
								</div>
								<div class="col-md-8 column">
									<input type="text" name="tel400" value="${company.tel400 }" class="form-control" placeholder="">
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>备注：</b>
								</div>
								<div class="col-md-8 column">
									<textarea rows="2" name="comment" class="form-control">${company.comment }</textarea>
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
									<b>Logo：</b>
								</div>
								<div class="col-md-8 column">
									<img src="${company.logoURL }" alt="128x128">
									<p>双击区域上传大小128x128</p>
								</div>
							</div>
							<br>
							<div class="row clearfix">
								<div class="col-md-4 column" style="text-align: right; padding-top: 8px"></div>
								<div class="col-md-8 column">
									<input type="submit" class="btn btn-primary" value="保存">
									<input type="button" class="btn btn-default" value="返回">
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