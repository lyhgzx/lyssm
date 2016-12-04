package com.liuyang.pojo.sys;

import java.util.Date;

public class Sysdepartment {
    private Integer id;

    private String name;

    private Integer parentid;

    private String address;

    private Integer sort;

    private Date createtime;

    private String createperson;

    private Date updatetime;

    private String updateperson;

    private Byte isleaf;

    private Byte isautoexpand;

    private String iconname;

    private Integer status;

    private String cascadeid;

    private String parentname;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateperson() {
        return updateperson;
    }

    public void setUpdateperson(String updateperson) {
        this.updateperson = updateperson == null ? null : updateperson.trim();
    }

    public Byte getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Byte isleaf) {
        this.isleaf = isleaf;
    }

    public Byte getIsautoexpand() {
        return isautoexpand;
    }

    public void setIsautoexpand(Byte isautoexpand) {
        this.isautoexpand = isautoexpand;
    }

    public String getIconname() {
        return iconname;
    }

    public void setIconname(String iconname) {
        this.iconname = iconname == null ? null : iconname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCascadeid() {
        return cascadeid;
    }

    public void setCascadeid(String cascadeid) {
        this.cascadeid = cascadeid == null ? null : cascadeid.trim();
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    
}