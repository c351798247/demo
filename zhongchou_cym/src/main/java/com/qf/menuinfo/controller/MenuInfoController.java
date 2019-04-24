package com.qf.menuinfo.controller;

import com.qf.menuinfo.service.MenuService;
import com.qf.pojo.MenuInfo;
import com.qf.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MenuInfoController {

    @Autowired
    MenuService menuService;

    @RequestMapping("getAllMenu")
    public Object getAllMenu() {

        return menuService.getAllMenu();
    }

    @RequestMapping("getAllMenuDto")
    public Object getAllMenuDto() {
        return menuService.getAllMenuDto();
    }

    @RequestMapping("getMenuDtoById")
    public Object getMenuDtoById(int roleid) {

        return menuService.getMenuDtoById(roleid);
    }

    @RequestMapping("grantMenu")
    public Object grantMenu(@RequestParam int roleid, @RequestBody List<Integer> menuArr) {
//        System.out.println(roleid);
//        System.out.println(menuArr);
        menuService.updateRoleMenu(roleid, menuArr);
        return true;
    }

    @RequestMapping("addMenu")
    public Object addMenu(@RequestBody MenuInfo menuInfo) {
        menuService.addMenu(menuInfo);
        return false;
    }

    @RequestMapping("deleteMenu")
    public Object deleteMenu(int menuid) {
        menuService.removeMenuById(menuid);
        return false;
    }

    @RequestMapping("updateMenu")
    public Object updateMenu(@RequestBody MenuInfo menuInfo) {
        menuService.updateMenu(menuInfo);

        return false;
    }


    @RequestMapping("getMenuByUser")
    public Object getMenuByUser(HttpSession session) {
        Object obj = session.getAttribute("user");
        if (obj instanceof UserInfo) {
            UserInfo user = (UserInfo) obj;
            List<MenuInfo> menus = menuService.getMenuByUser(user.getUserid());
            if (menus != null && menus.size() > 0) {
                return menus;
            }
        }
        return false;
    }
}
