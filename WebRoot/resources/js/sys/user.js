/**
 * 用户管理
 */
$(function() {
			user.init();
		});

var app = {};
var user = {
	init : function() {
		user.bind();
		user.loadTable();
	},
	bind : function() {
		$("#insert").click(function() {
			layer.open({
						type : 2,
						title : '<i class="fa fa-user-plus fa-2x"></i>&nbsp;添加人员',
						shadeClose : false,
						maxmin : true, // 开启最大化最小化按钮
						area : ['750px', '300px'],
						fix : false, // 不固定
						content : [basePath + '/admin/sysUser/addPage', 'no'], // iframe的url
						btn : ['确认', '取消'],

						yes : function(index, layero) {
							var iframeWin = window[layero.find('iframe')[0]['name']]; // 得到iframe页的窗口对象，执行iframe页的方法：
							iframeWin.save();
						},
						end : function() {

							var handle_status = $("#handle_status").val();

							if (handle_status == '1') {
								layer.msg('添加成功！', {
									icon : 1,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									$('#tb').bootstrapTable('refresh');
								});
							} else if (handle_status == '0') {
								layer.msg('添加失败！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									$('#tb').bootstrapTable('refresh');
								});
							}

						}
					});
		});
	},
	loadTable : function() {
		var opt = {
			target : "#tb",
			url : basePath + "/admin/sysUser/findtable",
			uniqueId : "id",
			columns : [{
						checkbox : true
					}, {
						field : 'username',
						title : '登录名'

					}, {
						field : 'name',
						title : '用户名'

					}, {
						field : 'roleName',
						title : '所属角色'

					}, {
						field : 'status',
						title : '状态',
						formatter : function(value, row) {
							return value == "1" ? "开启" : "关闭";
						}
					}]

		};
		var bt = new BTable(opt);
	}
}