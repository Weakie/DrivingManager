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
