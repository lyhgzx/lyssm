<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/sys_tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="${basePath}">

<%@ include file="/WEB-INF/jsp/base/sys_head.jsp"%>
<script type="text/javascript">
	var _personid = ${personid};
	
</script>
<script src="${staticPath}/js/sys/GivePersonRole.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="panel panel-default">
			<div class="col-md-12 col-lg-12">



				<button id="selectAuthor" class="btn btn-primary " type="button">
					<i class="fa fa-paste"></i> 授权选中
				</button>
				<button id="noselectAuthor" class="btn btn-primary " type="button">
					<i class="fa fa-times"></i> 取消授权
				</button>


			</div>
		</div>
		<div class="row">
			<table id="tb"></table>
		</div>
	</div>
	
</body>
</html>