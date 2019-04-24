package com.qf.projcttype.mapper;

import com.qf.pojo.ProjectType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ProjectTypeMapper {
    void insertProjectType(ProjectType projectType);

    List<ProjectType> queryProjectType(@Param("ptname") String ptname);

    int updateProjectType(ProjectType projectType);
}
