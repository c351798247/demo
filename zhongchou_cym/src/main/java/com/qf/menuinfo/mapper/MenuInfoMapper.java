package com.qf.menuinfo.mapper;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.pojo.MenuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuInfoMapper {
    List<MenuInfo> selectAllMenu();

    MenuInfo selectMenuById(int menuId);

    void insertMenu(MenuInfo menuInfo);

    void deleteMenuById(int menuId);

    void updateMenu(MenuInfo menuInfo);

    List<MenuInfoDto> selectAllMenuDto();

    List<MenuInfoDto> selectMenuDtoById(int roleid);

    void deleteRoleMenuTempById(int roleid);

    void insertRoleMenuTemp(@Param("roleid") int roleid, @Param("menuArr") List<Integer> menuArr);

    List<MenuInfo> getMenuByUser(@Param("userid") int userid);
}
