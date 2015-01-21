<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<ul class="list-group" id="${orderID }">
	<li class="list-group-item">
		<div class="row clearfix">
			<div class="col-md-12 column" style="padding-right: 0px;text-align: center">
				<font size="2" color="red">订单号:${orderID }</font>
			</div>
		</div>
	</li>
	<c:forEach items="${driverList }" var="driver">
		<li class="list-group-item">
			<div class="row clearfix">
				<div class="col-md-10 column" style="padding-right: 0px">
					<font size="1">${driver.realName } ${driver.telephone } ${driver.distance }公里</font>
				</div>
				<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
					<button type="button" class="btn btn-default btn-xs" onclick="sendOrderDialog('${orderID}','${driver.driverID }','','${driver.realName }')">派单</button>
				</div>
			</div>
		</li>
	</c:forEach>
</ul>
<div id="pageTurning" style="text-align: center">
	<ul class="pagination pagination-sm" style="margin:-10 0">
		<li><a role="button" class="btn" onclick="prevPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum})">前一页</a></li>
		<li><a role="button" class="btn" onclick="currPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum})">第${pc.pageIndex}/${pc.totalPage }页</a></li>
		<li><a role="button" class="btn" onclick="nextPage(this, '${pc.pagePath }', '${pc.pageData }', ${pc.pageIndex}, ${pc.pageNum}, ${pc.totalPage })">后一页</a></li>
	</ul>
</div>