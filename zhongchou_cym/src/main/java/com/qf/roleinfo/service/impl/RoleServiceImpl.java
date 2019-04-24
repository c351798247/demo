package com.qf.roleinfo.service.impl;

import com.qf.roleinfo.mapper.RoleInfoMapper;
import com.qf.pojo.RoleInfo;
import com.qf.roleinfo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Override
    public List<RoleInfo> getAllRole() {
        return roleInfoMapper.selectAllRole();
    }

    @Override
    public void addRole(RoleInfo roleInfo) {
        roleInfoMapper.insertRole(roleInfo);
    }

    @Override
    public RoleInfo getRoleById(int roleid) {
        return roleInfoMapper.selectRoleById(roleid);
    }

    @Override
    public void removeRoleById(int roleid) {
        roleInfoMapper.deleteRoleById(roleid);
    }

    @Override
    public void updateRoleById(RoleInfo roleInfo) {
        roleInfoMapper.updateRoleById(roleInfo);
    }
}
