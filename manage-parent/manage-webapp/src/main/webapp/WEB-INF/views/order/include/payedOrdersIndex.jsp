<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--已销单-->
<div class="panel panel-info">
	<div class="panel-heading">已结算</div>
	<div class="panel-body">
		<c:import url="/orders">
			<c:param name="type" value="payed" />
			<c:param name="pageIndex" value="1" />
			<c:param name="pageNum" value="10" />
		</c:import>
	</div>
</div>