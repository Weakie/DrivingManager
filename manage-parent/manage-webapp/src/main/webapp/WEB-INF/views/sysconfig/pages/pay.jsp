<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="panel panel-default">
	<div class="panel-heading">支付配置</div>
	<div class="panel-body">
		<div class="row claerfix">
			<div class="col-md-6 column">
				<p>支付宝配置</p>
				<hr>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right">
						<b>描述：</b>
					</div>
					<div class="col-md-8 column">
						<textarea rows="4" class="form-control"></textarea>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right">
						<b>上传图片：</b>
					</div>
					<div class="col-md-8 column">
						<form class="form-inline" role="form">
							<div class="form-group">
								<label class="sr-only" for="inputfile">文件输入</label> <input type="file" id="inputfile">
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-6 column">
				<p>微信支付配置</p>
				<hr>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right">
						<b>描述：</b>
					</div>
					<div class="col-md-8 column">
						<textarea rows="4" class="form-control"></textarea>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right">
						<b>上传图片：</b>
					</div>
					<div class="col-md-8 column">
						<form class="form-inline" role="form">
							<div class="form-group">
								<label class="sr-only" for="inputfile">文件输入</label> <input type="file" id="inputfile">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<br>
		<div class="row clearfix">
			<div class="col-md-5 column" style="text-align: right"></div>
			<div class="col-md-7 column">
				<button type="button" class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-default">返回</button>
			</div>
		</div>
	</div>
</div>