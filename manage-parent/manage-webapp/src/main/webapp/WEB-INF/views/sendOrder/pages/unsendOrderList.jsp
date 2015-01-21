<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<ul class="list-group">
	<c:forEach items="${orderList }" var="order">
		<li class="list-group-item">
			<font size="1"> 
				<label class="checkbox-inline" style="padding-left: 0px"> 
					<input type="radio" name="radio" id="radio-${order.orderID }" value="${order.orderID }"> 
					<fmt:formatDate value="${order.aptmtTime }" type="both" pattern="HH:mm" />
					${order.aptmtPlace }
					<input type="hidden" name="coordt" value="${order.aptmtCoordt.value }">
				</label>
			</font>
		</li>
	</c:forEach>
</ul>
<div id="pageTurning" style="text-align: center">
	<ul class="pagination pagination-sm" style="margin: -10 0">
		<li><a role="button" class="btn" onclick="prevPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum})">前一页</a></li>
		<li><a role="button" class="btn" onclick="currPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum})">第${pc.pageIndex}/${pc.totalPage }页</a></li>
		<li><a role="button" class="btn" onclick="nextPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum}, ${pc.totalPage })">后一页</a></li>
	</ul>
</div>