package com.qf.projectinfo.mapper;

import com.qf.pojo.ProjectInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectInfoMapper {
    void insertProjectInfo(ProjectInfo projectInfo);

    int updateProjectInfo(ProjectInfo projectInfo);

    List<ProjectInfo> queryProjectInfo(ProjectInfo projectInfo);

    int getLastProjectId();
}
