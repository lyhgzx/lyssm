<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<c:set var="staticPath" value="${basePath}/resources"></c:set>
<link href="${staticPath}/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link href="${staticPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">

<!-- 全局js -->
<script src="${staticPath}/js/jquery.min.js?v=2.1.4"></script>
<script src="${staticPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script type="text/javascript">
	 var basePath = "${basePath}";
	
	
	(function($) {
	    $.fn.serializeJSON = function(options) {
	        var opts = $.extend({}, $.fn.serializeJSON.defaults, options);
	        var toArray = function(value,char){
	            return value.split(char);
	        }
	        var formData = this.serialize();
	        var params = toArray(formData,"&");
	        var resultJSON={};
	        var connecter = function(name,source,value){
	            if(!value || value.length<1)return source;
	            var char = opts.connectName[name]?opts.connectName[name]:opts.connect;
	            return source+char+value;
	        }
	        $.each(params,function(){
	            var param = toArray(this,"=");
	            var attr = param[0];
	            var val = param[1];
	            if(resultJSON[attr]){//multi
	                resultJSON[attr] = connecter(attr,resultJSON[attr],val);
	            }else{
	                resultJSON[attr] = val;
	            }
	        })
	        return resultJSON;
	    };
	    $.fn.serializeJSON.defaults = {
	            connectName:{},
	            connect:","
	    };
	})(jQuery);
	</script>

<style>
/*表单样式*/
.myTable
{
    border-collapse: collapse;
    border: 1px solid #94aec9;
    width: 100%
}

    .myTable th
    {
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

    .myTable td
    {
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

</style>

