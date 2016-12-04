<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/sys_tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门管理</title>
<%@ include file="/WEB-INF/jsp/base/sys_head.jsp"%>


  <script
	src="${staticPath}/js/sys/department.js"></script>


</head>
<body>
	<div class="container-fluid">
		<div class="panel panel-default">
			<div class="col-md-12 col-lg-12">

				<form class="form-inline" style="padding: 15px">


					<button id="insert" class="btn btn-primary " type="button">
						<i class="fa fa-check"></i> 增加
					</button>
					<button id="modify" class="btn btn-primary " type="button">
						<i class="fa fa-paste"></i> 编辑
					</button>
					<button id="delete" class="btn btn-primary " type="button">
						<i class="fa fa-times"></i> 删除
					</button>
				</form>

			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<div class="panel panel-primary">

					<div class="panel-body">
						<ul id="tree" class="ztree">
					</div>
				</div>

				</ul>
			</div>
			<div class="col-md-10">.col-md-4</div>
		</div>
	</div>
</body>
</html>