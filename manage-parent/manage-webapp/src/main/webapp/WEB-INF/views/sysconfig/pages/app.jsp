<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">APP设置</div>
	<div class="panel-body">
		<div class="row clearfix">
			<div class="col-md-7 column">
				<p>司机端</p>
				<hr>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
						<b>是否允许抢单：</b>
					</div>
					<div class="col-md-9 column" style="padding-left: 0px">
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
							<input type="text" class="form-control"> <span class="input-group-addon">公里</span>
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
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
						<input id="switch-onText" type="checkbox" checked data-on-text="开启" data-off-text="关闭">
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
							<input type="text" class="form-control"> <span class="input-group-addon">公里</span>
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
						<textarea rows="3" class="form-control"></textarea>
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
				<button type="button" class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default">返回</button>
			</div>
		</div>
	</div>
</div>