/**
 * 用户管理
 */
 $(function(){
 user.init();
 });
 
 var app={};
 var user={
 	init:function(){
 		user.bind();
 		user.loadTable();
 	},
 	bind:function(){
 		$("#insert").click(function(){
 	      var addDialog = layer.open({
                type: 2,
                title: '增加页面',
                shadeClose: false,
                maxmin: true, //开启最大化最小化按钮
                area: ['700px', '400px'],
                content: [basePath+'/admin/sysUser/userAdd', 'no'], //iframe的url
                end: function () {
                    $('#tb').bootstrapTable('refresh');
                }
            });
 		});
 	},
 	loadTable:function(){
 		  var opt = {
            target: "#tb",
            url: basePath+"/admin/sysUser/findtable",
            uniqueId: "id",
            columns: [{
                checkbox: true
            }, {
                field: 'username',
                title: '登录名'
          
            }, {
                field: 'name',
                title: '用户名'
    
            }, {
                field: 'roleName',
                title: '所属角色'
    
            }, {
                field: 'status',
                title: '状态',
                formatter:function(value, row){
                	return value=="1"?"开启":"关闭";
                }
            }]
           
           
        };
        var bt = new BTable(opt);
 	}
 }