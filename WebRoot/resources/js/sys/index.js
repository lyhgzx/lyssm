/**
 * 首页
 */
$(function() {
			index.init();

		});

var app = {};

var index = {
	init : function() {
		index.bind();
	},
	bind:function(){
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

