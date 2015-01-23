/**
 * UI Control for driver
 */
function deleteCustomerDialog(customerID,customerName) {
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
		message : "客户:"+customerID+","+customerName,
		callback : function(result) {
			if (result) {
				deleteCustomer(customerID);
			}
		},
		title : "确定要删除客户信息吗？",
	});
}

function chargeCustomerDialog(customerID) {
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
				rechargeCustomer(customerID,data)
			}
		},
		title : "充值",
	});
}

/**
 * Ajax for driver
 */
function deleteCustomer(customerID){
	infoData("正在发送请求-删除客户:"+customerID);
	$(".customers").children("tr#" + customerID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/customer/" + customerID, {
		_method : "DELETE"
	}, function(data, status) {
		alertData(status,data);
		$(".customers").children("tr#" + customerID).hide();		
		$(".customers").children("tr#" + customerID).children("td").children(".btn").removeAttr("disabled");
	});
}

function rechargeCustomer(customerID,amount){
	infoData("正在发送请求-充值,客户:"+customerID);
	$(".customers").children("tr#" + customerID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/customer/" + customerID, {
		_method : "PUT",
		amount	: amount
	}, function(data, status) {
		alertData(status,data);	
		$(".customers").children("tr#" + customerID).children("td").children(".btn").removeAttr("disabled");
	});
}