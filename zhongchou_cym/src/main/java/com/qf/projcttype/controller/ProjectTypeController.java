package com.qf.projcttype.controller;

import com.qf.pojo.ProjectType;
import com.qf.projcttype.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectTypeController {

    @Autowired
    ProjectTypeService projectTypeService;

    @RequestMapping(value = "getAllProjectType", method = RequestMethod.POST)
    public Object getAllProjectType(String search) {
//        System.out.println(search);
        List<ProjectType> list = projectTypeService.getProjectType(search);
        return list;
    }

    @RequestMapping(value = "addProjectType", method = RequestMethod.POST)
    public Object addProjectType(@RequestBody ProjectType projectType) {
//        System.out.println(projectType);
        projectTypeService.addProjectType(projectType);
        return true;
    }

    @RequestMapping(value = "updateProjectType", method = RequestMethod.POST)
    public Object updateProjectType(@RequestBody ProjectType projectType) {
        projectTypeService.updateProjectType(projectType);
        return true;
    }

}
