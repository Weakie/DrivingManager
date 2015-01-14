<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-hover">
	<thead style="background-color: #DCDCDC">
		<tr>
			<th style="width: 15%">车牌号</th>
			<th style="width: 10%">车型</th>
			<th style="width: 10%">状态</th>
			<th style="width: 15%">当前司机</th>
			<th style="width: 15%">工作区域</th>
			<th style="width: 20%">所属公司</th>
			<th style="width: 15%">操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${detailList }" var="detail">
			<tr>
				<td>渝A335E5</td>
				<td>长安</td>
				<td>未指派</td>
				<td>无</td>
				<td>全部</td>
				<td>成都易米网络科技有限公司</td>
				<td><a href="#">编辑</a> <a href="#">删除</a> <a href="#">指派司机</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>
<br>
<div class="row clearfix">
	<div class="col-md-2 column"></div>
	<div id="carAssign" class="col-md-8 column"></div>
	<div class="col-md-2 column"></div>
	<script>
		$("#carAssign").load('<c:url value="/car/assign"/>');
	</script>
</div>

