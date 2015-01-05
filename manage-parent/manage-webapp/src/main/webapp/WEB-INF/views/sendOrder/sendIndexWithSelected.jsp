<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<%@ include file="../include/resource_link.jsp"%>
<title>派单-代价管理系统</title>
</head>
<body>
	<br>
	<div class="container">
		<%@ include file="../include/navigator.jsp"%>
		<div class="row clearfix">
			<div class="col-md-9 column">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row clearfix">
							<div class="col-md-11 column">
								上班中的司机，查找司机按Ctrl+F <span class="label label-success">空闲</span> <span class="label label-info">工作车</span> <span class="label label-danger">忙碌</span>
							</div>
							<div class="col-md-1 column">
								<button type="button" class="btn btn-default btn-xs">刷新</button>
							</div>
						</div>
					</div>
					<div id="000" class="panel-body">
						<c:import url="/send/drivers"></c:import>
					</div>
				</div>
			</div>
			<div class="col-md-3 column">
				<div class="panel panel-default">
					<div class="panel-heading">派单</div>
					<div class="panel-body">
						<input type="text" class="form-control" placeholder="输入司机姓名、手机号、工号即可进行搜索"> <br>
						<div id="111">
							<c:import url="/send/drivers">
								<c:param name="coordinate" value="(1000,1000)" />
								<c:param name="pageIndex" value="1" />
								<c:param name="pageNum" value="5" />
							</c:import>
						</div>
						<hr>
						<div class="panel panel-default">
							<div class="panel-heading">
								<div class="row clearfix">
									<div class="col-md-9 column">未派工单：</div>
									<div class="col-md-2 column">
										<button type="button" class="btn btn-default btn-xs">刷新</button>
									</div>
								</div>
							</div>
							<div id="222" class="panel-body">
								<ul class="list-group">
									<li class="list-group-item"><font size="1"> <label class="checkbox-inline" style="padding-left: 0px"> <input type="radio" name="optionsRadiosinline" id="optionsRadios3" value="${order.orderID }" checked>
												<fmt:formatDate value="${order.aptmtTime }"  type="both" pattern="HH:mm"/>${order.aptmtPlace }
										</label>
									</font></li>
								</ul>
								<c:import url="/send/orders"></c:import>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>