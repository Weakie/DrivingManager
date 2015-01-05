<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table">
	<thead>
		<tr>
			<th>单号</th>
			<th>所属公司</th>
			<th>类型</th>
			<th>来源</th>
			<th>预约时间</th>
			<th>预约地</th>
			<th>客户姓名</th>
			<th>客户电话</th>
			<th>接单司机</th>
			<th>司机电话</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${orderList }" var="order">
			<tr>
				<td><a href="#">***${fn:substring(order.orderID,5,fn:length(order.orderID)) }</a></td>
				<td>${order.driver.company }</td>
				<td>${order.orderType }</td>
				<td>${order.orderSource }</td>
				<td><fmt:formatDate value="${order.aptmtTime }"  type="both" pattern="MM/dd HH:mm"/></td>
				<td>${order.aptmtPlace }</td>
				<td>${order.customer.name }</td>
				<td>${order.customer.telephone }</td>
				<td>${order.driver.name }</td>
				<td>${order.driver.telephone }</td>
				<td><a href="#">销单</a> <a href="#">收回</a> <a href="#">备注</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>