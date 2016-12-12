<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/jsp/base/sys_form.jsp"%>

<script type="text/javascript">
var roleid='${id}';
</script>
<script src="${staticPath}/js/sys/rolemenu.js"></script>
</head>
<body>
<input id="hiddenRoleId" type="hidden" value="${id}"/>
	<div class="container-fluid">
		<div class="row ">
			<div class="col-sm-12">
				<form class="form-inline pull-right" style="padding: 5px">
					<span class="label label-warning">用户可访问的模块=其角色的模块+本身可访问的模块</span>
					<button id="btnAccess" class="btn btn-primary " type="button">
						<i class="fa fa-check"></i> 授权选中
					</button>
					<button id="btnDelAccess" class="btn btn-primary " type="button">
						<i class="fa fa-times"></i> 取消授权
					</button>
				</form>
			</div>

		</div>
		<div class="row">
			<div class="col-sm-6">
				<div class="panel panel-default">
					
					<div class="panel-body">
					系统的模块
						<ul id="tree" class="ztree" style="height: 300px;width: 300px"></ul>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="panel panel-default">
				
					<div class="panel-body">
					已分配的模块
						<ul id="selected" class="ztree" style="height: 300px;width: 300px"></ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>