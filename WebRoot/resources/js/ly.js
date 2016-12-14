/**
 * liuyang 工具类  依赖jquery,layer
 */
 
 (function ($) {
 /**
 * ajax 全局设置
 */
 $.ajaxSetup({
	contentType : 'application/x-www-form-urlencoded;charset = utf-8', 
	complete : function(xhr, textStatus) {
		if (xhr.status == 911) { 
	        window.location.href = basePath;
		} 
	} 
});


   $.xtemplate = function (template, data) {
		return template.replace(/\{([\w\.]*)\}/g, function(str, key) {
			var keys = key.split('.'), v = data[keys.shift()];
			for (var i = 0, l = keys.length; i < l; i++) v = v[keys[i]];
			return (typeof v !== 'undefined' && v !== null) ? v : '';
		});
	}
	$.format = function(str){
		var args = arguments, re = new RegExp('\\{([1-' + args.length + '])\\}', 'g');
		return String(str).replace( re, function($1, $2) {
			return args[$2];
		});
	}
	$.log = function(content){
		if (window.console && window.console.log){
			window.console.log(content);
		}
	}
	$.logError = function(content){
		if (window.console && window.console.error){
			window.console.error(content);
		}
	}
	
	
	$.ok=function(options){
		   var defaults={
		   	 msg:"成功",
		   	 time:2000,
		   	 func:function(){
		   	 	
		   	 }
		   };
		   var ops = $.extend(defaults, options);
		   layer.msg(ops.msg, {
						icon : 1,
						time : ops.time
					},ops.func);
  		
	}
	
	$.error=function(options){
		   var defaults={
		   	 msg:"失败",
		   	 time:2000,
		   	 func:function(){
		   	 	
		   	 }
		   };
		   var ops = $.extend(defaults, options);
		   layer.msg(ops.msg, {
						icon : 2,
						time : ops.time
					},ops.func);
  		
	}
	



})(jQuery);