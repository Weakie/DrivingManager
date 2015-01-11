function commentDialog(orderid) {
	var comment = $('#comment-'+orderid).val();
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
		message : "<textarea id='commentContent' rows='3' class='form-control'>"+comment+"</textarea>",
		callback : function(result) {
			if(result){
				var data = $('#commentContent').val();
				commentOrder(orderid,data);
			}
		},
		title : "填写备注信息",
	});
}





function destroyOrder(orderid,comment) {
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		state : "destroy"
	}, function(data, status) {
		alert("Data: " + data.res + data.com + "\nStatus: " + status);
		$("tr#" + orderid).hide();
	});
}

function commentOrder(orderid,cmtData) {
	$.post(context + "/order/" + orderid, {
		_method : "PUT",
		comment : cmtData
	}, function(data, status) {
		alert("Data: " + data + "\nStatus: " + status);
	});
}





// page control
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