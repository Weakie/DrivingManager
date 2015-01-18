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
					<input type="hidden" name="_method" value="${method }"> <input type="hidden" name="id" value="${role.id }">
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>角色名称：</b>
						</div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<input type="text" class="form-control" placeholder="填写角色名称">
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
										<label> <input type="checkbox"> 订单
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 时效
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
										<label> <input type="checkbox"> 派单
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 司机
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 司机删除
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 客户
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 统计
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 公司
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 用户管理
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
										<label> <input type="checkbox"> 工作车
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 地区收费
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> APP
										</label>
									</div>
								</div>
								<div class="col-md-1 column" style="padding-right: 0px; padding-left: 0px">
									<div class="checkbox">
										<label> <input type="checkbox"> 通知
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 短信记录
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 短信模板
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 角色设置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 版本设置
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
										<label> <input type="checkbox"> 提成设置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 反馈意见
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 系统配置
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 强制销单
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 强制收回
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 客户充值
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 司机充值
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
										<label> <input type="checkbox"> 修改订单金额
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 财务查看
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 财务添加
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 财务审核
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px; width: 80px">
									<div class="checkbox">
										<label> <input type="checkbox"> 财务删除
										</label>
									</div>
								</div>
								<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0pxx">
									<div class="checkbox">
										<label> <input type="checkbox"> 微信
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
							<textarea rows="3" class="form-control"></textarea>
						</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-3 column" style="padding-left: 0px">
							<button type="button" class="btn btn-primary">保存</button>
							<button type="button" class="btn btn-default">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>