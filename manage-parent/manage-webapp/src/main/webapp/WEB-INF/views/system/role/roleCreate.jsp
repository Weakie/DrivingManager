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
				<li><a href="#">角色管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">填写角色信息</div>
			<div class="panel-body">
				<form action="<c:url value="/role"/>" method="POST">
					<input type="hidden" name="_method" value="${method }"> 
					<input type="hidden" name="id" value="${role.id }">
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>角色名称：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" name="name" value="${role.name }" required="required" class="form-control" placeholder="填写角色名称">
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>角色权限：</b>
						</div>
						<div class="col-md-7 column">
							<div class="row clearfix">
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a01" value="true" <c:if test="${role.auth.a01 }">checked</c:if> type="checkbox"> 订单
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a02" value="true" <c:if test="${role.auth.a02 }">checked</c:if> type="checkbox"> 时效
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a03" value="true" <c:if test="${role.auth.a03 }">checked</c:if> type="checkbox"> 调度
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a04" value="true" <c:if test="${role.auth.a04 }">checked</c:if> type="checkbox"> 派单
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a05" value="true" <c:if test="${role.auth.a05 }">checked</c:if> type="checkbox"> 司机
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a06" value="true" <c:if test="${role.auth.a06 }">checked</c:if> type="checkbox"> 司机删除
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a07" value="true" <c:if test="${role.auth.a07 }">checked</c:if> type="checkbox"> 客户
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a08" value="true" <c:if test="${role.auth.a08 }">checked</c:if> type="checkbox"> 统计
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a09" value="true" <c:if test="${role.auth.a09 }">checked</c:if> type="checkbox"> 公司
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a10" value="true" <c:if test="${role.auth.a10 }">checked</c:if> type="checkbox"> 用户管理
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-7 column">
							<div class="row clearfix">
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 70px">
									<div class="checkbox">
										<label> <input name="auth.a11" value="true" <c:if test="${role.auth.a11 }">checked</c:if> type="checkbox"> 工作车
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a12" value="true" <c:if test="${role.auth.a12 }">checked</c:if> type="checkbox"> 地区收费
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a13" value="true" <c:if test="${role.auth.a13 }">checked</c:if> type="checkbox"> APP
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a14" value="true" <c:if test="${role.auth.a14 }">checked</c:if> type="checkbox"> 通知
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a15" value="true" <c:if test="${role.auth.a15 }">checked</c:if> type="checkbox"> 短信记录
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a16" value="true" <c:if test="${role.auth.a16 }">checked</c:if> type="checkbox"> 短信模板
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a17" value="true" <c:if test="${role.auth.a17 }">checked</c:if> type="checkbox"> 角色设置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a18" value="true" <c:if test="${role.auth.a18 }">checked</c:if> type="checkbox"> 版本设置
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-7 column">
							<div class="row clearfix">
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a19" value="true" <c:if test="${role.auth.a19 }">checked</c:if> type="checkbox"> 提成设置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a20" value="true" <c:if test="${role.auth.a20 }">checked</c:if> type="checkbox"> 反馈意见
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a21" value="true" <c:if test="${role.auth.a21 }">checked</c:if> type="checkbox"> 系统配置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a22" value="true" <c:if test="${role.auth.a22 }">checked</c:if> type="checkbox"> 强制销单
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a23" value="true" <c:if test="${role.auth.a23 }">checked</c:if> type="checkbox"> 强制收回
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a24" value="true" <c:if test="${role.auth.a24 }">checked</c:if> type="checkbox"> 客户充值
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a25" value="true" <c:if test="${role.auth.a25 }">checked</c:if> type="checkbox"> 司机充值
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-7 column">
							<div class="row clearfix">
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input name="auth.a26" value="true" <c:if test="${role.auth.a26 }">checked</c:if> type="checkbox"> 修改订单金额
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a27" value="true" <c:if test="${role.auth.a27 }">checked</c:if> type="checkbox"> 财务查看
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a28" value="true" <c:if test="${role.auth.a28 }">checked</c:if> type="checkbox"> 财务添加
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a29" value="true" <c:if test="${role.auth.a29 }">checked</c:if> type="checkbox"> 财务审核
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input name="auth.a30" value="true" <c:if test="${role.auth.a30 }">checked</c:if> type="checkbox"> 财务删除
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0pxx">
									<div class="checkbox">
										<label> <input name="auth.a31" value="true" <c:if test="${role.auth.a31 }">checked</c:if> type="checkbox"> 微信
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>描述：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<textarea rows="3" name="description" class="form-control">${role.description }</textarea>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-3 column" style="padding-left: 0px">
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