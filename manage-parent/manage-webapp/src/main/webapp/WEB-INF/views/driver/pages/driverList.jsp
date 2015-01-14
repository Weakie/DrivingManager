<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th style="width:">昵称</th>
				<th style="width:">真实姓名</th>
				<th style="width:">工号</th>
				<th style="width:">手机号</th>
				<th style="width:">余额</th>
				<th style="width:">员工类型</th>
				<th style="width:">状态</th>
				<th style="width:">移动端APP版本</th>
				<th style="width:">公司</th>
				<th style="width:">时间</th>
				<th style="width:">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${driverList }" var="driver">
				<tr>
					<td>${driver.nickName }</td>
					<td>${driver.realName }</td>
					<td>${driver.driverID }</td>
					<td>${driver.telephone }</td>
					<td><font color="#DAA520"><b><fmt:formatNumber value="${driver.balance }" type="currency" /></b></font></td>
					<td>${driver.typeString }</td>
					<td><font color="#008000"><b>${driver.stateString }</b></font></td>
					<td>${driver.version }</td>
					<td>${driver.companyName }</td>
					<td><fmt:formatDate value="${driver.registeTime }" type="both" pattern="MM/dd HH:mm" /></td>
					<td><a href="#">编辑</a> <a href="#">删除</a> <a href="#">冻结</a> <a href="#">改密码</a> <a href="#">充值</a> <a href="#">消费历史</a> <a href="#">解绑</a> <a href="#">强制下线</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>
<c:if test="${not empty script }">
	<script>
		document.getElementById('balanceUnder200').innerText = ${pc.totalNum};
	</script>
</c:if>