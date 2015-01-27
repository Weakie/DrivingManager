<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:forEach items="${driverList }" var="driver" varStatus="state">
	<c:if test="${state.count%2 == 1 || state.first}">
		<div class="row clearfix">
	</c:if>
	<div class="col-md-6 column">
		<c:if test="${driver.currentState eq 'FREE' }"><c:set var="panel_class" value="success"/></c:if>
		<c:if test="${driver.currentState eq 'WORKINGCAR' }"><c:set var="panel_class" value="danger"/></c:if>
		<c:if test="${driver.currentState eq 'BUSY' }"><c:set var="panel_class" value="danger"/></c:if>
		<div class="panel panel-${panel_class }">
			<div class="panel-heading">
				<c:if test="${driver.currentState eq 'FREE' }"><c:set var="label_class" value="success"/></c:if>
				<c:if test="${driver.currentState eq 'WORKINGCAR' }"><c:set var="label_class" value="info"/></c:if>
				<c:if test="${driver.currentState eq 'BUSY' }"><c:set var="label_class" value="danger"/></c:if>
				<span class="label label-${label_class }">${driver.realName }</span>
				<font color="00CEd1">(${driver.currentPosition })</font>
				<c:if test="${not empty driver.beginPosition }">
					${driver.beginPosition}(<fmt:formatDate value="${driver.beginTime }" type="both" pattern="HH:mm" />)
				</c:if>
				<c:if test="${empty driver.beginPosition }">
					(未知)
				</c:if>
				<c:if test="${not empty driver.endPosition || not empty driver.beginPosition}">
					→
				</c:if>
				<c:if test="${not empty driver.endPosition }">
					${driver.endPosition}(<fmt:formatDate value="${driver.endTime }" type="both" pattern="HH:mm" />)
				</c:if>
				<c:if test="${empty driver.endPosition }">
					(未知)
				</c:if>
			</div>
		</div>
	</div>
	<c:if test="${state.count%2 == 0 || state.last }">
		</div>
	</c:if>
</c:forEach>
<%@ include file="../../include/page_turning.jsp"%>