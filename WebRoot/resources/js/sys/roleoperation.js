/**
 * 为角色分配菜单
 */




$(document).ready(function () {
    $("#btnAccess").on("click", function () {
    	var ids = selected.getSelected();
    	if (ids == null) {
			return;
		}
       if(!selected.getMenuId()){
    	   layer.msg('没有选择菜单', {
				icon : 2
			});
    	   return;
       }
       
        $.post(basePath+'/admin/role/AuthorRoleOperation', {
        	roleId: roleid,
            menuId: selected.getMenuId(),
            operationIds:ids
        }, function (json) {
          if(json.code===1){
        	  selected.reLoad();
          }else{
        	  
          }
          
          
        });
    });
    $("#btnDelAccess").on("click", function () {
    	var ids = selected.getSelected();
    	if (ids == null) {
			return;
		}
        if(!selected.getMenuId()){
     	   layer.msg('没有选择菜单', {
 				icon : 2
 			});
     	   return;
        }

        $.post(basePath+'/admin/role/NuAuthorRoleOperation', {

        	roleId: roleid,
            menuId: selected.getMenuId(),
            operationIds:ids
        }, function (json) {
           
        	  if(json.code===1){
            	  selected.reLoad();
              }else{
            	  
              }
              
        });
    });
    
    selected.init();

});


//已分配的机构
var selected = function () {
    var menuId;
    var zTreeObj;
    var tableObj;
    
    var setting = {
        view: {
            selectedMulti: false
        },
        data: {
            key: {
                name: 'name',
                title: 'name'
            },
            simpleData: {
                enable: true,
                idKey: 'id',
                pIdKey: 'parentid',
                rootPId: 'null'
            }
        },
        callback: {
    		onClick : zTreeOnClick
        }
    };

    function zTreeOnClick(event, treeId, treeNode) {
    	menuId=treeNode.id;
    	tableObj.reload({
			menuId : treeNode.id,
			roleId:roleid
			
		});
 
		return;

	}

    var load = function () {
        var url;
        url = basePath+'/admin/role/getgivemenus?id='+roleid;

        $.getJSON(url, function (json) {
            zTreeObj = $.fn.zTree.init($("#selected"), setting, json);
            zTreeObj.expandAll(true);
        });
    };

    var loadTable=function(){
    	var opt = {
    			target : "#tb",
    			url : basePath + "/admin/role/getOperationTable",
    			uniqueId : "id",
    			columns : [ {
    				checkbox : true
    			}, {
    				field : 'name',
    				title : '操作名称'

    			}, {
    				field : 'author',
    				title : '是否授权'

    			}]

    		};
    	tableObj=	new BTable(opt);
    };
    
    return {
    	init:function(){
    		load();
        	loadTable();
    	},
       
        getSelected: function () {
        	var ids = tableObj.getSelectedProperties("id");
        	return ids;
        },
        reLoad: function () {
     
        	tableObj.reload({
    			menuId : menuId,
    			roleId:roleid
    			
    		});
        	

        },
        getMenuId:function(){
        	return menuId;
        }
        
    }
}();

