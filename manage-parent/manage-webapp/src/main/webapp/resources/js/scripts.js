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