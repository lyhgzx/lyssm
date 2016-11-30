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
	src="${staticPath}/js/sys/user.js"></script>
</head>
<body>
<div class="panel panel-default">
    <div class="col-md-12 col-lg-12">
        <div class="panel panel-widget">
            <form class="form-inline" style="padding:15px">
                <div class="form-group">
                    <label >发布时间</label>

                    <input id="bg_RTM" onclick="WdatePicker({ dateFmt: 'yyyy-MM-dd' })" class="Wdate" type="text" name="bg_RTM" />
                </div>
                <div class="form-group">
                    <label >至</label>
                    <input id="ed_RTM" onclick="WdatePicker({ dateFmt: 'yyyy-MM-dd', minDate: '#F{$dp.$D(\'bg_RTM\')}' })" class="Wdate" type="text" name="ed_RTM" />
             
                </div>
              <button class="btn btn-primary " type="button"><i class="fa fa-search"></i> 搜索</button>
               <button  id="insert"  class="btn btn-primary " type="button"><i class="fa fa-check"></i> 增加</button>
             <button id="modify" class="btn btn-primary " type="button"><i class="fa fa-paste"></i> 编辑</button>
                   <button id="delete" class="btn btn-primary " type="button"><i class="fa fa-times"></i> 删除</button>
            </form>
        </div>
    </div>
</div>
<table id="tb"></table>
</body>
</html>