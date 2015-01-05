<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table">
	<thead>
		<tr>
			<th>状态</th>
			<th>被接司机</th>
			<th>被接司机电话</th>
			<th>接送地点</th>
			<th>预计到达</th>
			<th>订单号</th>
			<th>接送司机</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${orderList }" var="order">
			<tr>
				<td><span class="label label-info">未接送</span></td>
				<td>马瑞</td>
				<td>15018911678</td>
				<td>前进西路</td>
				<td>09-02 14:40</td>
				<td>无</td>
				<td></td>
				<td><a href="#">取消</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>