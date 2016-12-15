<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="${staticPath}/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link href="${staticPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link
	href="${staticPath}/css/plugins/bootstrap-table/bootstrap-table.min.css"
	rel="stylesheet">
<link
	href="${staticPath}/js/plugins/ztree/css/metroStyle/metroStyle.css"
	rel="stylesheet">
<link
	href="${staticPath}/js/plugins/datepicker/css/bootstrap-datepicker3.standalone.min.css"
	rel="stylesheet">
<link href="${staticPath}/css/style.css" rel="stylesheet">

<script type="text/javascript">
  var basePath = "${basePath}";
  var staticPath = "${staticPath}";
</script>
<!-- 全局js -->
<script src="${staticPath}/js/jquery.min.js?v=2.1.4"></script>
<script src="${staticPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${staticPath}/js/plugins/layer/layer.min.js"></script>

<!-- Bootstrap table -->
<script
	src="${staticPath}/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script
	src="${staticPath}/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${staticPath}/js/plugins/bootstrap-table/jquery-btable.js"></script>
<!-- ztree -->
<script src="${staticPath}/js/plugins/ztree/js/jquery.ztree.all.js"></script>
<!-- datepicker -->

<script
	src="${staticPath}/js/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<script
	src="${staticPath}/js/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"
	charset="UTF-8"></script>
<!-- 自定义工具类 -->
<script src="${staticPath}/js/ly.js"></script>
<script type="text/javascript">

  //datepicker 开始时间，结束时间封装
  function DatePicker(beginSelector, endSelector)
  {
    // 仅选择日期  
    $(beginSelector).datepicker({
      language: "zh-CN",
      autoclose: true,
      startView: 0,
      format: "yyyy-mm-dd",
      clearBtn: true,
      todayBtn: false,
      endDate: new Date()
    }).on('changeDate', function(ev)
    {
      if (ev.date)
      {
        $(endSelector).datepicker('setStartDate', new Date(ev.date.valueOf()))
      } else
      {
        $(endSelector).datepicker('setStartDate', null);
      }
    })

    $(endSelector).datepicker({
      language: "zh-CN",
      autoclose: true,
      startView: 0,
      format: "yyyy-mm-dd",
      clearBtn: true,
      todayBtn: false,
      endDate: new Date()
    }).on('changeDate', function(ev)
    {
      if (ev.date)
      {
        $(beginSelector).datepicker('setEndDate', new Date(ev.date.valueOf()))
      } else
      {
        $(beginSelector).datepicker('setEndDate', new Date());
      }

    })
  }
</script>

