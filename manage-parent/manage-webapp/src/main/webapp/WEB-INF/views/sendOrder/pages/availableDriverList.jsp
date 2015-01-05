<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<ul class="list-group">
	<c:forEach items="${driverList }" var="driver">
		<li class="list-group-item">
			<div class="row clearfix">
				<div class="col-md-10 column" style="padding-right: 0px">
					<font size="1">${driver.realName } ${driver.telephone } ${driver.distance }公里</font>
				</div>
				<div class="col-md-2 column" style="padding-right: 0px; padding-left: 0px">
					<button type="button" class="btn btn-default btn-xs">派单</button>
				</div>
			</div>
		</li>
	</c:forEach>
</ul>