package com.qf.userinfo.service.impl;

import com.qf.pojo.UserInfo;
import com.qf.roleinfo.dto.RoleInfoDto;
import com.qf.userinfo.mapper.UserInfoMapper;
import com.qf.userinfo.service.UserService;
import com.qf.userinfo.vo.UserInfoVo;
import com.qf.userinfo.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;


    @Transactional
    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertUser(userInfo);
        if ("laoli".equals(userInfo.getUname()))
            throw new RuntimeException("用户名为 laoli 事务回滚");

    }

    @Override
    public List<UserInfo> searchUser(String search) {
        return userInfoMapper.selectUserInfoBySearch(search);
    }

    @Override
    public UserInfo getUserById(int id) {
        return userInfoMapper.getUserById(id);
    }

    @Transactional
    @Override
    public boolean updateUser(UserInfoVo vo, int userid) {
        if (userid != 0 && vo != null) {
            UserInfo user = new UserInfo();
            user.setUserid(userid);
            user.setRealname(vo.getRealname());
            user.setEmail(vo.getEmail());
            int num = userInfoMapper.updateUser(user);
            if (num > 1) {
                throw new RuntimeException();

            }
            return true;
        }
        return false;
    }

    public List<UserInfo> getAllUser() {
        List<UserInfo> users = userInfoMapper.getAllUser();
        return users;
    }

    @Override
    public void deleteUser(int id) {
        userInfoMapper.deleteUserById(id);
    }

    @Override
    public boolean selectUserInfoBy(UserInfo userInfo) {
        List<UserInfo> userInfos = userInfoMapper.selectUserInfoBy(userInfo);
        if (userInfos == null || userInfos.size() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<RoleInfoDto> getMyRole(int userid) {

        return userInfoMapper.getMyRole(userid);
    }

    @Override
    public void updateUserRole(UserRoleVo vo) {
        userInfoMapper.deleteUserRoleByUserId(vo.getUserid());
        userInfoMapper.insertUserRoleTemp(vo);
    }

    @Override
    public List<UserInfo> checkUser(UserInfo userInfo) {
        return userInfoMapper.selectUserInfoBy(userInfo);
    }

    @Override
    public boolean updateUser(UserInfo userInfo) {
        int num = userInfoMapper.updateUser(userInfo);

        return num == 1;
    }
}

