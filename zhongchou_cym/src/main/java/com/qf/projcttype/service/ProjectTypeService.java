package com.qf.projcttype.service;

import com.qf.pojo.ProjectType;

import java.util.List;

public interface ProjectTypeService {
    void addProjectType(ProjectType type);

    List<ProjectType> getProjectType(String search);

    int updateProjectType(ProjectType type);
}
