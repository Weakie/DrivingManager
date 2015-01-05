<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<ul class="list-group">
	<c:forEach items="${orderList }" var="order">
		<li class="list-group-item"><font size="1"> <label class="checkbox-inline" style="padding-left: 0px"> <input type="radio" name="optionsRadiosinline" id="optionsRadios3" value="${order.orderID }"> <fmt:formatDate
						value="${order.aptmtTime }" type="both" pattern="HH:mm" />${order.aptmtPlace }
			</label></font></li>
	</c:forEach>
</ul>
