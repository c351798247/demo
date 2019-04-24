package com.qf.projectinfo.service.impl;

import com.qf.pojo.ProjectInfo;
import com.qf.pojo.ProjectType;
import com.qf.pojo.RepayInfo;
import com.qf.projcttype.service.ProjectTypeService;
import com.qf.projectinfo.mapper.ProjectInfoMapper;
import com.qf.projectinfo.service.ProjectInfoService;
import com.qf.repayinfo.mapper.RepayInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Autowired
    ProjectInfoMapper projectInfoMapper;

    @Autowired
    RepayInfoMapper repayInfoMapper;

    @Transactional
    @Override
    public void addProjectInfo(ProjectInfo projectInfo, List<RepayInfo> repayInfoList) {
//        设置发起时间
        projectInfo.setSetupDate(new Date());
//        设置状态
        projectInfo.setState("DISABLE");
//      入库
        projectInfoMapper.insertProjectInfo(projectInfo);
//        获取项目id
        int projectId = projectInfoMapper.getLastProjectId();
        for (RepayInfo repayInfo : repayInfoList) {
//            设置回报对应的项目id
            repayInfo.setProjectId(projectId);
//            入库
            repayInfoMapper.insertRepayInfo(repayInfo);
        }
    }

    @Transactional
    @Override
    public int updateProjectInfo(ProjectInfo projectInfo) {
        int num = projectInfoMapper.updateProjectInfo(projectInfo);
        if (num > 1) {
            throw new RuntimeException("错误");
        }
        return num;
    }

    @Override
    public List<ProjectInfo> getProjectInfo(ProjectInfo projectInfo) {
        List<ProjectInfo> list = projectInfoMapper.queryProjectInfo(projectInfo);
        return list;
    }
}
