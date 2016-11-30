<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/jsp/base/sys_form.jsp"%>
<script type="text/javascript">

  function save(){
	  var data=$("form").serializeJSON();

	  data.roleId=$("#role").val();
	  alert(data);
	  $.ajax({
          url: basePath+'/admin/sysUser/saveSysUser',
          type: 'POST',
          dataType: 'json',
          cache: false,
          data: data,
          success: function (msg) {
              if (msg.code === 1) {
            	  parent.layer.alert('增加成功!', { icon: 6 }, function () {
            		  
                      var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                      parent.layer.close(index); //再执行关闭
                      
                  });
              } else {
               
            	  
            	  
                  return;
              }
          },
          error: function (XMLHttpRequest, textStatus, errorThrown) {
        
              return;
          }
      })
  }
  
</script>
</head>
<body>

	<form >
		<table class="myTable">
			<tr>
				<th>登录账号<i>*</i></th>
				<td ><input type="text" name="username"  id="username"/></td>
				<th>用户角色<i>*</i></th>
				<td>
				 <select id="role">
				 <option value="-1">--请选择--</option>
				 <c:forEach items="${roles}" var="role" varStatus="status">
				     <option value="${role.id}">${role.name}</option>
				 </c:forEach>
				 </select>
				</td>
			<tr>
			<tr>
			    <th>登录密码<i>*</i></th>
				<td><input type="password" name="password" id="password" /></td>
				<th>确认密码</th>
				<td><input type="password" name="password2" id="password2" /></td>
			
			<tr>
			<tr>
				<th>姓名<i>*</i></th>
				<td>	<input type="text" name="name"/></td>
				<th>电话<i>*</i></th>
				<td><input type="text" name="phone"/></td>
			<tr>
		    
		</table>
	</form>
</body>
</html>