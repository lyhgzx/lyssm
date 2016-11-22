/**
 * 基础js
 */
 $.ajaxSetup({
	contentType : 'application/x-www-form-urlencoded;charset = utf-8', 
	complete : function(xhr, textStatus) {
		if (xhr.status == 911) { 
	        window.location.href = basePath;
		} 
	} 
});