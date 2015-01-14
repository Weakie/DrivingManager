<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-hover">
	<thead style="background-color: #DCDCDC">
		<tr>
			<th style="width:">日期</th>
			<th style="width:">司机名称</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${assignList }" var="assign">
			<tr>
				<td>2014-08-27 20:53:57</td>
				<td>肖工</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="../../include/page_turning.jsp"%>