<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<%@include file="/WEB-INF/jsp/base/sys_form.jsp"%>
<script type="text/javascript">
  $(function() {
    //启动验证
    var v = $("#myForm").validate({

      rules: {
        name: {
          required: true
        },

        myname: {
          required: true
        },
        password: {
          required: true

        },
        surepassword: {
          required: true,
          equalTo: "#password"//必须和谁相等
        }

      },
      messages: {
        name: "请输入登录名",
        myname: "请输入姓名",
        password: "请输入密码",
        surepassword: "确认密码不一致",
        name: "请输入姓名"

      }
    });
		parentTree.bind();
  })

  function save() {
    if ($("#myForm").valid()) {

      var data = $("form").serializeJSON();
      data.sysdepartmentid=$("#parentid").val();
      data.status = $("#status").val();
      $.ajax({
        url: basePath + '/admin/person/save',
        type: 'POST',
        dataType: 'json',
        cache: false,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        data: data,
        success: function(msg) {
          var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引

          if (msg.code === 1) {
            parent.$("#handle_status").val('1');

            parent.layer.close(index); //再执行关闭

          } else {

            parent.$("#handle_status").val('0');
            parent.layer.close(index); //再执行关闭
          }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {

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
				$.getJSON(basePath + '/admin/department/treeform', function(
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
</script>
</head>
<body>

	<form id="myForm">
		<input type="hidden" name="id" value="${person.id}">
		<table class="myTable">
			<tr>
				<th>登录账号<i>*</i></th>
				<td><input type="text" name="name" id="name"
					value="${person.name}" /></td>
				<th>姓名<i>*</i></th>
				<td><input type="text" name="myname" id="myname"
					value="${person.myname}" /></td>
			<tr>
			<tr>
				<th>登录密码<i>*</i></th>
				<c:choose>
					<c:when test="${status =='add'}">
						<td><input type="password" name="password" id="password" /></td>
						<th>确认密码<i>*</i></th>
						<td><input type="password" name="surepassword"
							id="surepassword" /></td>
					</c:when>
					<c:otherwise>
						<td><input type="password" name="password" id="password"
							value="${person.password}" disabled="disabled" /></td>
						<th>确认密码<i>*</i></th>
						<td><input type="password" name="surepassword"
							id="surepassword" value="${person.surepassword}"
							disabled="disabled" /></td>
					</c:otherwise>
				</c:choose>
			<tr>
			<tr>
				<th>部门</th>
				<td ><input id="parentname" type="text"
					style="width: 150px;" onclick="showMenu();" /> <input
					id="parentid" name="parentid" style="display: none" value="${person.sysdepartmentid}" /></td>
				<th>邮箱</th>
				<td><input type="text" name="emailaddress"
					value="${person.emailaddress}" /></td>
			<tr>
			<tr>
				<th>性别</th>
				<td><select name="sex" id="sex">
						<option value="1"
							<c:if test="${person.sex==1}">selected="selected"</c:if>>男</option>
						<option value="0"
							<c:if test="${person.sex==0}">selected="selected"</c:if>>女</option>
				</select></td>
				<th>状态</th>
				<td><select name="state" id="state">
						<option value="1"
							<c:if test="${person.state==1}">selected="selected"</c:if>>开启</option>
						<option value="0"
							<c:if test="${person.state==0}">selected="selected"</c:if>>关闭</option>


				</select></td>
			<tr>
			
			<tr>
				<th>手机号码</th>
				<td><input type="text" name="mobilephonenumber"
					value="${person.mobilephonenumber}" /></td>
				<th>办公电话</th>
				<td><input type="text" name="phonenumber"
					value="${person.phonenumber}" /></td>
			<tr>
			<tr>
				<th>备注</th>
				<td colspan="3"><textarea name="remark"
				>${person.remark}</textarea></td>
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