/**
 * 用户管理
 */
$(function() {
			list.init();
		});

var app = {
	table : null,
	status : null
};
var list = {
	init : function() {
		list.bind();
		list.loadTable();
	},
	bind : function() {
		// 增加
		$("#insert").click(function() {
					list.openDialog({
								status : "增加",
								url : basePath + '/admin/person/addPage'
							});

				});
		// 查询
		$("#search").click(function() {

					table.reload({
								name : $("#name").val(),
								myname : $("#myname").val()
							});

				});

		// 删除
		$("#delete").click(function() {
			layer.confirm('确定要删除吗？', {
				btn : ['确定', '取消']
					// 按钮
				}, function() {

				var ids = table.getSelectedProperties("id");

				$.getJSON(basePath + '/admin/person/delete?ids=' + ids,
						function(data) {
							if (data.code == 1) {
								layer.msg('删除成功！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});
							} else {
								layer.msg('删除失败！', {
									icon : 2,
									time : 2000
										// 2秒关闭（如果不配置，默认是3秒）
									}, function() {
									table.reload();
								});

							}
						});
			}, function() {

			});

		});

		// 修改
		$("#modify").click(function() {
			var selected = table.getSelectedObj();
			if (selected == null) {
				return;
			}
			list.openDialog({
						status : "修改",
						url : basePath + '/admin/person/updatePage?id='
								+ selected.id

					});

		});
		$("#author").click(function() {
			var selected = table.getSelectedObj();
			if (selected == null) {
				return;
			}

			layer.open({
						type : 2,
						title : '为用户分配角色',
						shadeClose : false,
						maxmin : true, // 开启最大化最小化按钮
						area : ['800px', '450px'],
						fix : false, // 不固定
						content : [
								basePath
										+ '/admin/role/GivePersonRole?personId=\''
										+ selected.id + '\'', 'no'], // iframe的url
						btn : ['确认', '取消']

					});

		});
	},
	loadTable : function() {

		var opt = {
			target : "#tb",
			url : basePath + "/admin/person/findtable",
			uniqueId : "id",
			columns : [{
						checkbox : true
					}, {
						field : 'name',
						title : '登录名'

					}, {
						field : 'myname',
						title : '用户名'

					}, {
						field : 'departmentname',
						title : '部门'

					}, {
						field : 'state',
						title : '状态',
						formatter : function(value, row) {
							return value == 1 ? "开启" : "关闭";
						}
					}]

		};
		table = new BTable(opt);
	},
	openDialog : function(param) {
		layer.open({
					type : 2,
					title : param.status + '人员',
					shadeClose : false,
					maxmin : true, // 开启最大化最小化按钮
					area : ['750px', '300px'],
					fix : false, // 不固定
					content : [param.url, 'no'], // iframe的url
					btn : ['确认', '取消'],
					yes : function(index, layero) {
						var iframeWin = window[layero.find('iframe')[0]['name']]; // 得到iframe页的窗口对象，执行iframe页的方法：
						iframeWin.save();
					},
					end : function() {

						var handle_status = $("#handle_status").val();

						if (handle_status == '1') {
							layer.msg(param.status + '成功！', {
								icon : 1,
								time : 2000
									// 2秒关闭（如果不配置，默认是3秒）
								}, function() {
								table.reload();

							});
						} else if (handle_status == '0') {
							layer.msg(param.status + '失败！', {
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
	}

}