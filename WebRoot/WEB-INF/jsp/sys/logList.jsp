<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/sys_tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="${basePath}">
<title>日志管理</title>
<%@ include file="/WEB-INF/jsp/base/sys_head.jsp"%>
<script src="${staticPath}/js/sys/log.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<form class="form-inline" style="padding: 15px">

					<div class="form-group">
						<label>时间:</label> 
							<input id="begTime" data-provide="datepicker" data-date-format="yyyy-mm-dd" data-date-language="zh-CN"/>
					</div>
					<div class="form-group">
						<label>至</label>
<input id="endTime" data-provide="datepicker" data-date-format="yyyy-mm-dd" data-date-language="zh-CN"/>
					</div>
				
						<button id="search" class="btn btn-primary " type="button">
							<i class="fa fa-search"></i> 搜索
						</button>
				
		
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
			     <div class="tabs-container">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true">登录日志</a>
                        </li>
                        <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">操作日志</a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div id="tab-1" class="tab-pane active">
                            <div class="panel-body">
                              		   <table id="tblogin"></table>
                            </div>
                        </div>
                        <div id="tab-2" class="tab-pane">
                            <div class="panel-body">
                             <table id="tblog"></table>
                            </div>
                        </div>
                    </div>


                </div>
			</div>
		</div>
	</div>

</body>
</html>