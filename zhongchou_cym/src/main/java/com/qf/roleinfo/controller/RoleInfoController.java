package com.qf.roleinfo.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey;
import com.qf.pojo.RoleInfo;
import com.qf.roleinfo.service.RoleService;
import com.qf.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleService roleService;

    @RequestMapping("getAllRole")
    public Object getAllRole() {
        List<RoleInfo> roles = roleService.getAllRole();
        System.out.println(roles);
        return roles;
    }

    @RequestMapping("addRole")
    public Object addRole(String rolename) {
        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRolename(rolename);
        roleService.addRole(roleInfo);
        return true;
    }

    @RequestMapping("deleteRole")
    public Object deleteRole(int roleid) {

        roleService.removeRoleById(roleid);

        return false;
    }

    @RequestMapping("updateRole")
    public Object updateRole(@RequestBody RoleInfo roleInfo) {
        roleService.updateRoleById(roleInfo);
        return false;
    }


}
