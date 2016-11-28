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

                area: ['800px', '600px'],
                content: ['/IntegratedManagement/Notice/add', 'no'], //iframe的url
                end: function () {
                    $('#tb').bootstrapTable('refresh');
                }
            });
 		});
 	},
 	loadTable:function(){
 		  var opt = {
            target: "#tb",
            url: "/IntegratedManagement/Notice/Get",
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
                field: 'createTime',
                title: '创建时间'
    
            }]
           
           
        };
        var bt = new BTable(opt);
 	}
 }