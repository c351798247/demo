package com.qf.paraminfo.service;

import com.qf.pojo.ParamInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParamInfoService {
    void addParamInfo(ParamInfo paramInfo);

    List<ParamInfo> getParamInfo(@Param("name") String name);

    int updateParamInfo(ParamInfo paramInfo);
}
