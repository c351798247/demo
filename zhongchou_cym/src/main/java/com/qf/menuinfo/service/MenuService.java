package com.qf.menuinfo.service;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.pojo.MenuInfo;

import java.util.List;

public interface MenuService {
    List<MenuInfo> getAllMenu();

    MenuInfo getMenuById(int menuId);

    void addMenu(MenuInfo menuInfo);

    void removeMenuById(int menuId);

    void updateMenu(MenuInfo menuInfo);

    List<MenuInfoDto> getAllMenuDto();

    List<MenuInfoDto> getMenuDtoById(int roleid);

    void updateRoleMenu(int roleid, List<Integer> menuArr);

    List<MenuInfo> getMenuByUser(int userid);
}
