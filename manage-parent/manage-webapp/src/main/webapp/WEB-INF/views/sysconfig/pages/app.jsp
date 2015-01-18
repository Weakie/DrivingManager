<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${resourceRoot}/js/main.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">APP设置</div>
	<div class="panel-body">
		<form action="<c:url value="/sysconfig/app"/>" method="POST">
			<div class="row clearfix">
				<input type="hidden" name="_method" value="PUT">
				<div class="col-md-7 column">
					<p>司机端</p>
					<hr>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>是否允许抢单：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="allowPeemptiveOrder" type="checkbox" <c:if test="${app.allowPeemptiveOrder }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否允许司机通过手机APP抢单</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>抢单距离：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<div class="input-group">
								<input type="text" name="peemptiveDistance" value="${app.peemptiveDistance }" required="required" pattern="^[+-]?([0-9]*\.?[0-9]+|[0-9]+\.?[0-9]*)([eE][+-]?[0-9]+)?$" class="form-control"> <span class="input-group-addon">公里</span>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">设置司机端显示多少公里范围内的订单</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>开启工作车：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="openWorkingCar" type="checkbox" <c:if test="${app.openWorkingCar }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否开启工作车</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>允许工作车转单：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="transOrderWorkingCar" type="checkbox" <c:if test="${app.transOrderWorkingCar }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否允许工作车转单</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>允许司机转单：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="transOrderDriver" type="checkbox" <c:if test="${app.transOrderDriver }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否允许司机转单</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>目的地必填：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="targetRequired" type="checkbox" <c:if test="${app.targetRequired }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否目的地必填</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
							<b>客户信息必填：</b>
						</div>
						<div class="col-md-9 column" style="padding-left: 0px">
							<input id="switch-onText" name="cusInfoRequired" type="checkbox" <c:if test="${app.cusInfoRequired }">checked</c:if> data-on-text="开启" data-off-text="关闭">
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-3 column"></div>
						<div class="col-md-9 column" style="padding-left: 0px">是否客户信息必填</div>
					</div>
				</div>
				<div class="col-md-5 column">
					<p>用户端</p>
					<hr>
					<div class="row clearfix">
						<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
							<font color="red">*</font><b>附近司机距离：</b>
						</div>
						<div class="col-md-8 column" style="padding-left: 0px">
							<div class="input-group">
								<input type="text" name="nearbyDriverDistance" value="${app.nearbyDriverDistance }" required="required" pattern="^[+-]?([0-9]*\.?[0-9]+|[0-9]+\.?[0-9]*)([eE][+-]?[0-9]+)?$" class="form-control"> <span class="input-group-addon">公里</span>
							</div>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-4 column"></div>
						<div class="col-md-8 column" style="padding-left: 0px">设置客户端显示多少公里范围内的司机</div>
					</div>
					<br>
					<div class="row clearfix">
						<div class="col-md-4 column" style="text-align: right; padding-top: 8px">
							<b>分享内容：</b>
						</div>
						<div class="col-md-8 column" style="padding-left: 0px">
							<textarea rows="3" name="shareContents" required="required" class="form-control">${app.shareContents }</textarea>
						</div>
					</div>
					<div class="row clearfix">
						<div class="col-md-4 column"></div>
						<div class="col-md-8 column" style="padding-left: 0px">配置分享内容，用于在APP中显示</div>
					</div>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-6 column"></div>
				<div class="col-md-6 column">
					<input type="submit" class="btn btn-primary" value="保存">
					<button type="button" class="btn btn-default">返回</button>
				</div>
			</div>
		</form>
	</div>
</div>