<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<c:set var="staticPath" value="${basePath}/resources"></c:set>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="${staticPath}/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link href="${staticPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link
	href="${staticPath}/js/plugins/ztree/css/metroStyle/metroStyle.css"
	rel="stylesheet">
<link
	href="${staticPath}/css/plugins/bootstrap-table/bootstrap-table.min.css"
	rel="stylesheet">
<link href="${staticPath}/js/plugins/select2/css/select2.min.css"
	rel="stylesheet">
<!-- 全局js -->
<script src="${staticPath}/js/jquery.min.js?v=2.1.4"></script>

<script src="${staticPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script
	src="${staticPath}/js/plugins/jquery-validation/jquery.validate.min.js"></script>
<script
	src="${staticPath}/js/plugins/jquery-validation/localization/messages_zh.js"></script>

<!-- ztree -->
<script src="${staticPath}/js/plugins/ztree/js/jquery.ztree.all.js"></script>

<!-- select2 -->
<script src="${staticPath}/js/plugins/select2/js/select2.min.js"></script>
<script src="${staticPath}/js/plugins/select2/js/i18n/zh-CN.js"></script>

<!-- Bootstrap table -->
<script
	src="${staticPath}/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script
	src="${staticPath}/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="${staticPath}/js/plugins/bootstrap-table/jquery-btable.js"></script>

<!-- layer -->
<script src="${staticPath}/js/plugins/layer/layer.min.js"></script>
<!-- datepicker -->
<script src="${staticPath}/js/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<!-- 自定义工具类 -->
<script src="${staticPath}/js/ly.js"></script>
<style>
/*错误样式*/
input.error {
	border: 1px dashed red;
	background: yellow;
	padding: 2px;
}

select.error {
	border: 1px dashed red;
	background: yellow;
	padding: 2px;
}

.error {
	padding-left: 16px;
	margin-left: 2px;
	color: red;
	/*背景图片（校验未通过的’×’图标）*/
	background: url(${staticPath}/img/error.png) no-repeat 0px 0px;
	font-family: Verdana, Geneva, sans-serif;
	font-size: 11px;
}
/*验证通过样式*/
input.valid {
	background: #FFC;
	border: #09F solid 1px;
	padding: 2px;
}

select.valid {
	background: #FFC;
	border: #09F solid 1px;
	padding: 2px;
}

.valid {
	padding-left: 16px;
	margin-left: 2px;
	/*背景图片(校验通过的’√’图标)*/
	background: url(checked.gif) no-repeat 0px 0px;
	font-family: Verdana, Geneva, sans-serif;
	color: #00F;
	font-size: 11px;
}

/*表单样式*/
.myTable {
	border-collapse: collapse;
	border: 1px solid #94aec9;
	width: 100%
}

.myTable th {
	border-collapse: collapse;
	border: 1px solid #94aec9;
	white-space: nowrap;
	word-break: keep-all;
	background-color: #e1f1fa;
	height: 28px;
	font-family: '宋体';
	font-size: 13px;
	color: #1185da;
	text-align: center;
	font-weight: 100;
}

.myTable td {
	/*background-color: white;*/
	border-collapse: collapse;
	border: 1px solid #94aec9;
	height: 28px;
	font-family: '宋体';
	font-size: 13px;
	padding-left: 5px;
	text-align: left;
	white-space: nowrap;
	word-break: keep-all;
}

ul.ztree {
	margin-top: 10px;
	border: 1px solid #617775;
	background: #f0f6e4;
	width: 220px;
	height: 360px;
	overflow-y: scroll;
	overflow-x: auto;
	z-index: 9999;
}
</style>


<script type="text/javascript">
  var basePath = "${basePath}";
  var staticPath = "${basePath}";
  (function($) {
    $.fn.serializeJSON = function(options) {
      var opts = $.extend({}, $.fn.serializeJSON.defaults, options);
      var toArray = function(value, char) {
        return value.split(char);
      }
      var formData = this.serialize();
      //解决序列化乱码问题
      formData = decodeURIComponent(formData, true);
      var params = toArray(formData, "&");
      var resultJSON = {};
      var connecter = function(name, source, value) {
        if (!value || value.length < 1) return source;
        var char = opts.connectName[name] ? opts.connectName[name]
                : opts.connect;
        return source + char + value;
      }
      $.each(params, function() {
        var param = toArray(this, "=");
        var attr = param[0];
        var val = param[1];
        if (resultJSON[attr]) {//multi
          resultJSON[attr] = connecter(attr, resultJSON[attr], val);
        } else {
          resultJSON[attr] = val;
        }
      })
      return resultJSON;
    };
    $.fn.serializeJSON.defaults = {
      connectName: {},
      connect: ","
    };
  })(jQuery);
</script>

