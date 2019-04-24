package com.qf.userinfo.controller;

import com.qf.pojo.UserInfo;
import com.qf.userinfo.service.UserService;

import com.qf.userinfo.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class RestUserController {
    @Autowired
    UserService userService;

    @RequestMapping("testRest/{id}")
    public String testRest(@PathVariable("id") int id) {
        UserInfo userInfo = userService.getUserById(id);
        System.out.println(userInfo);
        return userInfo.toString();
    }

    @RequestMapping("testCookie")
    public String testCookie(@CookieValue(value = "name", required = false) String name, @CookieValue(value = "age", required = false) Integer age) {
        System.out.println(name + "=" + age);
        return name + "=" + age;
    }

    @RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        System.out.println("fileName：" + file.getOriginalFilename());
        String path = "D:/" + new Date().getTime() + file.getOriginalFilename();
        File newFile = new File(path);
        file.transferTo(newFile);
        return "upload success";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> downloadFile() throws IOException {
        File file = new File("D://6.jpg");
        byte[] bytes = null;
        InputStream is = new FileInputStream(file);
        bytes = new byte[is.available()];
        is.read(bytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus status = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bytes, headers, status);

        return entity;
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@Valid @RequestBody UserInfoVo user, BindingResult result, ModelMap map) {
        System.out.println(user);
        if (result.hasErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            for (FieldError error : errorList) {
                System.out.println(error.getField() + "*" + error.getDefaultMessage());
                map.put("ERR_" + error.getField(), error.getDefaultMessage());
            }
            return "register_error";
        }
        return "success";
    }

    @RequestMapping("testArray")
    public Object testArray(int userid, @RequestParam(value = "array[]") Integer[] array) {
        System.out.println(userid);
        for (Integer i :
                array) {
            System.out.println(i);
        }
        return true;
    }

}
