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
      dicKey: {
        required: true,
        digits:true  
      },

      dicName: {
        required: true
      }
   

    },
    messages: {
      dicKey: {
        required:"请输入字典编号",
        digits:"请输入整数"
      },
      dicName: "请输入字典名称"


    }
  });

})

function save() {
  if ($("#myForm").valid()) {

    var data = $("form").serializeJSON();

    data.status = $("#status").val();
    $.ajax({
      url: basePath + '/admin/field/save',
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
</script>
</head>
<body>

	<form id="myForm">
		<input type="hidden" name="id" value="${sysfield.id}">
		<table class="myTable">
			<tr>
				<th>字典编号<i>*</i></th>
				<td><input type="text" name="dicKey" id="dicKey"
					value="${sysfield.dicKey}" /></td>
				<th>字典名称<i>*</i></th>
				<td><input type="text" name="dicName" id="dicName"
					value="${sysfield.dicName}" /></td>
			<tr>
			
			<tr>
				<th>字典类型</th>
				<td><input type="text" name="dicType"
					value="${sysfield.dicType}" /></td>
				<th>字典类型名称</th>
				<td><input type="text" name="dicTypename"
					value="${sysfield.dicTypename}" /></td>
			<tr>
			<tr>
				<th>备注</th>
				<td colspan="3"><textarea name="rm"
				>${sysfield.rm}</textarea></td>
			<tr>
		</table>
	</form>
</body>
</html>