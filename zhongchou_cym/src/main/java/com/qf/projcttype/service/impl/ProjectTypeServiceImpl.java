package com.qf.projcttype.service.impl;

import com.qf.pojo.ProjectType;
import com.qf.projcttype.mapper.ProjectTypeMapper;
import com.qf.projcttype.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectTypeServiceImpl implements ProjectTypeService {
    @Autowired
    ProjectTypeMapper projectTypeMapper;

    @Override
    public void addProjectType(ProjectType type) {
        projectTypeMapper.insertProjectType(type);
    }

    @Override
    public List<ProjectType> getProjectType(String search) {
        List<ProjectType> list = projectTypeMapper.queryProjectType(search);
        return list;
    }

    @Transactional
    @Override
    public int updateProjectType(ProjectType type) {
        int i = projectTypeMapper.updateProjectType(type);
        if (i > 1) {
            throw new RuntimeException();
        }
        return i;
    }
}
