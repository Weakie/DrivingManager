<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="../../include/resource_link.jsp"%>
<title>${title }-代价管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="12" />
		<%@ include file="../../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">用户管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">填写用户信息</div>
			<div class="panel-body">
				<form action="<c:url value="/user"/>" method="POST">
					<input type="hidden" name="_method" value="${method }">
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>用户名：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" class="form-control" placeholder="用户名为2-20个字符">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>密码：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" class="form-control" placeholder="密码不能少于4个字符">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>重复密码：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" class="form-control" placeholder="需和密码一致">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>所属公司：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<select class="form-control">
								<option>成都易米网络科技有限公司</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>是否冻结：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px; padding-top: 8px">
							<input type="checkbox" id="inlineCheckbox1" value="option1">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>角色选择：</b>
						</div>
						<div class="col-md-6 column" style="padding-left: 0px">
							<div class="row clearfix">
								<div class="col-md-2 column" style="padding-right: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 话务员
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 老板
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 调度
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 客服
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 内置角色
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-3 column">
							<input type="submit" class="btn btn-primary" value="保存">
							<button type="button" class="btn btn-default">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>