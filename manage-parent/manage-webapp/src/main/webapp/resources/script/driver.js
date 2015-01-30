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

/**
 * 冻结司机
 * @param driverID
 * @param block 操作,true:冻结,false:解冻
 */
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

function unbindDriverTelDialog(driverID,driverName,driverTel) {
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
		message : "司机:"+driverID+","+driverName+","+driverTel,
		callback : function(result) {
			if (result) {
				unbindDriverTel(driverID);
			}
		},
		title : "确定要解除绑定吗？",
	});
}

function offlineDriverDialog(driverID,driverName,driverTel) {
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
		message : "司机:"+driverID+","+driverName+","+driverTel,
		callback : function(result) {
			if (result) {
				offlineDriver(driverID);
			}
		},
		title : "确定要强制下线吗？",
	});
}

function verifyDriverDialog(driverID,verify) {
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
				verifyDriver(driverID,verify);
			}
		},
		title : "司机审核"+(verify?"通过":"未通过")+"？",
	});
}

/**
 * UI event for driver
 */
function registerConsumeHistoryEventForDriver(){
	$("a[rel]").overlay({
		// 设置参数
		expose : { //启用expose效果
			color : '#BAD0DB', //expose颜色
			opacity : 0.7, //expose透明度
			closeSpeed : 1000
		//expose关闭速度
		},
		finish : {
			top : 'center'
		},
		onBeforeLoad : function() {
			var wrap = this.getOverlay().find(".page_turning");
			wrap.load(this.getTrigger().attr("href"));
		}//设置消失方向
	});
}

/**
 * Ajax for driver
 */
function checkValidate(field,value,callback){
	if(value==null || value==undefined || value==''){
		return;
	}
	$.get(context + "/driver/check", {
		field 	: field,
		value 	: value
	}, callback);
}

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

function unbindDriverTel(driverID){
	infoData("正在发送请求-解除司机绑定:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID + "/unbind", {
		_method : "PUT"
	}, function(data, status) {
		alertData(status,data);		
		$(".drivers").children("tr#" + driverID).children("td").children("#unbind").removeAttr("onclick");
		$(".drivers").children("tr#" + driverID).children("td").children("#unbind").text("未绑定");
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}

function offlineDriver(driverID){
	infoData("正在发送请求-强制下线:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID + "/offline", {
		_method : "PUT"
	}, function(data, status) {
		alertData(status,data);		
		$(".drivers").children("tr#" + driverID).children("td").children("#online").removeAttr("onclick");
		$(".drivers").children("tr#" + driverID).children("td").children("#online").text("未上线");
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}

function verifyDriver(driverID,verify){
	infoData("正在发送请求-"+(verify?"通过":"未通过")+"审核,司机:"+driverID);
	$(".drivers").children("tr#" + driverID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/driver/" + driverID, {
		_method : "PUT",
		accept	: verify
	}, function(data, status) {
		alertData(status,data);	
		if(verify){
			$(".drivers").children("tr#" + driverID).hide();
		}else{
			$(".drivers").children("tr#" + driverID).children("td").children("#verify").hide();
		}
		$(".drivers").children("tr#" + driverID).children("td").children(".btn").removeAttr("disabled");
	});
}