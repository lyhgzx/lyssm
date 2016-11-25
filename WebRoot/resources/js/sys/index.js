/**
 * 首页
 */
$(function() {
			index.init();
			bind.init();
		});

var app = {};
var menuTemplate = {

}
var index = {
	init : function() {
		
	}

}

var bind = {
	init : function() {
		bind.logout();
	},
	logout : function() {
		$("#logout").click(function() {
					$.get(adminPath + "/logout", function(data) {
								if (data.code == 1) {
									window.location.href = adminPath + '/login';
								} else {
									alert("操作失败!");
								}

							});

				});

	}
}