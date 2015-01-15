<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">派单配置</div>
	<div class="panel-body">
		<div class="row clearfix">
			<div class="col-md-4 column" style="text-align: right">
				<font color="red">*</font><b>推荐司机距离：</b>
			</div>
			<div class="col-md-6 column">
				<div class="input-group">
					<input type="text" class="form-control"> <span class="input-group-addon">公里</span>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-4 column" style="text-align: right"></div>
			<div class="col-md-6 column">设置调度列表模式中显示多少公里范围内的推荐司机</div>
		</div>
		<br>
		<div class="row clearfix">
			<div class="col-md-4 column" style="text-align: right"></div>
			<div class="col-md-6 column">
				<button type="button" class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default">返回</button>
			</div>
		</div>
	</div>
</div>