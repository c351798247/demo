package com.qf.userinfo.service;

import com.qf.pojo.UserInfo;
import com.qf.roleinfo.dto.RoleInfoDto;
import com.qf.userinfo.vo.UserInfoVo;
import com.qf.userinfo.vo.UserRoleVo;

import java.util.List;

public interface UserService {
    public List<UserInfo> getAllUser();

    public void addUser(UserInfo userInfo);

    public void deleteUser(int id);

    public boolean updateUser(UserInfoVo vo, int userid);

    public UserInfo getUserById(int id);

    public List<UserInfo> searchUser(String search);

    public boolean selectUserInfoBy(UserInfo userInfo);

    public List<RoleInfoDto> getMyRole(int userid);

    public void updateUserRole(UserRoleVo vo);

    public List<UserInfo> checkUser(UserInfo userInfo);

    public boolean updateUser(UserInfo userInfo);
}
