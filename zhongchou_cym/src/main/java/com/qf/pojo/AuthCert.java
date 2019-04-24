package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("authCert")
public class AuthCert {
    private int certId;
    private int userId;
    private String certType;
    private String realName;
    private String idCard;
    private String idCardPhoto;
    private String phone;
    private String state;

    @Override
    public String toString() {
        return "AuthCert{" +
                "certId=" + certId +
                ", userId=" + userId +
                ", certType='" + certType + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", idCardPhoto='" + idCardPhoto + '\'' +
                ", phone='" + phone + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCertId() {
        return certId;
    }

    public void setCertId(int certId) {
        this.certId = certId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(String idCartPhoto) {
        this.idCardPhoto = idCartPhoto;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
