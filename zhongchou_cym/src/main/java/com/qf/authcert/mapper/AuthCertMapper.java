package com.qf.authcert.mapper;

import com.qf.pojo.AuthCert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthCertMapper {
    void insertAuthCert(AuthCert authCert);

    int updateAuthCert(AuthCert authCert);

    List<AuthCert> queryAuthCert(@Param("name") String name);

    AuthCert queryAuthCertByUserId(@Param("userid") int userid);
}
