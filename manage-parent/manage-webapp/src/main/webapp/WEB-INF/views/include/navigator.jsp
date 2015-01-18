<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-inverse" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">代驾管理系统</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li <c:if test="${nav == 1 }">class="active"</c:if>><a href="<c:url value="/orders"/>">订单</a></li>
			<!-- <li <c:if test="${nav == 2 }">class="active"</c:if>><a href="#">调度</a></li>  -->
			<li <c:if test="${nav == 3 }">class="active"</c:if>><a href="<c:url value="/send"/>">派单</a></li>
			<li <c:if test="${nav == 4 }">class="active"</c:if>><a href="<c:url value="/drivers"/>">司机</a></li>
			<li <c:if test="${nav == 5 }">class="active"</c:if>><a href="<c:url value="/customers"/>">客户</a></li>
			<!-- <li <c:if test="${nav == 6 }">class="active"</c:if>><a href="#">统计</a></li> -->
			<li <c:if test="${nav == 7 }">class="active"</c:if>><a href="<c:url value="/companys"/>">公司</a></li>
			<li <c:if test="${nav == 8 }">class="active"</c:if>><a href="<c:url value="/cars"/>">工作车</a></li>
			<!--<li <c:if test="${nav == 9 }">class="active"</c:if>><a href="#">APP</a></li>
			<li <c:if test="${nav == 10}">class="active"</c:if>><a href="#">通知</a></li>
			<li <c:if test="${nav == 11}">class="active"</c:if>><a href="#">财务</a></li>-->
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<!-- <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> 营销 <b class="caret"></b>
			</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> 微信 <b class="caret"></b>
			</a></li> -->
			<li class="<c:if test="${nav == 12 }">active</c:if> dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> 系统<b class="caret"></b>
			</a>
				<ul class="dropdown-menu">
					<li><a href="<c:url value="/sysconfig"/>">系统配置</a></li>
					<li class="divider"></li>
					<li><a href="<c:url value="/roles"/>">角色设置</a></li>
					<li><a href="#">用户管理</a></li>
					<li class="divider"></li>
					<li><a href="#">地区收费</a></li>
					<li><a href="#">提成设置</a></li>
				</ul></li>
		</ul>
	</div>
</nav>