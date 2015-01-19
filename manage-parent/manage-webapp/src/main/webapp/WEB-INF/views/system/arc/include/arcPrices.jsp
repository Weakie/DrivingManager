<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="panel panel-default">
	<div class="panel-heading">
		<div class="row clearfix">
			<div class="col-md-2 column" style="padding-right: 0px; width: 160px">
				<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"> 展开 </a> 开始代驾时间：（
			</div>
			<div class="col-md-1 column" style="padding-left: 0px; width: 70px">
				<select>
					<option>00</option>
					<option>01</option>
					<option>02</option>
					<option>03</option>
					<option>04</option>
				</select> :
			</div>
			<div class="col-md-1 column" style="padding-left: 0px; width: 70px">
				<select>
					<option>00</option>
					<option>01</option>
					<option>02</option>
					<option>03</option>
					<option>04</option>
				</select> -
			</div>
			<div class="col-md-1 column" style="padding-left: 0px; width: 70px">
				<select>
					<option>00</option>
					<option>01</option>
					<option>02</option>
					<option>03</option>
					<option>04</option>
				</select> :
			</div>
			<div class="col-md-1 column" style="padding-left: 0px; width: 70px">
				<select>
					<option>00</option>
					<option>01</option>
					<option>02</option>
					<option>03</option>
					<option>04</option>
				</select> )
			</div>
			<div class="col-md-1 column" style="padding-left: 0px; padding-right: 0px; width: 50px">起步价</div>
			<div class="col-md-1 column" style="padding-left: 0px; width:">
				<input type="text" id="name" style="width: 50px"> 元
			</div>
			<div class="col-md-3 column"></div>
			<div class="col-md-1 column" style="width: 220px; text-align: right">
				<div class="btn-group">
					<button type="button" class="btn btn-default btn-xs">添加里程价格</button>
					<button type="button" class="btn btn-default btn-xs">修改</button>
					<button type="button" class="btn btn-default btn-xs">删除</button>
				</div>
			</div>
		</div>
	</div>
	<div id="collapseOne" class="panel-collapse collapse">
		<div class="panel-body">
			<%@ include file="./arcMilePrices.jsp"%>
			<div class="row clearfix">
				<div class="col-md-1 column" style="width: 60px; padding-right: 0px">超过（</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 125px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 公里）以后每
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 115px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 公里（不足
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 150px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 公里不计费）加收
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 130px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 元。免费等候
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 115px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 分钟，后每
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 115px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 分钟（低于
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 150px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 分钟不计费）加收
				</div>
				<div class="col-md-2 column" style="padding-left: 0px; width: 110px; padding-right: 0px">
					<input type="text" style="border: 0px; width: 30px"> 元！
				</div>
			</div>
		</div>
	</div>
</div>