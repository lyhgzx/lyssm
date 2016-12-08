/**
 * jquery 封装bootstrap table  
 */

var BTable = function(options) {
	var DEFAULTS = {
		target : "",
		url : "",
		uniqueId : "ID",
		columns : [],
		queryparam : {}
	}

	jQuery.extend(DEFAULTS, options);

	var param = function(params) {
		var temp = { // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			PageSize : params.pageSize, // 页面大小
			PageNumber : params.pageNumber
			// 页码

		};
		jQuery.extend(temp, DEFAULTS.queryparam);
		return temp;
	};
	this.$bootstrapTable = $(DEFAULTS.target);
	this.$bootstrapTable.bootstrapTable({
				url : DEFAULTS.url, // 请求后台的URL（*）
				method : 'post', // 请求方式（*）
				striped : true, // 是否显示行间隔色
				cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
				pagination : true, // 是否显示分页（*）
				sortable : false, // 是否启用排序
				sortOrder : "asc", // 排序方式
				contentType : "application/x-www-form-urlencoded",
				queryParams : param,// 传递参数（*）
				sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
				pageNumber : 1, // 初始化加载第一页，默认第一页
				pageSize : 10, // 每页的记录行数（*）
				pageList : [10, 25, 50, 100], // 可供选择的每页的行数（*）
				search : false, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
				strictSearch : true,
				queryParamsType : "",
				showColumns : false, // 是否显示所有的列
				showRefresh : false, // 是否显示刷新按钮
				minimumCountColumns : 1, // 最少允许的列数
				clickToSelect : true, // 是否启用点击选中行
				uniqueId : DEFAULTS.uniqueId, // 每一行的唯一标识，一般为主键列
				showToggle : false, // 是否显示详细视图和列表视图的切换按钮
				cardView : false, // 是否显示详细视图
				detailView : false, // 是否显示父子表
				columns : DEFAULTS.columns
			});

	// 选择行
	this.selectObjs = function() {
		var selectedDatas = this.$bootstrapTable
				.bootstrapTable('getSelections');
		if (selectedDatas == undefined || selectedDatas.length == 0) {
			layer.msg('至少选择一个对象');
			return null;
		}
		return selectedDatas;
	};
	// 选择单行对象
	this.getSelectedObj = function() {
		var selectedDatas = this.selectObjs();
		if(selectedDatas.length>1){
			layer.msg('选择一个对象');
			return null;
		}
		return selectedDatas == null ? null : selectedDatas[0];
	}
	// 选择多行对象
	this.getSelectedMany = function() {
		return this.selectObjs();
	}

	// 返回选择多行的属性JSON，默认选择id属性，如果选择其他属性，可重写
	this.getSelectedProperties = function(propName) {
		var selected = this.selectObjs();
		if (selected == null)
			return null;

		var ids = selected.map(function(elem) {
					return elem[propName];
				}).join(",");
		ids = ids; // 拼成一个JSON
		return ids;
	}
	
	// 查询
	this.reload = function(param) {

		jQuery.extend(DEFAULTS.queryparam, param);
		this.$bootstrapTable.bootstrapTable('refresh');
	}

};
