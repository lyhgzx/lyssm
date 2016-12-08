package com.liuyang.pojo.sys;

import java.io.Serializable;

public class Sysrolesysperson implements Serializable {
    private String syspersonid;

    private String sysroleid;

    private static final long serialVersionUID = 1L;

    public String getSyspersonid() {
        return syspersonid;
    }

    public void setSyspersonid(String syspersonid) {
        this.syspersonid = syspersonid == null ? null : syspersonid.trim();
    }

    public String getSysroleid() {
        return sysroleid;
    }

    public void setSysroleid(String sysroleid) {
        this.sysroleid = sysroleid == null ? null : sysroleid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", syspersonid=").append(syspersonid);
        sb.append(", sysroleid=").append(sysroleid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}