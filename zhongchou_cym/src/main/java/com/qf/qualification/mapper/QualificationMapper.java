package com.qf.qualification.mapper;

import com.qf.pojo.Qualification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QualificationMapper {
    void insertQualification(Qualification qualification);

    List<Qualification> queryQualification(@Param("search") String search);

    int updateQualification(Qualification qualification);
}
