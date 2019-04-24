package com.qf.userinfo.vo;

import java.util.List;

public class UserRoleVo {
    int userid;
    List<Integer> roles;

    @Override
    public String toString() {
        return "UserRoleVo{" +
                "userid=" + userid +
                ", roles=" + roles +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
}
