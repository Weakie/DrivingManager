<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<table class="table table-bordered">
	<thead>
		<tr>
			<th>#</th>
			<th>司机姓名</th>
			<th>距离(公里)</th>
			<th>本日代驾</th>
			<th>本月代驾</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${driverList }" var="driver">
			<tr>
				<td><label> <input name="drivers" value="${driver.driverID }" type="checkbox">
				</label></td>
				<td>${driver.realName }</td> 
				<td>${driver.distance }</td>
				<td>${driver.timesCurrentDay }次</td>
				<td>${driver.timesCurrentMonth }次</td>
			</tr>
		</c:forEach>
	</tbody>
</table>