<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">代驾协议</div>
	<div class="panel-body">
		<form action="<c:url value="/sysconfig/protocol"/>" method="POST">
			<div class="row clearfix">
				<input type="hidden" name="_method" value="PUT">
				<div class="col-md-4 column" style="text-align: right">
					<b>代驾协议:</b>
				</div>
				<div class="col-md-5 column">
					<textarea rows="5" name="protocol" required="required" class="form-control">${protocol }</textarea>
				</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-4 column" style="text-align: right"></div>
				<div class="col-md-5 column">
					<input type="submit" class="btn btn-primary" value="保存">
					<button type="button" class="btn btn-default">返回</button>
				</div>
			</div>
		</form>
	</div>
</div>