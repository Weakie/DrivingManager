<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table" style="border: 1px solid #D3D3D3">
	<thead>
		<tr>
			<th style="width: 15%">状态</th>
			<th style="width: 20%">单号</th>
			<th style="width: 10%">类型</th>
			<th style="width: 10%">来源</th>
			<th style="width: 15%">预约时间</th>
			<th style="width: 30%">预约地点</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${orderList }" var="order">
			<tr>
				<td><span class="label label-info">新订单</span></td>
				<td><a href="#"><font color="#1E90FF">***${fn:substring(order.orderID,5,fn:length(order.orderID)) }</font></a></td>
				<td>${order.orderType }</td>
				<td>${order.orderSource }</td>
				<td><fmt:formatDate value="${order.aptmtTime }" type="both" pattern="MM/dd HH:mm" /></td>
				<td>${order.aptmtPlace }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>