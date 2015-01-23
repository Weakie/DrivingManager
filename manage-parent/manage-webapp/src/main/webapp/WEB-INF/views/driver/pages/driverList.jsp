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
		<tbody class="drivers">
			<c:forEach items="${driverList }" var="driver">
				<tr id="${driver.driverID }">
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
					<td><c:if test="${driver.verify == 1 }">
							<a class="btn btn-link btn-xs mybtn" href="<c:url value="/driver/${driver.driverID }"/>">编辑</a>
							<button class="btn btn-link btn-xs mybtn" onclick="deleteDriverDialog('${driver.driverID }','${driver.realName }')">删除</button>
							<button class="btn btn-link btn-xs mybtn" onclick="blockDriverDialog('${driver.driverID }', ${not driver.blocked })" id="block">
								<c:if test="${not driver.blocked }">冻结</c:if>
								<c:if test="${driver.blocked }">解冻</c:if>
							</button>
							<button class="btn btn-link btn-xs mybtn" onclick="changePwdDialog('${driver.driverID }')">改密码</button>
							<button class="btn btn-link btn-xs mybtn" onclick="chargeDriverDialog('${driver.driverID }')">充值</button>
							<button class="btn btn-link btn-xs mybtn" onclick="">消费历史</button>
							<button class="btn btn-link btn-xs mybtn" <c:if test="${driver.binding }">onclick="unbindDriverTelDialog('${driver.driverID }','${driver.realName }','${driver.telephone }')"</c:if> id="unbind">
								<c:if test="${driver.binding }">解绑</c:if>
								<c:if test="${not driver.binding }">未绑定</c:if>
							</button>
							<button class="btn btn-link btn-xs mybtn" <c:if test="${driver.online }">onclick="offlineDriverDialog('${driver.driverID }','${driver.realName }','${driver.telephone }')"</c:if> id="online">
								<c:if test="${driver.online }">强制下线</c:if>
								<c:if test="${not driver.online }">未上线</c:if>
							</button>
						</c:if> <c:if test="${driver.verify != 1 }">
							<c:if test="${driver.verify == 0 }">
								<button class="btn btn-link btn-xs mybtn" onclick="verifyDriverDialog('${driver.driverID }',true)">通过</button>
								<button class="btn btn-link btn-xs mybtn" onclick="verifyDriverDialog('${driver.driverID }',false)" id="verify">不通过</button>
							</c:if>
							<c:if test="${driver.verify == -1 }">
								<button class="btn btn-link btn-xs mybtn" onclick="verifyDriverDialog('${driver.driverID }',true)">通过</button>
							</c:if>
						</c:if></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>
<c:if test="${not empty script }">
	<script>
		document.getElementById('balanceUnder200').innerText = "${pc.totalNum}";
	</script>
</c:if>