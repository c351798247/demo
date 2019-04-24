package com.qf.menuinfo.service.impl;

import com.qf.menuinfo.dto.MenuInfoDto;
import com.qf.menuinfo.mapper.MenuInfoMapper;
import com.qf.pojo.MenuInfo;
import com.qf.menuinfo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    @Override
    public List<MenuInfo> getAllMenu() {
        return menuInfoMapper.selectAllMenu();
    }

    @Override
    public void addMenu(MenuInfo menuInfo) {
        menuInfoMapper.insertMenu(menuInfo);
    }

    @Override
    public MenuInfo getMenuById(int menuId) {
        return menuInfoMapper.selectMenuById(menuId);
    }

    @Override
    public void removeMenuById(int menuId) {
        menuInfoMapper.deleteMenuById(menuId);
    }

    @Override
    public void updateMenu(MenuInfo menuInfo) {
        menuInfoMapper.updateMenu(menuInfo);
    }

    @Override
    public List<MenuInfoDto> getAllMenuDto() {
        return menuInfoMapper.selectAllMenuDto();
    }

    @Override
    public List<MenuInfoDto> getMenuDtoById(int roleid) {
        return menuInfoMapper.selectMenuDtoById(roleid);
    }

    @Transactional
    @Override
    public void updateRoleMenu(int roleid, List<Integer> menuArr) {
        menuInfoMapper.deleteRoleMenuTempById(roleid);
        menuInfoMapper.insertRoleMenuTemp(roleid, menuArr);
    }

    @Override
    public List<MenuInfo> getMenuByUser(int userid) {
        return menuInfoMapper.getMenuByUser(userid);
    }
}
