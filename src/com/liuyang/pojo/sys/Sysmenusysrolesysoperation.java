package com.liuyang.pojo.sys;

import java.io.Serializable;

public class Sysmenusysrolesysoperation implements Serializable {
    private String id;

    private String sysmenuid;

    private String sysoperationid;

    private String sysroleid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSysmenuid() {
        return sysmenuid;
    }

    public void setSysmenuid(String sysmenuid) {
        this.sysmenuid = sysmenuid == null ? null : sysmenuid.trim();
    }

    public String getSysoperationid() {
        return sysoperationid;
    }

    public void setSysoperationid(String sysoperationid) {
        this.sysoperationid = sysoperationid == null ? null : sysoperationid.trim();
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
        sb.append(", id=").append(id);
        sb.append(", sysmenuid=").append(sysmenuid);
        sb.append(", sysoperationid=").append(sysoperationid);
        sb.append(", sysroleid=").append(sysroleid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}