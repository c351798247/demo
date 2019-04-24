package com.qf.paraminfo.mapper;

import com.qf.pojo.ParamInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParamInfoMapper {
    List<ParamInfo> queryParamInfo(@Param("name") String name);

    void insertParamInfo(ParamInfo paramInfo);

    int updateParamInfo(ParamInfo paramInfo);
}
