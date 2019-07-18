/**
 * 模态框提示信息
 * @param {Object} data
 */
function parsingData(data){
	if(data == null || data == undefined){
		var html = '<p>';
		html += '缺少参数';
		html += '<p>';
		$("#prompt").append(html);
		$("#myModal").modal();
		return;
	}
	if(data.code == '400'){
		var html = '<p>';
		html += data.massage;
		html += '<p>';
		$("#prompt").append(html);
		$("#myModal").modal();
		return;
	}
	return data.data;
}
/**
 * 操作成功提示信息
 */
function operateSuccessfully(message){
	var html = '<p>';
	html += message;
	html += '<p>';
	$("#prompt").children().remove();
	$("#prompt").append(html);
	$("#myModal").modal();
	return;
}

/**
 * 参数判空
 * @param {Object} data
 */
function isEmpty(data){
	if(data == null || data == '' || data == undefined){
		return true;
	}
	return false;
}
/**
 * url
 */
var url_head = 'http://localhost:8762/yach/'