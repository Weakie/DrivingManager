function destroyOrder(orderid) {
	$.post(context + "/order/" + orderid, 
	{
		_method : "PUT",
		state : "destroy"
	}, function(data, status) {
		alert("Data: " + data.res + data.com + "\nStatus: " + status);
	});
}
function commentOrder(orderid) {
	$.post(context + "/order/" + orderid, 
	{
		_method : "PUT",
		state : "destroy"
	}, function(data, status) {
		alert("Data: " + data + "\nStatus: " + status);
	});
}