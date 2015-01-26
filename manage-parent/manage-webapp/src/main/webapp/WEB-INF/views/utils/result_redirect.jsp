<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="3; url=<c:url value="${redirect}"/>">
<title>操作<c:if test="${result.success}">成功</c:if><c:if test="${not result.success}">失败</c:if></title>
</head>
<body> 
操作<c:if test="${result.success}">成功</c:if><c:if test="${not result.success}">失败</c:if>,
3秒后自动跳转到<a href="<c:url value="${redirect}"/>">页面</a>
${result.msg}
</body>
</html>