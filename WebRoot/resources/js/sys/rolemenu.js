/**
 * 为角色分配菜单
 */

$(document).ready(function () {
    $("#btnAccess").on("click", function () {
        var ids = ztree.getSelected();
        if (ids == null) return;
       
        $.post(basePath+'/admin/role/AddSysMenuSysRoleSysOperation', {
        	roleId: roleid,
            menuIds: ids
        }, function (json) {
          if(json.code===1){
        	  selected.reLoad();
          }else{
        	  
          }
          
          
        });
    });
    $("#btnDelAccess").on("click", function () {
        var ids = selected.getSelected();
        if (ids == null) return;

        $.post(basePath+'/admin/role/DelSysMenuSysRoleSysOperation', {

        	roleId: roleid,
        	menuIds: ids
        }, function (json) {
           
        	  if(json.code===1){
            	  selected.reLoad();
              }else{
            	  
              }
              
        });
    });
});
//待选的树
var ztree = function () {
    var moduleIds;
    var zTreeObj;
    var setting = {
        view: {
            selectedMulti: false
        },
        check: {
            enable: true,
            chkStyle: "checkbox",
            chkboxType: { "Y": "", "N": "" } //去掉勾选时级联
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
            onClick: zTreeOnClick,
            onCheck: zTreeCheck
        }
    };

    function zTreeCheck(e, treeId, treeNode) {
        var nodes = zTreeObj.getCheckedNodes(true);
        if (nodes.length == 0) {
            moduleIds = null;
        } else {
            moduleIds =  nodes.map(function (e) { return e.id; }).join(",") ;
        }
    }
    function zTreeOnClick(event, treeId, treeNode) {
        zTreeObj.checkNode(treeNode, !treeNode.checked, true, true);
        event.preventDefault();
    }

    $.getJSON(basePath+'/admin/role/getallmenus', function (json) {
        zTreeObj = $.fn.zTree.init($("#tree"), setting, json);
        zTreeObj.expandAll(false);
    });

    return {
        getSelected: function () {
            return moduleIds;
        }
    }
}();


//已分配的机构
var selected = function () {
    var moduleIds;
    var zTreeObj;
    var setting = {
        view: {
            selectedMulti: false
        },
        check: {
            enable: true,
            chkStyle: "checkbox",
            chkboxType: { "Y": "", "N": "" } //去掉勾选时级联
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
            onClick: zTreeOnClick,
            onCheck: zTreeCheck
        }
    };

    function zTreeCheck(e, treeId, treeNode) {
        var nodes = zTreeObj.getCheckedNodes(true);
        if (nodes.length == 0) {
            moduleIds = null;
        } else {
            moduleIds =  nodes.map(function (e) { return e.id; }).join(",") ;
        }
    }
    function zTreeOnClick(event, treeId, treeNode) {
        zTreeObj.checkNode(treeNode, !treeNode.checked, true, true);
        event.preventDefault();
    }

    var load = function () {
        var url;


        url = basePath+'/admin/role/getgivemenus?id='+roleid;

        $.getJSON(url, function (json) {
            zTreeObj = $.fn.zTree.init($("#selected"), setting, json);
            zTreeObj.expandAll(true);
        });
    }

    return {
        getSelected: function () {
            return moduleIds;
        },
        reLoad: function () {
            return load();
        }
    }
}();

selected.reLoad();
