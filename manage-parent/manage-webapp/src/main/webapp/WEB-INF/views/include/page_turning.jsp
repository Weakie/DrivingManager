<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty pagePath }">
	<c:set var="path" value="${pc.pagePath }" />
</c:if>
<c:if test="${empty pageData }">
	<c:set var="data" value="${pc.pageData }" />
</c:if>
<div id="pageTurning" style="text-align: right; margin: -5 0">
	<ul class="pagination pagination-sm">
		<li><a role="button" class="btn" onclick="prevPage(this, '${path }', '${data }', ${pc.pageIndex}, ${pc.pageNum})">前一页</a></li>
		<li><a role="button" class="btn" onclick="currPage(this, '${path }', '${data }', ${pc.pageIndex}, ${pc.pageNum})">第${pc.pageIndex}/${pc.totalPage }页(点击刷新)</a></li>
		<li><a role="button" class="btn" onclick="nextPage(this, '${path }', '${data }', ${pc.pageIndex}, ${pc.pageNum}, ${pc.totalPage })">后一页</a></li>
	</ul>
</div>