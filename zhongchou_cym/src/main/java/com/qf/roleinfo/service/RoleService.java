package com.qf.roleinfo.service;

import com.qf.pojo.RoleInfo;

import java.util.List;

public interface RoleService {
    List<RoleInfo> getAllRole();

    void addRole(RoleInfo roleInfo);

    RoleInfo getRoleById(int roleid);

    void removeRoleById(int roleid);

    void updateRoleById(RoleInfo roleInfo);
}
