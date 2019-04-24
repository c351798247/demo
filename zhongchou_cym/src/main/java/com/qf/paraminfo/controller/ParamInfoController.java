package com.qf.paraminfo.controller;

import com.qf.paraminfo.service.ParamInfoService;
import com.qf.pojo.ParamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParamInfoController {
    @Autowired
    ParamInfoService paramInfoService;

    @RequestMapping(value = "addParam", method = RequestMethod.POST)
    public Object addParam(@RequestBody ParamInfo paramInfo) {
        System.out.println(paramInfo);

//        paramInfoService.addParamInfo(paramInfo);
        return true;
    }

    @RequestMapping(value = "getParam", method = RequestMethod.POST)
    public Object getParam(String name) {
        List<ParamInfo> list = paramInfoService.getParamInfo(name);
        return list;
    }

    @RequestMapping(value = "updateParam", method = RequestMethod.POST)
    public Object updateParam(@RequestBody ParamInfo paramInfo) {
//        System.out.println(paramInfo);
        paramInfoService.updateParamInfo(paramInfo);
        return true;
    }
}
