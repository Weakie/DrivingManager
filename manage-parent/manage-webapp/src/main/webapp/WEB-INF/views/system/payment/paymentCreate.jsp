<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<%@ include file="../../include/resource_link.jsp"%>
<title>${title }-代驾管理系统</title>
</head>
<body>
	<div class="container">
		<c:set var="nav" value="12" />
		<%@ include file="../../include/navigator.jsp"%>
		<div style="height: 20px;">
			<ul class="breadcrumb">
				<li><a href="#">提成管理</a> <span class="divider"></span></li>
				<li class="active">${title }<span class="divider"></span>
				</li>
				<li><a href="#">返回</a> <span class="divider"></span></li>
			</ul>
		</div>
		<br>
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="row clearfix">
					<div class="col-md-11 column">填写提成信息</div>
					<div class="col-md-1 column">
						<button type="button" class="btn btn-success btn-xs">新增时间段</button>
					</div>
				</div>
			</div>
			<div class="panel-body">
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
						<font color="red">*</font><b>名称:</b>
					</div>
					<div class="col-md-3 column">
						<input type="text" class="form-control" id="name">
					</div>
				</div>
				<br>
				<hr>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right">
						<font color="red">*</font><b>时间:</b>
					</div>
					<div class="col-md-3 column">
						<div class="row clearfix">
							<div class="col-md-3 column" style="padding-right: 0px">
								<select style="width: 50px">
									<option>00</option>
									<option>01</option>
									<option>02</option>
									<option>03</option>
									<option>04</option>
								</select>
							</div>
							<div class="col-md-3 column" style="padding-left: 0px; padding-right: 0px">
								<select style="width: 50px">
									<option>00</option>
									<option>01</option>
									<option>02</option>
									<option>03</option>
									<option>04</option>
								</select> 至
							</div>
							<div class="col-md-3 column" style="padding-left: 0px; padding-right: 0px; width: 55px">
								<select style="width: 50px">
									<option>00</option>
									<option>01</option>
									<option>02</option>
									<option>03</option>
									<option>04</option>
								</select>
							</div>
							<div class="col-md-3 column" style="padding-left: 0px; padding-right: 0px">
								<select style="width: 50px">
									<option>00</option>
									<option>01</option>
									<option>02</option>
									<option>03</option>
									<option>04</option>
								</select>
							</div>
						</div>
					</div>
					<div class="col-md-5 column"></div>
					<div class="col-md-1 column">
						<button type="button" class="btn btn-link btn-xs">删除</button>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
						<font color="red">*</font><b>提成（固定）:</b>
					</div>
					<div class="col-md-3 column">
						<div class="input-group">
							<input type="text" class="form-control"> <span class="input-group-addon">元</span>
						</div>
					</div>
					<div class="col-md-6 column">该固定提成为公司所得提成，不使用固定提成请设置为0.</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
						<font color="red">*</font><b>提成（比例）:</b>
					</div>
					<div class="col-md-3 column">
						<div class="input-group">
							<input type="text" class="form-control"> <span class="input-group-addon">%</span>
						</div>
					</div>
					<div class="col-md-6 column">该提成比例为公司所得提成比例，不使用按比例提成请设置为0.</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column" style="text-align: right; padding-top: 8px">
						<font color="red">*</font><b>提成类型:</b>
					</div>
					<div class="col-md-2 column" style="width: 140px">
						<div class="radio">
							<label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
								使用固定提成
							</label>
						</div>
					</div>
					<div class="col-md-2 column">
						<div class="radio">
							<label> <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
								使用比例提成
							</label>
						</div>
					</div>
				</div>
				<br>
				<div class="row clearfix">
					<div class="col-md-3 column"></div>
					<div class="col-md-3 column">
						<button type="button" class="btn btn-primary">保存</button>
						<button type="button" class="btn btn-default">返回</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>