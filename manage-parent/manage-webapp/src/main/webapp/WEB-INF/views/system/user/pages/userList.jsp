<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th style="width:">账号</th>
				<th style="width:">所属公司</th>
				<th style="width:">是否冻结</th>
				<th style="width:">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.companyName }</td>
					<td>否</td>
					<td><a href="#">编辑</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../../include/page_turning.jsp"%>