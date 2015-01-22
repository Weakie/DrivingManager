/**
 * UI control for order
 */
function destroyForceDialog(orderid) {
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
		message : "订单号:"+orderid,
		callback : function(result) {
			if (result) {
				destroyOrder(orderid);
			}
		},
		title : "确定要强制销单吗？",
	});
}

function retrieveForceDialog(orderid) {
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
		message : "订单号:"+orderid,
		callback : function(result) {
			if (result) {
				retrieveOrder(orderid);
			}
		},
		title : "确定要强制收回吗",
	});
}

function commentDialog(orderid) {
	var comment = $('#comment-' + orderid).val();
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
		message : "<textarea id='commentContent' rows='3' class='form-control'>" + comment + "</textarea>",
		callback : function(result) {
			if (result) {
				var data = $('#commentContent').val();
				commentOrder(orderid,data);
			}
		},
		title : "填写备注信息",
	});
}

/**
 * ajax request for order
 */
function destroyOrder(orderid) {
	infoData("正在发送请求-销单:"+orderid);
	$("tr#" + orderid).children("td").children("[type=button]").attr("disabled","disabled");
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		state : "destroy"
	}, function(data, status) {
		alertData(status,data);
		$("tr#" + orderid).hide();
	});
}

function retrieveOrder(orderid) {
	infoData("正在发送请求-收回订单:"+orderid);
	$("tr#" + orderid).children("td").children("[type=button]").attr("disabled","disabled");
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		state : "retrieve"
	}, function(data, status) {
		alertData(status,data);
		$("tr#" + orderid).hide();
	});
}

function commentOrder(orderid, cmtData) {
	infoData("正在发送请求-备注:"+orderid+", "+cmtData);
	$('#comment-' + orderid).val(cmtData);
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		comment : cmtData
	}, function(data, status) {
		alertData(status,data);
		$('#cmt-' + orderid).text((cmtData.length > 8 ? cmtData.substring(0,8)+'...' : cmtData));
	});
}

function refreshTimedOrders(){
	$("#newOrders").load(context+'/orders','type=new');
	$("#dispatchedOrders").load(context+'/orders','type=dispatched');
	$("#acceptedOrders").load(context+'/orders','type=accepted');
	$("#drivingOrders").load(context+'/orders','type=driving');
	$("#shuttle").load(context+'/cars','type=shuttle');
}

/**
 * UI control for createOrder
 */

/**
 * ajax request for createOrder
 */
function getCustomerInfo(customerTel,callBack) {
	$.get(context+"/orderCreate/customer/"+customerTel, function(data, status) {
		if(status=='success'){
			callBack(data);
		}else{
			alertData(status,null);
		}
	});
}

function createCustomer(tel,name){
	$.post(context+"/orderCreate/customer", {
		_method : "PUT",
		tel : tel,
		name : name
	}, function(data, status) {
		alertData(status,data);
	});
}

function getUnresolvedOrders(customerID){
	$("#unresolvedOrders").load(context+"/orderCreate/customer/"+customerID+"/orders","pageNum=5");
}

function getAvailableDrivers(coordinate){
	$("#availableDrivers").load(context+"/orderCreate/drivers","coordinate=" + coordinate + "&pageNum=3");
}

/**
 * UI control for send order
 */
function sendOrderDialog(orderid,driverid,orderinfo,driverinfo) {
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
		message : "订单:"+orderid+". 司机:"+driverinfo,
		callback : function(result) {
			if (result) {
				sendOrder(orderid,driverid);
			}
		},
		title : "确定要派单吗？",
	});
}

function beforeSendOrder(orderID,driverID){
	//disable radio button for order
	$("input#radio-"+orderID).attr("disabled","disabled");
	$("input#radio-"+orderID).parents("font").attr("color","red");
	//disable buttons for drivers
	$("#availableDrivers").find("button").attr("disabled","disabled");
}

function afterSendOrder(orderID,driverID){
	//remove radio button for order
	$("input#radio-"+orderID).parents("li").remove();
	//empty driver list
	//$("#availableDrivers").children("ul#"+orderID).parent().empty();
	$("#availableDrivers").children("ul#"+orderID).parent().html("<div style='text-align: center'><span>选择订单进行派单</span><div>");
}

/**
 * UI event for send order
 */
function registerOrderRadioBtnEvent(){
	$(":radio[name=radio]").click(function(){
		var orderID = $(":checked").val();
		var coordt  = $(":checked").parent("label").children("input[name=coordt]").val();
		$("#availableDrivers").html("<div style='text-align: center'><span>正在加载司机列表</span><div>");
		getAvailableDriversForSend(coordt,orderID);
	});
}

/**
 * ajax request for send order
 */
function sendOrder(orderID,driverID){
	beforeSendOrder(orderID,driverID);
	infoData("正在发送请求-派单:"+orderID+", "+driverID);
	$.post(context + "/send/" + orderID, {
		_method : "PUT",
		driverID : driverID
	}, function(data, status) {
		alertData(status,data);
		afterSendOrder(orderID,driverID);
	});
}

function getAvailableDriversForSend(coordinate,orderID){
	$("#availableDrivers").load(context+"/send/drivers","coordinate=" + coordinate + "&orderID=" + orderID + "&pageNum=5");
}

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


/**
 * alert
 * @param data
 */
function infoData(data) {
	$("#alert").html('<div class="alert alert-warning alert-dismissable fade in">'
			+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
			+ '    ' + data + '</div>');
}

function alertData(type, data) {
	if(type=='success'){
		if(data.res=="SUCCESS"){
			$("#alert").html('<div class="alert alert-success alert-dismissable fade in">'
					+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
					+ '[操作成功] '+data.time +' '+ data.com +'. '+ data.additional + '</div>');
			setTimeout("autoCloseAlert()" ,6000);
		}else{
			$("#alert").html('<div class="alert alert-warning alert-dismissable fade in">'
					+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
					+ '[操作失败] '+data.time +' '+ data.com +'. '+ data.additional + '</div>');
		}
	}else{
		$("#alert").html('<div class="alert alert-danger alert-dismissable fade in">'
				+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
				+ '[请求失败] '+data.time +' '+ data.res +'. '+ data.com +'. '+ data.additional + '</div>');
	}
}

function autoCloseAlert(){
	$("#alert").children("div.alert-success").alert('close');
}



/**
 * page control
 */
function prevPage(self, path, data, curpage, pageNum) {
	curpage = curpage - 1;
	if (curpage <= 1) {
		curpage = 1;
	}
	$(self).closest("#pageTurning").parent().load(context + path,
			data + "&pageIndex=" + curpage + "&pageNum=" + pageNum);
}

function currPage(self, path, data, curpage, pageNum) {
	$(self).closest("#pageTurning").parent().load(context + path,
			data + "&pageIndex=" + curpage + "&pageNum=" + pageNum);
}

function nextPage(self, path, data, curpage, pageNum, totalpage) {
	curpage = curpage + 1;
	if (curpage >= totalpage) {
		curpage = totalpage;
	}
	$(self).closest("#pageTurning").parent().load(context + path,
			data + "&pageIndex=" + curpage + "&pageNum=" + pageNum);
}