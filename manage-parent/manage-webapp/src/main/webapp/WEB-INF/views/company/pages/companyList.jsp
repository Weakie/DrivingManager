<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<div style="border: 1px solid #D3D3D3">
	<table class="table table-hover">
		<thead style="background-color: #DCDCDC">
			<tr>
				<th style="width:">公司名称</th>
				<th style="width:">联系电话</th>
				<th style="width:">负责人</th>
				<th style="width:">手机号码</th>
				<th style="width:">公司地址</th>
				<th style="width:">地区</th>
				<th style="width:">操作</th>
			</tr>
		</thead>
		<tbody class="companys">
			<c:forEach items="${companyList }" var="company">
				<tr id="${company.id }">
					<td>${company.name }</td>
					<td>${company.telephone }</td>
					<td>${company.principle }</td>
					<td>${company.mobileNum }</td>
					<td>${company.addr }</td>
					<td>${company.city }</td>
					<td><a class="btn btn-link btn-xs mybtn" href="<c:url value="/company/${company.id }"/>">编辑</a>
						<button class="btn btn-link btn-xs mybtn" onclick="deleteCompanyDialog('${company.id }','${company.name }')">删除</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../../include/page_turning.jsp"%>