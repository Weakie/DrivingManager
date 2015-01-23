/**
 * UI Control for driver
 */
function deleteCompanyDialog(companyID,companyName) {
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
		message : "公司:"+companyID+","+companyName,
		callback : function(result) {
			if (result) {
				deleteCompany(companyID);
			}
		},
		title : "确定要删除公司信息吗？",
	});
}

/**
 * Ajax for driver
 */
function deleteCompany(companyID){
	infoData("正在发送请求-删除公司:"+companyID);
	$(".companys").children("tr#" + companyID).children("td").children(".btn").attr("disabled","disabled");
	$.post(context + "/company/" + companyID, {
		_method : "DELETE"
	}, function(data, status) {
		alertData(status,data);
		$(".companys").children("tr#" + companyID).hide();		
		$(".companys").children("tr#" + companyID).children("td").children(".btn").removeAttr("disabled");
	});
}