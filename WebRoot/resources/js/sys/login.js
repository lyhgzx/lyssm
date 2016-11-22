/**
 * 登录
 */
$(function() {
			login.init();
		});

var login = {
	init : function() {
		login.loadForm();
	},
	loadForm : function() {
		$("#btn").click(function() {

					var vform = {};
					vform.username = $("input[type='text']").val();
					vform.password = $("input[type='password']").val();
					
					$.post(adminPath+"/login", vform, function(data) {
                      		if (data.code == 1) {
                      			window.location.href = adminPath + '/index';
                      		}else{
                      			alert(data.data);
                      		}
							});
                 
				});
				
				

	}

}