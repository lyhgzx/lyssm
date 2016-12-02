/**
 * 用户管理
 */
$(function() {
			user.init();
		});

var app = {
	table : null,
	status : null
};
var user = {
	init : function() {
		user.bind();
		user.loadTable();
	},
	bind : function() {
		// 增加
		$("#insert").click(function() {

			layer.open({
						type : 2,
						title : '添加人员',
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
									table.reload();

								});
							} else if (handle_status == '0') {
								layer.msg('添加失败！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});
							}
							$("#handle_status").val("");

						}
					});
		});
		// 查询
		$("#search").click(function() {

					table.reload({
								username : $("#username").val(),
								name : $("#name").val()
							});

				});

		// 删除
		$("#delete").click(function() {

					var ids = table.getSelectedProperties("id");

					$.getJSON(basePath + '/admin/sysUser/delete?ids=' + ids, function(
									data) {
								if(data.code==1){
									layer.msg('删除成功！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});
								}else{
										layer.msg('删除失败！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});
								
								}
							});
				});

		// 修改
		$("#modify").click(function() {
			var selected = table.getSelectedObj();
			if (selected == null) {
				return;
			}

			layer.open({
						type : 2,
						title : '修改人员',
						shadeClose : false,
						maxmin : true, // 开启最大化最小化按钮
						area : ['750px', '300px'],
						fix : false, // 不固定
						content : [
								basePath + '/admin/sysUser/updatePage?id='
										+ selected.id, 'no'], // iframe的url
						btn : ['确认', '取消'],
						yes : function(index, layero) {
							var iframeWin = window[layero.find('iframe')[0]['name']]; // 得到iframe页的窗口对象，执行iframe页的方法：
							iframeWin.save();
						},
						end : function() {

							var handle_status = $("#handle_status").val();

							if (handle_status == '1') {
								layer.msg('修改成功！', {
									icon : 1,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();

								});
							} else if (handle_status == '0') {
								layer.msg('修改失败！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});
							}
							$("#handle_status").val("");

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
		table = new BTable(opt);
	}
}