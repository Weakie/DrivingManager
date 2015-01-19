<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th style="width:20%">城市</th>
				<th style="width:60%">备注</th>
				<th style="width:20%">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${arcList }" var="arc">
				<tr>
					<td>上海</td>
					<td>上海市收费标准</td>
					<td><a href="#">编辑</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../../include/page_turning.jsp"%>