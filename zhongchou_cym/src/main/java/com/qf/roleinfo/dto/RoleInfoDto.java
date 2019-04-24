package com.qf.roleinfo.dto;

public class RoleInfoDto {
    int roleid;
    String rolename;
    int selected;

    @Override
    public String toString() {
        return "RoleInfoDto{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", selected=" + selected +
                '}';
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }
}
