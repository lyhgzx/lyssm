<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<%@include file="/WEB-INF/jsp/base/sys_form.jsp"%>
<style type="text/css">

</style>
<script type="text/javascript">
	$(function() {
		
		 //多选
	    $("#SysOperationId").select2({
	        language: "zh-CN",
	        placeholder:'请选择',
	        allowClear:true
	    });
		//启动验证
		var v = $("#myForm").validate({

		    rules: {
		    	name: {
		        required: true
 
		      }

		    },
		    messages: {
		    	name: {
		        required:"请输入部门名称"
	
		      }


		    }
		});

		parentTree.bind();

		var operationids=${operationIds};
		SysOperationSelect.show(operationids);
	})

	function save() {
		if ($("#myForm").valid()) {

			var data = $("form").serializeJSON();
	          //$("#SysOperationId").val()得到数组类型，然后.toString()转换成字符串 后方用list<String>解析
	          if($("#SysOperationId").val()){
	            data.operationIds=$("#SysOperationId").val().toString() ; 
	          }
           
			data.status = $("#status").val();

					$.ajax({
						url : basePath + '/admin/menu/save',
						type : 'POST',
						dataType : 'json',
						cache : false,
						contentType : "application/x-www-form-urlencoded;charset=UTF-8",
						data : data,
						success : function(msg) {
							var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引

							if (msg.code === 1) {
								parent.$("#handle_status").val('1');
								parent.layer.close(index); //再执行关闭

							} else {
								parent.$("#handle_status").val('0');
								parent.layer.close(index); //再执行关闭
							}
						},
						error : function(XMLHttpRequest, textStatus,
								errorThrown) {

							return;
						}
					}) 

		}

	}

	function showMenu() {
		var cityObj = $("#parentname");
		var cityOffset = $("#parentname").offset();
		$("#menuContent").css({
			left : cityOffset.left + "px",
			top : cityOffset.top + cityObj.outerHeight() + "px"
		}).slideDown("fast");

		$("body").bind("mousedown", onBodyDown);
	}
	function hideMenu() {
		$("#menuContent").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown);
	}
	function onBodyDown(event) {
		if (!(event.target.id == "menuBtn" || event.target.id == "parentname"
				|| event.target.id == "menuContent" || $(event.target).parents(
				"#menuContent").length > 0)) {
			hideMenu();
		}
	}

	//编辑时，选择上级弹出的树
	var parentTree = function() {
		var nameDom = "#parentname";
		var idDom = "#parentid";
		var zTreeObj;
		var setting = {
			view : {
				selectedMulti : false
			},
			check : {
				enable : true,
				chkStyle : "radio", //单选
				radioType : "all"
			},
			data : {
				key : {
					name : 'name',
					title : 'name'
				},
				simpleData : {
					enable : true,
					idKey : 'id',
					pIdKey : 'parentid',
					rootPId : 'null'
				}
			},
			callback : {
				onClick : zTreeOnClick,
				onCheck : zTreeCheck
			}
		};

		function zTreeCheck(event, treeId, treeNode) {
			var nodes = zTreeObj.getCheckedNodes(true);
			var ids = nodes.map(function(e) {
				return e.id;
			}).join(",");
			var names = nodes.map(function(e) {
				return e.name;
			}).join(",");

			$(nameDom).val(names);
			$(idDom).val(ids);
		}
		function zTreeOnClick(event, treeId, treeNode) {
			zTreeObj.checkNode(treeNode, !treeNode.checked, true, true);
			return false;
		}

		return {
			bind : function() {
				$.getJSON(basePath + '/admin/menu/treeform', function(
						json) {
					zTreeObj = $.fn.zTree.init($('#treeDemo'), setting, json);

					var orgstr = $(idDom).val();
					var name = '';
					if (orgstr != '') {
						var nodeIds = orgstr.split(',');
						$.each(nodeIds, function() {
							var node = zTreeObj
									.getNodeByParam("id", this, null);
							name += ',' + node.name;
							zTreeObj.checkNode(node, true, true);
						});
						$(nameDom).val(name.substr(1)); //显示名称
					}
					zTreeObj.expandAll(true);
				});
			}
		};
	}();
	
	
//菜单-操作
	var SysOperationSelect = function () {
	    return {
	        show: function (d) {
	            $.getJSON(basePath + '/admin/menu/operationSelect', function (data) {
	                var select = $('#SysOperationId');
	                select.empty();
	                for (var i = 0; i < data.length; i++) {
	                    var option = $("<option>").text(data[i].name).val(data[i].id)
	                    select.append(option);
	                }
	                if (d) {
	                
	                  $("#SysOperationId").val(d).trigger('change');
	                }
	                
	            });
	        
	        }
	    }


	}();
	
	
</script>
</head>
<body>

	<form id="myForm">
		<input type="hidden" name="id" value="${model.id}">
		<table class="myTable">
			<tr>
				<th>上级菜单</th>

				<td colspan="3"><input id="parentname" type="text"
					style="width: 150px;" onclick="showMenu();" /> <input
					id="parentid" name="parentid" style="display: none" value="${model.parentid}" /></td>
			<tr>
			<tr>
				<th>菜单名称<i>*</i></th>
				<td colspan="3"><input type="text" name="name" id="name"
					value="${model.name}" /></td>
			<tr>
			<tr>
				<th>菜单URL<i>*</i></th>
				<td colspan="3"><input type="text" name="url" id="url"
					value="${model.url}" /></td>
			<tr>
			<tr>
				<th>是否叶子节点</th>
				<td colspan="3"><select name="isleaf" id="isleaf">
						<option value="0"  <c:if test="${model.isleaf==0}">selected="selected"</c:if>>否</option>
						<option value="1" <c:if test="${model.isleaf==1}">selected="selected"</c:if>>是</option>
				</select></td>
			<tr>
			<tr>
				<th>是否自动展开</th>
				<td colspan="3"><select name="isautoexpand" id="isautoexpand">
						<option value="0" <c:if test="${model.isautoexpand==0}">selected="selected"</c:if> >否</option>
						<option value="1" <c:if test="${model.isautoexpand==1}">selected="selected"</c:if>>是</option>
				</select></td>
			<tr>
			<tr>
				<th>操作</th>
				<td colspan="3"> 
				 <select name="SysOperationId" id="SysOperationId" style="width: 100%"   multiple="multiple">
		
				</select></td>
			<tr>
			<tr>
				<th>排序号</th>
				<td colspan="3"><input type="text" name="sort" id="sort"
					value="${model.sort}" /></td>
			<tr>
		</table>
	</form>
	<div id="menuContent" class="menuContent"
		style="display: none; position: absolute;">
		<ul id="treeDemo" class="ztree"
			style="margin-top: 0; width: 150px; height: 150px;"></ul>
	</div>
</body>
</html>