<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table table-hover">
	<thead style="background-color: #DCDCDC">
		<tr>
			<th style="width:">联系人</th>
			<th style="width:">客户来源</th>
			<th style="width:">手机号</th>
			<th style="width:">允许透支</th>
			<th style="width:">余额</th>
			<th style="width:">所属公司</th>
			<th style="width:">操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${customerList }" var="cus">
			<tr>
				<td>${cus.name }</td>
				<td>${cus.source }</td>
				<td>${cus.tel }</td>
				<td><c:if test="${cus.overdraft }">是</c:if> <c:if test="${not cus.overdraft }">否</c:if></td>
				<td><font color="#FFD700"> <fmt:formatNumber value="${cus.balance }" type="currency" /></font></td>
				<td>${cus.company }</td>
				<td><a href="#">编辑</a> <a href="#">删除</a> <a href="#">充值</a> <a href="#">消费历史</a> <a href="#">查看优惠券</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>