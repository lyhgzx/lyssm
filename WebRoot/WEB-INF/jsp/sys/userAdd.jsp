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
		var v = $("#myForm")
				.validate(
						{
							
							rules : {
								username : {
									required : true
								},

								password : {
									required : true
								},
								password2:{
									required : true,
									 equalTo:"#password",//必须和谁相等
								},
								name:{
									required : true
								},
								role:{
									required : true
								}
							},
							messages : {
								username : "请输入登录名",
								password : "请输入密码",
								password2:"确认密码不一致",
									name:"请输入姓名",
									role:{
										required:"必选"
									}
							}
						});

	})

	function save() {
		if ($("#myForm").valid()) {

			var data = $("form").serializeJSON();

			data.roleid = $("#role").val();
			data.status=$("#status").val();
			$.ajax({
				url : basePath + '/admin/sysUser/saveSysUser',
				type : 'POST',
				dataType : 'json',
				cache : false,
				contentType: "application/x-www-form-urlencoded;charset=UTF-8",  
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
				error : function(XMLHttpRequest, textStatus, errorThrown) {

					return;
				}
			})

		}

	}
</script>
</head>
<body>

	<form id="myForm">
		<table class="myTable">
			<tr>
				<th>登录账号<i>*</i></th>
				<td colspan="3"><input type="text" name="username" id="username" /></td>
				
			<tr>
			<tr>
				<th>登录密码<i>*</i></th>
				<td><input type="password" name="password" id="password" /></td>
				<th>确认密码</th>
				<td><input type="password" name="password2" id="password2" /></td>
			<tr>
			<tr>
				<th>姓名<i>*</i></th>
				<td><input type="text" name="name" /></td>
				<th>电话</th>
				<td><input type="text" name="phone" /></td>
			<tr>
			<tr>
			<th>用户角色<i>*</i></th>
				<td><select name="role" id="role">
						<option value="">--请选择--</option>
						<c:forEach items="${roles}" var="role" varStatus="status">
							<option value="${role.id}">${role.name}</option>
						</c:forEach>
				</select></td>
				<th>状态</th>
				<td><select name="status" id="status">
						<option value="1">开启</option>
							<option value="0">关闭</option>
					
				</select></td>
			</tr>
		</table>
	</form>
</body>
</html>