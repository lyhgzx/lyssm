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

  })

  function save() {
    if ($("#myForm").valid()) {

      var data = $("form").serializeJSON();

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
</body>
</html>