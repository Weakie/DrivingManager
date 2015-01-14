<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th style="width:">司机</th>
				<th style="width:">司机电话</th>
				<th style="width:">客户</th>
				<th style="width:">客户电话</th>
				<th style="width:">时间</th>
				<th style="width:">时长</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${callRecords }" var="call">
				<tr>
					<td>${call.driver.name }</td>
					<td>${call.driver.telephone }</td>
					<td>${call.customer.name }</td>
					<td>${call.customer.telephone }</td>
					<td><fmt:formatDate value="${call.time }" type="both" pattern="MM/dd HH:mm" /></td>
					<td>${call.seconds }秒</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>