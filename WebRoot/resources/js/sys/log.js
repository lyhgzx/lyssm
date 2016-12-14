/**
 * 日志管理
 */

$(function(){
	table.init();
	
})
var app={logtable:null,logintable:null};

var table={
		init:function(){
			table.loadLogTable();
			table.loadLoginTable();
			table.bind();
		},
		bind:function(){
			$("#search").click(function(){
				app.logintable.reload({
					begTime : $("#begTime").val(),
					endTime : $("#endTime").val()
				});

			});
		},
		loadLogTable:function(){
			var opt = {
					target : "#tblog",
					url : basePath + "/admin/log/logtable",
					uniqueId : "id",
					columns : [ {
						checkbox : true
					}, {
						field : 'username',
						title : '用户名称'

					}, {
						field : 'position',
						title : '位置'

					}, {
						field : 'target',
						title : '对象'

					} , {
						field : 'type',
						title : '类型'

					}  , {
						field : 'date',
						title : '日期'

					} ]

				};
			app.logtable = new BTable(opt);
		},
		loadLoginTable:function(){
			var opt = {
					target : "#tblogin",
					url : basePath + "/admin/log/logintable",
					uniqueId : "id",
					columns : [ {
						checkbox : true
					}, {
						field : 'username',
						title : '用户名称'

					}, {
						field : 'hostip',
						title : '登陆IP'

					}, {
						field : 'hostname',
						title : '登陆机器名'

					} , {
						field : 'logincity',
						title : '登陆位置'

					}  , {
						field : 'logindate',
						title : '登陆日期'

					} ]

				};
			app.logintable = new BTable(opt);
		}
		
		
}
