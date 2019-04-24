package com.qf.qualification.controller;

import com.qf.pojo.Qualification;
import com.qf.qualification.service.QualificationService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QualificationController {

    @Autowired
    QualificationService qualificationService;

    @RequestMapping(value = "addQualification", method = RequestMethod.POST)
    public Object addQualification(@RequestBody Qualification qualification) {
        System.out.println(qualification);

        qualificationService.addQualification(qualification);
        return true;
    }

    @RequestMapping(value = "getQualification", method = RequestMethod.POST)
    public Object getQualification(String search) {
        System.out.println(search);
        List<Qualification> list = qualificationService.getQualification(search);
        return list;
    }

    @RequestMapping(value = "updateQualification", method = RequestMethod.POST)
    public Object updateQualification(@RequestBody Qualification qualification) {
        System.out.println(qualification);
        qualificationService.updateQualification(qualification);
        return true;
    }
}
