package com.qf.paraminfo.service.impl;

import com.qf.paraminfo.mapper.ParamInfoMapper;
import com.qf.paraminfo.service.ParamInfoService;
import com.qf.pojo.ParamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamInfoServiceImpl implements ParamInfoService {
    @Autowired
    ParamInfoMapper paramInfoMapper;

    @Override
    public void addParamInfo(ParamInfo paramInfo) {
        paramInfoMapper.insertParamInfo(paramInfo);
    }

    @Override
    public List<ParamInfo> getParamInfo(String name) {
        List<ParamInfo> list = paramInfoMapper.queryParamInfo(name);
        return list;
    }

    @Override
    public int updateParamInfo(ParamInfo paramInfo) {
        int num = paramInfoMapper.updateParamInfo(paramInfo);
        if (num > 1) {
            throw new RuntimeException("更新参数记录过多");
        }
        return num;
    }
}
