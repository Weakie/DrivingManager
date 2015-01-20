//UI control
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
				commentUpdate(orderid,data);
			}
		},
		title : "填写备注信息",
	});
}

function commentUpdate(orderid, data){
	$('#comment-' + orderid).val(data);
	commentOrder(orderid, data);
	if(data.length > 8){
		$('#cmt-' + orderid).text(data.substring(0,8)+'...');
	}else{
		$('#cmt-' + orderid).text(data);
	}
}

/**
 * ajax request for order
 */
function destroyOrder(orderid) {
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		state : "destroy"
	}, function(data, status) {
		alertData(status,data);
		$("tr#" + orderid).hide();
	});
}

function retrieveOrder(orderid) {
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		state : "retrieve"
	}, function(data, status) {
		alertData(status,data);
		$("tr#" + orderid).hide();
	});
}

function commentOrder(orderid, cmtData) {
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		comment : cmtData
	}, function(data, status) {
		alertData(status,data);
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
 * ajax request for send order
 */
function sendOrder(){
	
}


/**
 * alert
 * @param type
 * @param data
 */
function alertData(type, data) {
	if(type=='success'){
		if(data.res=="SUCCESS"){
			$("#alert").html('<div class="alert alert-success alert-dismissable">'
					+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
					+ '[操作成功] '+data.time +' '+ data.com +'. '+ data.additional + '</div>');
		}else{
			$("#alert").html('<div class="alert alert-warn alert-dismissable">'
					+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
					+ '[操作失败] '+data.time +' '+ data.com +'. '+ data.additional + '</div>');
		}
	}else{
		$("#alert").html('<div class="alert alert-danger  alert-dismissable">'
				+ '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>'
				+ '[请求失败] '+data.time +' '+ data.res +'. '+ data.com +'. '+ data.additional + '</div>');
	}
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