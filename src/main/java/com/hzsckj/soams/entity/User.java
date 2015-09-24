package com.hzsckj.soams.entity;

import java.util.Date;

public class User {
    private Integer userid;

    private String loginname;

    private String password;

    private String staffname;

    private String email;

    private String qq;

    private String weixin;

    private String telphone;

    private String dcflag;

    private Date createdt;

    private String superadmin;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getDcflag() {
        return dcflag;
    }

    public void setDcflag(String dcflag) {
        this.dcflag = dcflag == null ? null : dcflag.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getSuperadmin() {
        return superadmin;
    }

    public void setSuperadmin(String superadmin) {
        this.superadmin = superadmin == null ? null : superadmin.trim();
    }
}