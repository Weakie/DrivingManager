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


//page control
function prevPage(self,path,data,curpage) {
	curpage = curpage - 1;
	if(curpage<=1){
		curpage = 1;
	}
	$(self).closest("#pageTurning").parent().load(context + path, data+"&pageIndex="+curpage);
}

function currPage(self,path,data,curpage) {
	$(self).closest("#pageTurning").parent().load(context + path, data+"&pageIndex="+curpage);
}

function nextPage(self,path,data,curpage,totalpage) {
	curpage = curpage + 1;
	if(curpage>=totalpage){
		curpage = totalpage;
	}
	$(self).closest("#pageTurning").parent().load(context + path, data+"&pageIndex="+curpage);
}