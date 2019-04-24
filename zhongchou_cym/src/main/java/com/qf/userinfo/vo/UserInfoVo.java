package com.qf.userinfo.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;


public class UserInfoVo implements Serializable {
    @NotBlank
    @Length(min = 6, max = 20, message = "用户名长度为6~20")
    private String uname;
    @Length(min = 6, max = 6, message = "密码长度为6位")
    private String upass;
    private String realname;
    @Pattern(regexp = "^[0-9a-zA-Z_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "邮箱地址不合法")
    private String email;

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                '}';
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

    public UserInfoVo(String uname, String upass, String realname, String email) {
        this.uname = uname;
        this.upass = upass;
        this.realname = realname;
        this.email = email;
    }

    public UserInfoVo() {
    }
}
