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

      script: {
        required: true
      }
   

    },
    messages: {
    	name: {
        required:"请输入操作名称"
      },
      script: "请输入操作方法"


    }
  });

})

function save() {
  if ($("#myForm").valid()) {

    var data = $("form").serializeJSON();

    data.status = $("#status").val();
    $.ajax({
      url: basePath + '/admin/operation/save',
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
		<input type="hidden" name="id" value="${model.id}">
		<table class="myTable">
			<tr>
				<th>名称<i>*</i></th>
				<td><input type="text" name="name" id="name"
					value="${model.name}" /></td>
				<th>方法<i>*</i></th>
				<td><input type="text" name="script" id="script"
					value="${model.script}" /></td>
			<tr>
			
			<tr>
				<th>图标</th>
				<td><input type="text" name="icon"
					value="${model.icon}" /></td>
				<th>DomId</th>
				<td><input type="text" name="domid"
					value="${model.domid}" /></td>
			<tr>
			<tr>
				<th>类</th>
				<td><input type="text" name="classcss"
					value="${model.classcss}" /></td>
				<th>控件类型</th>
				<td><input type="text" name="type"
					value="${model.type}" /></td>
			<tr>
			<tr>
				<th>控件属性</th>
				<td><input type="text" name="attr"
					value="${model.attr}" /></td>
				<th>排序</th>
				<td><input type="text" name="sort"
					value="${model.sort}" /></td>
			<tr>
			<tr>
				<th>备注</th>
				<td colspan="3"><textarea name="remark"
				>${model.remark}</textarea></td>
			<tr>
		</table>
	</form>
</body>
</html>