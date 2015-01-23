/**
 * UI Control for driver
 */
function deleteDriverDialog(driverID,driverName) {
	bootbox.confirm({
		buttons : {
			confirm : {
				label : '确定',
				className : 'btn btn-primary'
			},
			cancel : {
				label : '取消',
				className : 'btn btn-default'
			}
		},
		message : "司机:"+driverID+","+driverName,
		callback : function(result) {
			if (result) {
				deleteDriver(driverID);
			}
		},
		title : "确定要删除司机吗？",
	});
}

function blockDriverDialog(driverID,block) {
	bootbox.confirm({
		buttons : {
			confirm : {
				label : '确定',
				className : 'btn btn-primary'
			},
			cancel : {
				label : '取消',
				className : 'btn btn-default'
			}
		},
		message : "司机:"+driverID,
		callback : function(result) {
			if (result) {
				blockDriver(driverID,block);
			}
		},
		title : "确定要"+(block?"冻结":"解冻")+"司机吗？",
	});
}

function changePwdDialog(driverID) {
	bootbox.confirm({
		buttons : {
			confirm : {
				label : '确定',
				className : 'btn btn-primary'
			},
			cancel : {
				label : '取消',
				className : 'btn btn-default'
			}
		},
		message : "<input type='password' id='pwdContent' class='form-control' placeholder='密码不为空'>",
		callback : function(result) {
			if (result) {
				var data = $('#pwdContent').val();
				changePwd(driverID,data)
			}
		},
		title : "修改司机密码",
	});
}

function chargeDriverDialog(driverID) {
	bootbox.confirm({
		buttons : {
			confirm : {
				label : '确定',
				className : 'btn btn-primary'
			},
			cancel : {
				label : '取消',
				className : 'btn btn-default'
			}
		},
		message : "<input type='text' id='amountContent' class='form-control'>",
		callback : function(result) {
			if (result) {
				var data = $('#amountContent').val();
				rechargeDriver(driverID,data)
			}
		},
		title : "充值",
	});
}

/**
 * Ajax for driver
 */
function deleteDriver(driverID){
	infoData("正在发送请求-删除司机:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID, {
		_method : "DELETE"
	}, function(data, status) {
		alertData(status,data);
		$(".drivers").children("tr#" + driverID).hide();		
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}

function blockDriver(driverID,block){
	infoData("正在发送请求-"+(block?"冻结":"解冻")+"司机:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID, {
		_method : "PUT",
		block	: block
	}, function(data, status) {
		alertData(status,data);	
		$(".drivers").children("tr#" + driverID).children("td").children("#block").removeAttr("onclick");
		$(".drivers").children("tr#" + driverID).children("td").children("#block").unbind("click");
		$(".drivers").children("tr#" + driverID).children("td").children("#block").click(function(){blockDriverDialog(driverID,!block);});
		$(".drivers").children("tr#" + driverID).children("td").children("#block").text((!block?"冻结":"解冻"));
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}

function changePwd(driverID,pwd){
	infoData("正在发送请求-修改密码,司机:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID, {
		_method : "PUT",
		pwd	: pwd
	}, function(data, status) {
		alertData(status,data);	
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}

function rechargeDriver(driverID,amount){
	infoData("正在发送请求-充值,司机:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID, {
		_method : "PUT",
		amount	: amount
	}, function(data, status) {
		alertData(status,data);	
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}
