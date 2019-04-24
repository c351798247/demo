package com.qf.authcert.service;

import com.qf.pojo.AuthCert;

import java.util.List;

public interface AuthCertService {
    void addAuthCert(AuthCert authCert);

    int updateAuthCert(AuthCert authCert);

    List<AuthCert> getAuthCert(String name);

    AuthCert getAuthCertByUserId(int userid);
}
