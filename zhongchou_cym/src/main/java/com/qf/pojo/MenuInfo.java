package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("menuinfo")
public class MenuInfo {
    int menuId;
    String menuName;
    String url;
    int superId;
    String icon;

    public MenuInfo() {
    }

    public MenuInfo(int menuId, String menuName, String url, int superId, String icon) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.url = url;
        this.superId = superId;
        this.icon = icon;
    }

    public int getSuperId() {
        return superId;
    }

    public void setSuperId(int superId) {
        this.superId = superId;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", superId=" + superId +
                ", icon='" + icon + '\'' +
                '}';
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


}
