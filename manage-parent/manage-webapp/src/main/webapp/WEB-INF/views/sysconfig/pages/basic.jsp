<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">基础配置</div>
	<div class="panel-body">
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-2 column" style="text-align: right; padding-top: 8px">
				<font color="red">*</font><b>工作开始时间：</b>
			</div>
			<div class="col-md-5 column" style="padding-left: 0px">
				<select class="form-control">
					<option>8</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
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
				<select class="form-control">
					<option>接单时</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
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
					<input type="text" class="form-control"> <span class="input-group-addon">元</span>
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
					<input type="text" class="form-control"> <span class="input-group-addon">分钟</span>
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
				<input id="switch-onText" type="checkbox" checked data-on-text="允许" data-off-text="不允许" data-on-color="info">
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
				<input type="text" class="form-control">
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
				<button type="button" class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default">返回</button>
			</div>
		</div>
	</div>
</div>