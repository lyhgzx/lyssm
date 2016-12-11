package com.liuyang.pojo.sys;

import java.io.Serializable;
import java.util.Date;

import com.liuyang.vo.sys.SysMenuVo;

public class Sysmenu implements Serializable {
    private String id;

    private String name;

    private String parentid;

    private String url;

    private String iconic;

    private Integer sort;

    private String state;

    private String createperson;

    private Date createtime;

    private Date updatetime;

    private String updateperson;

    private Byte isleaf;

    private Byte isautoexpand;

    private String tabid;

    private String cascadeid;

    private String parentname;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIconic() {
        return iconic;
    }

    public void setIconic(String iconic) {
        this.iconic = iconic == null ? null : iconic.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public String getTabid() {
        return tabid;
    }

    public void setTabid(String tabid) {
        this.tabid = tabid == null ? null : tabid.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", url=").append(url);
        sb.append(", iconic=").append(iconic);
        sb.append(", sort=").append(sort);
        sb.append(", state=").append(state);
        sb.append(", createperson=").append(createperson);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updateperson=").append(updateperson);
        sb.append(", isleaf=").append(isleaf);
        sb.append(", isautoexpand=").append(isautoexpand);
        sb.append(", tabid=").append(tabid);
        sb.append(", cascadeid=").append(cascadeid);
        sb.append(", parentname=").append(parentname);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
    
    	public SysMenuVo toVo() {
    			SysMenuVo vo = new SysMenuVo();
    			vo.setId(id);
    			vo.setParentid(parentid);
    			vo.setName(name);
    		    vo.setUrl(url);
    			vo.setIconic(iconic);
    			vo.setSort(sort);
    			return vo;
    		}
}