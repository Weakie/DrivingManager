/**
 * UI control for createOrder
 */
function afterChooseLocation() {
	var cood = $('#aptmtCoordt').val();
	if (cood != null && cood.length >= 3) {
		// get available drivers
		getAvailableDrivers(cood);
		$("#createOrder").removeAttr("disabled");
		$("#createOrder").focus();
		$("#aptmtPlace").parent(".input-group").attr("class","input-group has-success");
	} else {
		errorData("[表单错误]预约坐标有误,请重新点击地图选取定位");
		setTimeout("closeDangerAlert()", 6000);
		$("#createOrder").attr("disabled", "disabled");
		$("#aptmtPlace").focus();
		$("#aptmtPlace").parent(".input-group").attr("class","input-group has-warning");
	}
}

function updateCustomerInfo(data) {
	if (!data.newCustomer) {
		$("#customerTel").parent(".input-group").attr("class","input-group has-success");
		$("#customerID").val(data.id);
		$("#createCustomer").hide();
		getUnresolvedOrders(data.id);
	} else {
		$("#customerTel").parent(".input-group").attr("class","input-group has-warning");
		$("#createCustomer").show();
		$("#createCustomer").removeAttr("disabled");
	}
	$("#customerType").text(data.type);
	$("#customerName").val(data.name);
	$("#customerBalance").text(data.balance);
	$("#totalNum").text(data.allAmount);
	$("#monthNum").text(data.monthAmount);
}
/**
 * UI event for createOrder
 */
function checkDriverNumber(){
	//判断司机
	var num = Number($("[name=aptmtPeople]").val());
	if(num == $(":checkbox[name=drivers]:checked").length){
		$("#createAndSend").removeAttr("disabled");
		$("#createAndSend").focus();
	}else{
		$("#createAndSend").attr("disabled","disabled");
	}
}
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
	$("#availableDrivers").load(context+"/orderCreate/drivers","coordinate=" + coordinate + "&pageNum=10");
}
