package com.qf.roleinfo.mapper;

import com.qf.pojo.RoleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleInfoMapper {
    List<RoleInfo> selectAllRole();

    void insertRole(RoleInfo roleInfo);

    RoleInfo selectRoleById(int roleid);

    void deleteRoleById(int roleid);

    void updateRoleById(RoleInfo roleInfo);


}
