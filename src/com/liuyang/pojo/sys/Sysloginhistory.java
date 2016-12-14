package com.liuyang.pojo.sys;

import java.io.Serializable;
import java.util.Date;

public class Sysloginhistory implements Serializable {
    private Integer id;

    private String usercode;

    private String username;

    private String hostname;

    private String hostip;

    private String logincity;

    private Date logindate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getHostip() {
        return hostip;
    }

    public void setHostip(String hostip) {
        this.hostip = hostip == null ? null : hostip.trim();
    }

    public String getLogincity() {
        return logincity;
    }

    public void setLogincity(String logincity) {
        this.logincity = logincity == null ? null : logincity.trim();
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usercode=").append(usercode);
        sb.append(", username=").append(username);
        sb.append(", hostname=").append(hostname);
        sb.append(", hostip=").append(hostip);
        sb.append(", logincity=").append(logincity);
        sb.append(", logindate=").append(logindate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}