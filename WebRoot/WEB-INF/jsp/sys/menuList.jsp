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
	src="${staticPath}/js/sys/menu.js"></script>


</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<form class="form-inline" style="padding: 15px">
								<div class="form-group">
								
								</div>
					<div class="pull-right">
						<button id="insert" class="btn btn-primary " type="button">
							<i class="fa fa-plus"></i> 增加
						</button>
						<button id="modify" class="btn btn-primary " type="button">
							<i class="fa fa-paste"></i> 编辑
						</button>
						<button id="delete" class="btn btn-primary " type="button">
							<i class="fa fa-times"></i> 删除
						</button>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="panel panel-primary">

					<div class="panel-body">
						<ul id="tree" class="ztree">
						</ul>
					</div>
				</div>

				
			</div>
			<div class="col-md-9"> <table id="tb"></table></div>
		</div>
	</div>
	<input id="handle_status" value="" hidden="hidden">
</body>
</html>