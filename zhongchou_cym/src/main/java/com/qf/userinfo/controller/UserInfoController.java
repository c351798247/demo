package com.qf.userinfo.controller;

import com.qf.pojo.UserInfo;
import com.qf.userinfo.service.UserService;
import com.qf.userinfo.vo.UserInfoVo;
import com.qf.userinfo.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserInfoController {

    @Autowired
    UserService userService;


    @RequestMapping("checkUserInfo")
    public Object checkUserInfo(String uname, String upass, HttpSession session) {
        UserInfo userInfo = new UserInfo();
//        System.out.println(uname + ":" + upass);
        userInfo.setUname(uname);
        userInfo.setUpass(upass);
        List<UserInfo> userInfos = userService.checkUser(userInfo);
        if (userService.selectUserInfoBy(userInfo)) {
            UserInfo user = userInfos.get(0);

            String state = user.getState();
            if ("DISABLE".equals(state)) {
                return "该用户已失效，无法登陆，请联系管理员";
            }
            session.setAttribute("user", user);

            return user;
        }
        return "用户名或密码不正确";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Object registerUser(@Valid UserInfoVo userInfoVo, BindingResult result) {
        System.out.println(userInfoVo);
        Map<String, String> map = new HashMap<>();
        if (!result.hasErrors()) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUname(userInfoVo.getUname());
            if (userService.selectUserInfoBy(userInfo)) {
                map.put("uname", "用户名已存在");
            } else {
                userInfo.setUpass(userInfoVo.getUpass());
                userInfo.setRealname(userInfoVo.getRealname());
                userInfo.setEmail(userInfoVo.getEmail());
                userInfo.setState("ENABLE");
                userService.addUser(userInfo);
                return true;
            }
        }
        List<FieldError> errorList = result.getFieldErrors();
        for (FieldError error : errorList) {
            map.put(error.getField(), error.getDefaultMessage());
        }
        return map;
    }

    @RequestMapping("getAllUser")
    public Object getAllUser() {
        return userService.getAllUser();
    }


    @RequestMapping("getUserById")
    public Object getUserById(int userid) {
        return userService.getUserById(userid);
    }

    @RequestMapping("updateUser")
    public Object updateUser(@RequestBody UserInfoVo vo, int userid) {
        return userService.updateUser(vo, userid);

    }

    @RequestMapping("searchUserInfo")
    public Object searchUserInfo(String search) {
        return userService.searchUser(search);
    }

    @RequestMapping("getMyRole")
    public Object getMyRole(int userid) {

        return userService.getMyRole(userid);
    }

    @RequestMapping("grantRole")
    public Object grantRole(@RequestBody UserRoleVo vo) {
//        System.out.println(vo);
        userService.updateUserRole(vo);
        return false;
    }


    @RequestMapping("checkRole")
    public Object checkRole(HttpSession session) {
        Object object = session.getAttribute("user");
        if (object instanceof UserInfo) {
            UserInfo user = (UserInfo) object;

        }
        return false;
    }

    @RequestMapping(value = "changeState", method = RequestMethod.POST)
    public Object changeState(int userid, String state) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid(userid);
        userInfo.setState(state);
        userService.updateUser(userInfo);
        return true;
    }
}
