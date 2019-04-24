package com.qf.qualification.service;

import com.qf.pojo.Qualification;

import java.util.List;

public interface QualificationService {
    void addQualification(Qualification qualification);

    List<Qualification> getQualification(String search);

    int updateQualification(Qualification qualification);
}
