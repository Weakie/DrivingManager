<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">基础配置</div>
	<div class="panel-body">
		<form action="<c:url value="/sysconfig/basic"/>" method="POST">
			<div class="row clearfix">
				<input type="hidden" name="_method" value="PUT">
				<div class="col-md-3 column"></div>
				<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>工作开始时间：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<select name="startTime" class="form-control">
						<c:forEach items="${startTimes }" var="time">
							<option value="${time }" <c:if test="${basic.startTime eq item}">selected</c:if>>${time }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">选择工作的开始时间，结束时间为开始时间加上24，晚上12点为0时</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-3 column"></div>
				<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>信息费扣取时间：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<select name="debPeriod" class="form-control">
						<c:forEach items="${debPeriods }" var="period">
							<option value="${period.key }" <c:if test="${basic.debPeriod eq period.key}">selected</c:if>>${period.value }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">设置在订单的哪个时间点扣取司机的信息费</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-3 column"></div>
				<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>信息费扣取金额：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<div class="input-group">
						<input type="text" name="debAmount" value="${basic.debAmount }" required="required" class="form-control">
						<span class="input-group-addon">元</span>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">设置扣取司机每单信息费的金额，0元不产生记录</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-3 column"></div>
				<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>自动收回时间：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<div class="input-group">
						<input type="text" name="recoveryTime" value="${basic.recoveryTime }" required="required" class="form-control"> <span
							class="input-group-addon">分钟</span>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">如果司机在该配置时间内没有接单，那么系统将自动收回</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-2 column"></div>
				<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>是否允许直接呼叫司机：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<input id="switch-onText" name="callDriverDirectly" type="checkbox"
						<c:if test="${basic.callDriverDirectly }">checked</c:if> data-on-text="允许" data-off-text="不允许"
						data-on-color="info">
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">是否允许用户通过手机APP直接拨打司机电话下单；如果不允许，用户呼叫用户将变为呼叫司机对应公司的APP电话</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-3 column"></div>
				<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
					<font color="red">*</font><b>公司网址：</b>
				</div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<input type="text" name="companyURL" value="${basic.companyURL }" required="required" class="form-control">
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">配置公司网站地址，用于在APP中进行显示</div>
			</div>
			<br>
			<div class="row clearfix">
				<div class="col-md-5 column"></div>
				<div class="col-md-5 column" style="padding-left: 0px">
					<input type="submit" class="btn btn-primary" value="保存 ">
					<button type="button" class="btn btn-default">返回</button>
				</div>
			</div>
		</form>
	</div>
</div>