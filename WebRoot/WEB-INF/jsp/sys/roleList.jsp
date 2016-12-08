<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/jsp/base/sys_tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <base href="${basePath}">
<title>用户管理</title>
    <%@ include file="/WEB-INF/jsp/base/sys_head.jsp"%>
  <script
	src="${staticPath}/js/sys/role.js"></script>
</head>
<body>
<div class="container-fluid">
<div class="panel panel-default">
    <div class="col-md-12 col-lg-12">
        <div class="panel panel-widget">
            <form class="form-inline" style="padding:15px">
             <div class="form-group">
                    <label >角色名:</label>

<input type="text" class="form-control" id="name" / >
                </div>
             
              <button id="search" class="btn btn-primary " type="button"><i class="fa fa-search"></i> 搜索</button>
               <button  id="insert"  class="btn btn-primary " type="button"><i class="fa fa-check"></i> 增加</button>
             <button id="modify" class="btn btn-primary " type="button"><i class="fa fa-paste"></i> 编辑</button>
                   <button id="delete" class="btn btn-primary " type="button"><i class="fa fa-times"></i> 删除</button>
            </form>
        </div>
    </div>
</div>
 <div class="row">
 <table id="tb"></table>
 </div>
</div>
<input id="handle_status" value="" hidden="hidden">
</body>
</html>