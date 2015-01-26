<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th>日期</th>
				<th>操作</th>
				<th>金额</th>
				<th>备注</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${consumeList }" var="info">
				<tr>
					<td><fmt:formatDate value="${info.time }" type="both" pattern="MM/dd HH:mm" /></td>
					<td>${info.ope }</td>
					<td>${info.amount }</td>
					<td>${info.comment }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>