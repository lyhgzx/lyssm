package com.liuyang.pojo.sys;

import java.util.Date;

public class Sysperson {
    private String id;

    private String name;

    private String myname;

    private String password;

    private String surepassword;

    private Integer sex;

    private String sysdepartmentid;

    private String position;

    private String mobilephonenumber;

    private String phonenumber;

    private String province;

    private String city;

    private String village;

    private String address;

    private String emailaddress;

    private String remark;

    private Integer state;

    private Date createtime;

    private String createperson;

    private Date updatetime;

    private Integer logonnum;

    private Date lastlogontime;

    private String lastlogonip;

    private String hdpic;

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

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname == null ? null : myname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSurepassword() {
        return surepassword;
    }

    public void setSurepassword(String surepassword) {
        this.surepassword = surepassword == null ? null : surepassword.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSysdepartmentid() {
        return sysdepartmentid;
    }

    public void setSysdepartmentid(String sysdepartmentid) {
        this.sysdepartmentid = sysdepartmentid == null ? null : sysdepartmentid.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getMobilephonenumber() {
        return mobilephonenumber;
    }

    public void setMobilephonenumber(String mobilephonenumber) {
        this.mobilephonenumber = mobilephonenumber == null ? null : mobilephonenumber.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getLogonnum() {
        return logonnum;
    }

    public void setLogonnum(Integer logonnum) {
        this.logonnum = logonnum;
    }

    public Date getLastlogontime() {
        return lastlogontime;
    }

    public void setLastlogontime(Date lastlogontime) {
        this.lastlogontime = lastlogontime;
    }

    public String getLastlogonip() {
        return lastlogonip;
    }

    public void setLastlogonip(String lastlogonip) {
        this.lastlogonip = lastlogonip == null ? null : lastlogonip.trim();
    }

    public String getHdpic() {
        return hdpic;
    }

    public void setHdpic(String hdpic) {
        this.hdpic = hdpic == null ? null : hdpic.trim();
    }
}