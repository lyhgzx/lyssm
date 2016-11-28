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
<div class="row col-lg-12">
    <div class="wrapper wrapper-content animated fadeInUp">
        <div class="ibox">
            <div class="ibox-title">
                  <h5>用户管理</h5>
                <div class="ibox-tools rboor">
                <button  id="insert"  class="btn btn-primary " type="button"><i class="fa fa-check"></i> 增加</button>
                 <button id="modify" class="btn btn-primary " type="button"><i class="fa fa-paste"></i> 编辑</button>
         <button id="delete" class="btn btn-primary " type="button"><i class="fa fa-times"></i> 删除</button>
 
                  
                </div>
            </div>
            <div class="ibox-content">
              
                    <div class="form-horizontal clearfix">
                        <div class="col-lg-4 col-sm-3 pl0" style="width:38%;">
                            <div class="form-group">
                                <label class="control-label" style="width:20%; float:left;">用户名称：</label>
                                <div class="col-lg-8 col-sm-7">
                                   <input type="text" class="form-control"></input>

                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-sm-4" style="float:right;">
                            <div class="form-group">
                                <div class="col-lg-12 col-sm-12 input-group">
                                   
                                    <span class="input-group-btn">
                                   
            <button class="btn btn-primary " type="button"><i class="fa fa-search"></i> 搜索</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                <!-- search end -->
                <div id="example_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                  <table id="tb"></table>
                  
                </div>
                
            </div>
        </div>
    </div>
</div>
<!-- table end -->


</body>
</html>