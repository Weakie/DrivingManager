<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div style="border: 1px solid #D3D3D3">
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
					<td>${area.city }</td>
					<td>${area.district }</td>
					<td><a href="#">编辑</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>