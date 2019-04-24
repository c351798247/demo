package com.qf.qualification.service.impl;

import com.qf.pojo.Qualification;
import com.qf.qualification.mapper.QualificationMapper;
import com.qf.qualification.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    QualificationMapper qualificationMapper;

    @Override
    public void addQualification(Qualification qualification) {
        qualificationMapper.insertQualification(qualification);

    }

    @Override
    public List<Qualification> getQualification(String search) {
        List<Qualification> list = qualificationMapper.queryQualification(search);

        return list;
    }

    @Transactional
    @Override
    public int updateQualification(Qualification qualification) {
        int n = qualificationMapper.updateQualification(qualification);
        if (n > 1) {
            throw new RuntimeException("更新资质错误，更新项目过多");
        }
        return n;
    }
}
