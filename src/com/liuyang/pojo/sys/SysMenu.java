package com.liuyang.pojo.sys;

import com.liuyang.vo.sys.SysMenuVo;

public class SysMenu {
    private String id;

    private String pid;

    private String name;

    private String url;

    private String img;

    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

	@Override
	public String toString() {
		return "SysMenu [id=" + id + ", pid=" + pid + ", name=" + name + ", url=" + url + ", img=" + img + ", sort="
				+ sort + "]";
	}
	public SysMenuVo toVo() {
		SysMenuVo vo = new SysMenuVo();
		vo.setId(id);
		vo.setPid(pid);
		vo.setName(name);
		vo.setUrl(url);
		vo.setImg(img);
		vo.setSort(sort);
		return vo;
	}
    
}