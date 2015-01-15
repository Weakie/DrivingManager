<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">车牌号：${detail.carNumber }</div>
	<div class="panel-body">
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-2 column" style="padding-right: 0px; padding-top: 8px">
				<font color="red">*</font>选择司机：
			</div>
			<div class="col-md-3 column" style="padding-left: 0px">
				<select class="form-control">
					<c:forEach var="item" items="${driverMap }">
						<option value="${item.key }">${item.value }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<br>
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-1 column" style="padding-right: 0px; padding-top: 8px"></div>
			<div class="col-md-3 column" style="padding-left: 0px">
				<button type="button" class="btn btn-primary">提交</button>
				<button type="button" class="btn btn-default">返回</button>
			</div>
		</div>
	</div>
</div>
<div class="page_turning">
	<c:import url="/car/assign">
		<c:param name="id" value="${carDetail.id }" />
		<c:param name="pageIndex" value="1" />
		<c:param name="pageNum" value="10" />
	</c:import>
</div>