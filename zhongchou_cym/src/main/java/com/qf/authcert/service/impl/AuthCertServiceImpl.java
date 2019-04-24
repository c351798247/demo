package com.qf.authcert.service.impl;

import com.qf.authcert.mapper.AuthCertMapper;
import com.qf.authcert.service.AuthCertService;
import com.qf.pojo.AuthCert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthCertServiceImpl implements AuthCertService {

    @Autowired
    AuthCertMapper authCertMapper;

    @Override
    public void addAuthCert(AuthCert authCert) {
        authCertMapper.insertAuthCert(authCert);

    }

    @Transactional
    @Override
    public int updateAuthCert(AuthCert authCert) {
        int num = authCertMapper.updateAuthCert(authCert);
        if (num > 1) {
            throw new RuntimeException("更新审核状态过多");
        }
        return 0;
    }

    @Override
    public List<AuthCert> getAuthCert(String name) {
        List<AuthCert> list = authCertMapper.queryAuthCert(name);

        return list;
    }

    @Override
    public AuthCert getAuthCertByUserId(int userid) {
        return authCertMapper.queryAuthCertByUserId(userid);
    }
}
