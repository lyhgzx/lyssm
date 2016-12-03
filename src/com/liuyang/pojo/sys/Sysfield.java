package com.liuyang.pojo.sys;

import java.util.Date;

public class Sysfield {
    private String id;

    private Integer dicKey;

    private String dicName;

    private String dicType;

    private String dicTypename;

    private Integer sort;

    private String rm;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getDicKey() {
        return dicKey;
    }

    public void setDicKey(Integer dicKey) {
        this.dicKey = dicKey;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public String getDicType() {
        return dicType;
    }

    public void setDicType(String dicType) {
        this.dicType = dicType == null ? null : dicType.trim();
    }

    public String getDicTypename() {
        return dicTypename;
    }

    public void setDicTypename(String dicTypename) {
        this.dicTypename = dicTypename == null ? null : dicTypename.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm == null ? null : rm.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}