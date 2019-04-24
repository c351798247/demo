package com.qf.projectinfo.controller;

import com.qf.pojo.ProjectInfo;
import com.qf.pojo.RepayInfo;
import com.qf.pojo.UserInfo;
import com.qf.projectinfo.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectInfoController {
    @Autowired
    ProjectInfoService projectInfoService;

    @RequestMapping(value = "saveProjectInfo", method = RequestMethod.POST)
    public Object saveProjectInfo(@RequestParam("headPhotoFile") CommonsMultipartFile headPhotoFile, @RequestParam("detailPhotoFile") CommonsMultipartFile detailPhotoFile, ProjectInfo projectInfo, HttpSession session) {
//        获取用户信息
        Object obj = session.getAttribute("user");
        if (obj instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) obj;
//            清除以前的session信息
            session.removeAttribute("project");
            session.removeAttribute("repayList");
            try {
                //接收图片
                String headPhotoFilePath = "D:\\IdeaProjects\\zhongchou_cym\\src\\main\\webapp\\photo\\" + System.currentTimeMillis() + headPhotoFile.getOriginalFilename();
                headPhotoFile.transferTo(new File(headPhotoFilePath));
                String detailPhotoFilePath = "D:\\IdeaProjects\\zhongchou_cym\\src\\main\\webapp\\photo\\" + System.currentTimeMillis() + detailPhotoFile.getOriginalFilename();
                detailPhotoFile.transferTo(new File(detailPhotoFilePath));

//                补充项目信息
                projectInfo.setHeadPhoto(headPhotoFilePath.substring(headPhotoFilePath.indexOf("photo")));
                projectInfo.setDetailPhoto(detailPhotoFilePath.substring(detailPhotoFilePath.indexOf("photo")));
                projectInfo.setUserId(userInfo.getUserid());
                session.setAttribute("project", projectInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return projectInfo;
    }

    @RequestMapping(value = "submitProjectAndRepay", method = RequestMethod.POST)
    public Object submitProjectAndRepay(HttpSession session) {
        Object projectObj = session.getAttribute("project");
        if (projectObj instanceof ProjectInfo) {
            ProjectInfo projectInfo = (ProjectInfo) projectObj;
            Object repayListObj = session.getAttribute("repayList");
            List<RepayInfo> repayList;
            if (repayListObj instanceof List) {
                repayList = (List<RepayInfo>) repayListObj;
            } else {
                repayList = new ArrayList<>();
            }
            projectInfoService.addProjectInfo(projectInfo, repayList);
        }
        return true;
    }

    @RequestMapping(value = "getAllProject", method = RequestMethod.POST)
    public Object getAllProject() {
        List<ProjectInfo> list = projectInfoService.getProjectInfo(new ProjectInfo());
        return list;
    }

    @RequestMapping(value = "getMyProject", method = RequestMethod.POST)
    public Object geetMyProject(HttpSession session) {
//        session取用户
        Object objUser = session.getAttribute("user");
        List<ProjectInfo> list = new ArrayList();
//        获取该用户拥发起的众筹
        if (objUser instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) objUser;
            ProjectInfo projectInfo = new ProjectInfo();
            projectInfo.setUserId(userInfo.getUserid());
            list = projectInfoService.getProjectInfo(projectInfo);
        }
        return list;
    }

    @RequestMapping(value = "auditPassProject", method = RequestMethod.POST)
    public Object auditPassProject(@RequestBody ProjectInfo projectInfo) {
        projectInfo.setState("ENABLE");
        projectInfoService.updateProjectInfo(projectInfo);
        return projectInfo;
    }


}
