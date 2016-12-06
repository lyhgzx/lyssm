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
		list.bindTree();
	},
	bind : function() {
		// 增加
		$("#insert").click(function() {
			list.openDialog({
				status:"增加",
				url:basePath + '/admin/department/addPage'				
			});
			
		});
		// 查询
		$("#search").click(function() {

					table.reload({
								id : $("#dicName").val(),
								dicTypename : $("#dicTypename").val()
							});

				});

		// 删除
		$("#delete").click(function() {

					var ids = table.getSelectedProperties("id");

					$.getJSON(basePath + '/admin/field/delete?ids=' + ids, function(
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
			list.openDialog({
				status:"修改",
				url:basePath + '/admin/field/updatePage?id='+ selected.id
				
				
			});
			

		});
	},
	loadTable : function() {

		var opt = {
			target : "#tb",
			url : basePath + "/admin/department/findtable",
			uniqueId : "id",
			queryparam:{
				id:0
			},
			columns : [{
						checkbox : true
					}, {
						field : 'id',
						title : '流水号'

					}, {
						field : 'cascadeid',
						title : '节点语义ID'

					}, {
						field : 'name',
						title : '组织名称'

					}, {
						field : 'isleaf',
						title : '是否叶子节点',
                        formatter : function(value, row) {
							return value == true ? "是" : "否";
						}
					}, {
						field : 'isautoexpand',
						title : '是否自动展开',
                        formatter : function(value, row) {
							return value == true ? "是" : "否";
						}
					}, {
						field : 'iconname',
						title : '节点图标文件名称'

					}, {
						field : 'sort',
						title : '排序号'

					}]

		};
		table = new BTable(opt);
	},
	openDialog:function(param){
		layer.open({
			type : 2,
			title : param.status+'部门',
			shadeClose : false,
			maxmin : true, // 开启最大化最小化按钮
			area : ['750px', '300px'],
			fix : false, // 不固定
			content : [param.url, 'no'], // iframe的url
			btn : ['确认', '取消'],
			zIndex:0,
			yes : function(index, layero) {
				var iframeWin = window[layero.find('iframe')[0]['name']]; // 得到iframe页的窗口对象，执行iframe页的方法：
				iframeWin.save();
			},
			end : function() {

				var handle_status = $("#handle_status").val();

				if (handle_status == '1') {
					layer.msg(param.status+'成功！', {
						icon : 1,
						time : 2000
							// 2秒关闭（如果不配置，默认是3秒）
						}, function() {
						table.reload();
                        list.bindTree();
					});
				} else if (handle_status == '0') {
					layer.msg(param.status+'失败！', {
						icon : 2,
						time : 2000
							// 2秒关闭（如果不配置，默认是3秒）
						}, function() {
						table.reload();
						 list.bindTree();
					});
				}
				$("#handle_status").val("");

			}
		});
	}
    ,bindTree:function(){
    	 var url = basePath+'/admin/department/tree';
    	    var setting = {
    	        view: { selectedMulti: false },
    	        data: {
    	            key: {
    	                name: 'name',
    	                title: 'name'
    	            },
    	            simpleData: {
    	                enable: true,
    	                idKey: 'id',
    	                pIdKey: 'parentid',
    	                rootPId: 'null'
    	            }
    	        },
    	        callback: { onClick: zTreeOnClick }
    	    };
    	    function zTreeOnClick(event, treeId, treeNode) {
    
    	       table.reload({
								id : treeNode.id
							});

    	    }
    	    $.getJSON(url, function (json) {
    	        $.fn.zTree.init($("#tree"), setting, json).expandAll(true);
    	    });
    }  

}