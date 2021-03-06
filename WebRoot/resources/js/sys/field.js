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
					user.openDialog({
								status : "增加",
								url : basePath + '/admin/field/addPage'
							});

				});
		// 查询
		$("#search").click(function() {

					table.reload({
								dicName : $("#dicName").val(),
								dicTypename : $("#dicTypename").val()
							});

				});

		// 删除
		$("#delete").click(function() {

			var ids = table.getSelectedProperties("id");

			$.getJSON(basePath + '/admin/field/delete?ids=' + ids, function(
							data) {
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
		});

		// 修改
		$("#modify").click(function() {
			var selected = table.getSelectedObj();
			if (selected == null) {
				return;
			}
			user.openDialog({
						status : "修改",
						url : basePath + '/admin/field/updatePage?id='
								+ selected.id

					});

		});
	},
	loadTable : function() {

		var opt = {
			target : "#tb",
			url : basePath + "/admin/field/findtable",
			uniqueId : "id",
			columns : [{
						checkbox : true
					}, {
						field : 'dicKey',
						title : '字典编号'

					}, {
						field : 'dicName',
						title : '字典名称'

					}, {
						field : 'dicType',
						title : '字典类型'

					}, {
						field : 'dicTypename',
						title : '字典类型名称'

					}]

		};
		table = new BTable(opt);
	},
	openDialog : function(param) {
		layer.open({
					type : 2,
					title : param.status + '字典',
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
							$.ok({
										msg : param.status + '成功！',
										func : function() {
											table.reload();
										}
									})

						} else if (handle_status == '0') {
							$.error({
										msg : param.status + '失败！',
										func : function() {
											table.reload();
										}
									})
							
						}
						$("#handle_status").val("");

					}
				});
	}

}