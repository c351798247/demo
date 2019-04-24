package com.qf.userinfo.mapper;

import com.qf.pojo.UserInfo;
import com.qf.roleinfo.dto.RoleInfoDto;
import com.qf.userinfo.vo.UserRoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    //获取所有用户记录
    List<UserInfo> getAllUser();

    List<UserInfo> getAllUser(@Param("name") String name);

    //根据id查询单个用户记录
    UserInfo getUserById(int id);

    //添加一个用户
    int insertUser(UserInfo user);

    //修改信息
    int updateUser(UserInfo userInfo);

    void deleteUserById(int id);

    List<UserInfo> selectUserInfoBySearch(@Param("search") String search);

    List<UserInfo> selectUserInfoBy(UserInfo userInfo);

    List<RoleInfoDto> getMyRole(@Param("userid") int userid);

    void deleteUserRoleByUserId(@Param("userid") int userid);

    void insertUserRoleTemp(UserRoleVo vo);
}
