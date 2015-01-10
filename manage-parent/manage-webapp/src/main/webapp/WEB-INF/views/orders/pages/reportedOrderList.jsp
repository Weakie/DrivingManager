<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table">
	<thead>
		<tr>
			<th>订单号</th>
			<th>类型</th>
			<th>客户姓名</th>
			<th>客户电话</th>
			<th>接单司机</th>
			<th>司机电话</th>
			<th>所属公司</th>
			<th>目的地</th>
			<th>结算时间</th>
			<th>应收金额</th>
			<th>实收金额</th>
			<th>车牌号</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${orderList }" var="order">
			<tr>
				<td><a href="<c:url value="/order/${order.orderID }"/>">***${fn:substring(order.orderID,5,fn:length(order.orderID)) }</a></td>
				<td>${order.orderType }</td>
				<td>${order.customer.name }</td>
				<td>${order.customer.telephone }</td>
				<td>${order.driver.name }</td>
				<td>${order.driver.telephone }</td>
				<td>${order.driver.company }</td>
				<td>${order.destination }</td>
				<td><fmt:formatDate value="${order.payedTime }"  type="both" pattern="MM/dd HH:mm"/></td>
				<td>${order.shouldPay }</td>
				<td>${order.actualPay }</td>
				<td>${order.carNumber }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>