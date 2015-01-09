<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty path }">
	<c:set var="path" value="${pc.path }" />
</c:if>
<c:if test="${empty data }">
	<c:set var="data" value="${pc.data }" />
</c:if>
<div id="pageTurning" style="text-align: right">
	<ul class="pagination pagination-sm">
		<li><a href="#" onclick="prevPage(this, '${path }', '${data }', ${pc.pageIndex})">前一页</a></li>
		<li><a href="#" onclick="currPage(this, '${path }', '${data }', ${pc.pageIndex})">第${pc.pageIndex}/${pc.totalPage }页(点击刷新)</a></li>
		<li><a href="#" onclick="nextPage(this, '${path }', '${data }', ${pc.pageIndex}, ${pc.totalPage })">后一页</a></li>
	</ul>
</div>