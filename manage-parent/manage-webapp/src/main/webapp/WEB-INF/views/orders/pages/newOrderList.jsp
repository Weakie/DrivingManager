<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table">
	<thead>
		<tr>
			<th>单号</th>
			<th>类型</th>
			<th>来源</th>
			<th>预约时间</th>
			<th>预约地</th>
			<th>客户姓名</th>
			<th>客户电话</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${orderList }" var="order">
			<tr id="${order.orderID }">
				<td><a href="<c:url value="/order/${order.orderID }"/>">***${fn:substring(order.orderID,5,fn:length(order.orderID)) }</a></td>
				<td>${order.orderType }</td>
				<td>${order.orderSource }</td>
				<td><fmt:formatDate value="${order.aptmtTime }" type="both" pattern="MM/dd HH:mm" /></td>
				<td>${order.aptmtPlace }</td>
				<td>${order.customer.name }</td>
				<td>${order.customer.telephone }</td>
				<td id="cmt-${order.orderID }">${fn:substring(order.comment,0,8) }</td>
				<td><a type="button" class="btn btn-link btn-xs mybtn" href="<c:url value="/send/${order.orderID }"/>">派单</a>
					<button type="button" class="btn btn-link btn-xs mybtn" onclick="destroyOrder('${order.orderID}')">销单</button>
					<button type="button" class="btn btn-link btn-xs mybtn" onclick="commentDialog('${order.orderID}')">备注</button></td>
			</tr>
			<input type="hidden" id="comment-${order.orderID }" value="${order.comment }">
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>
