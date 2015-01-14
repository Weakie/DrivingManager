<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-hover">
	<thead style="background-color: #DCDCDC">
		<tr>
			<th style="width:">城市</th>
			<th style="width:">区名</th>
			<th style="width:">操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${areaList }" var="area">
			<tr>
				<td>重庆</td>
				<td>重庆</td>
				<td><a href="#">编辑</a> <a href="#">删除</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>