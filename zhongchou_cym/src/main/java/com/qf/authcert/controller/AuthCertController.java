package com.qf.authcert.controller;

import com.qf.authcert.mapper.AuthCertMapper;
import com.qf.authcert.service.AuthCertService;
import com.qf.pojo.AuthCert;
import com.qf.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class AuthCertController {

    @Autowired
    AuthCertService authCertService;

    @RequestMapping(value = "addAuthCert", method = RequestMethod.POST)
    public Object addAuthCert(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request, HttpSession session) {
        String path = "D:\\IdeaProjects\\zhongchou_cym\\src\\main\\webapp\\photo\\" + System.currentTimeMillis() + file.getOriginalFilename();
        File target = new File(path);
        Object obj = session.getAttribute("user");
        if (obj instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) obj;
            try {
                file.transferTo(target);
                String src = path.substring(path.indexOf("photo"));
                AuthCert authCert = new AuthCert();
                authCert.setCertType(request.getParameter("type"));
                authCert.setRealName(request.getParameter("realname"));
                authCert.setIdCard(request.getParameter("idcard"));
                authCert.setPhone(request.getParameter("phone"));
                authCert.setIdCardPhoto(src);
                authCert.setUserId(userInfo.getUserid());
                authCertService.addAuthCert(authCert);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @RequestMapping(value = "getAuthCert", method = RequestMethod.POST)
    public Object getAuthCert(String name) {
        List<AuthCert> list = authCertService.getAuthCert(name);
        return list;
    }

    @RequestMapping(value = "updateAuthCert", method = RequestMethod.POST)
    public Object updateAuthCert(@RequestBody AuthCert authCert) {
        authCertService.updateAuthCert(authCert);
        return true;
    }

    @RequestMapping(value = "getAuthCertByUserId", method = RequestMethod.POST)
    public Object getAuthCertByUserId(HttpSession session) {
        Object obj = session.getAttribute("user");
        if (obj instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) obj;
            AuthCert authCert = authCertService.getAuthCertByUserId(userInfo.getUserid());
            if (authCert != null) {
                return authCert;
            }
        }
        return false;
    }
}
