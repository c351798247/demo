package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("userinfo")
public class UserInfo {
    private int userid;
    private String uname;
    private String upass;
    private String realname;
    private String email;
    private String state;


    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UserInfo(int userid, String uname, String upass, String realname, String email) {
        this.userid = userid;
        this.uname = uname;
        this.upass = upass;
        this.realname = realname;
        this.email = email;
    }

    public UserInfo() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
