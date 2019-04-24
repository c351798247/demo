package com.qf.projectinfo.service;

import com.qf.pojo.ProjectInfo;
import com.qf.pojo.RepayInfo;

import java.util.List;

public interface ProjectInfoService {
    void addProjectInfo(ProjectInfo projectInfo, List<RepayInfo> repayInfoList);

    int updateProjectInfo(ProjectInfo projectInfo);

    List<ProjectInfo> getProjectInfo(ProjectInfo projectInfo);
}
