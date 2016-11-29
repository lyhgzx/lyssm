package com.liuyang.pojo.sys;

public class SysRoleMenu extends SysRoleMenuKey {
    private String operate;

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }
}