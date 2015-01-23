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