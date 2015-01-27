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

function getOnWorkingDrivers(){
	$("#onWorkingDrivers").html("<div style='text-align: center'><span>正在加载司机列表</span><div>");
	$("#onWorkingDrivers").load(context+"/send/drivers","pageNum=20");
}

function getUnsendOrders(){
	$("#unsendOrders").html("<div style='text-align: center'><span>正在加载新订单列表</span><div>");
	$("#unsendOrders").load(context+"/send/orders");
}
