package com.qf.pojo;

import com.qf.util.DateTool;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("projectInfo")
public class ProjectInfo {
    private int projectId;
    private String projectType;
    private String projectName;
    private String projectBrief;
    private int totalMoney;
    private int totalDay;
    private String headPhoto;
    private String detailPhoto;
    private String selfBrief;
    private String selfDetail;
    private String selfTel;
    private String serviceTel;
    private Date setupDate;
    private String state;
    private int userId;
    private int currentMoney;

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "projectId=" + projectId +
                ", projectType='" + projectType + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectBrief='" + projectBrief + '\'' +
                ", totalMoney=" + totalMoney +
                ", totalDay=" + totalDay +
                ", headPhoto='" + headPhoto + '\'' +
                ", detailPhoto='" + detailPhoto + '\'' +
                ", selfBrief='" + selfBrief + '\'' +
                ", selfDetail='" + selfDetail + '\'' +
                ", selfTel='" + selfTel + '\'' +
                ", serviceTel='" + serviceTel + '\'' +
                ", setupDate=" + setupDate +
                ", state='" + state + '\'' +
                ", userId=" + userId +
                ", currentMoney=" + currentMoney +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Date getSetupDate() {
        return setupDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectBrief() {
        return projectBrief;
    }

    public void setProjectBrief(String projectBrief) {
        this.projectBrief = projectBrief;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getTotalDay() {
        return totalDay;
    }

    public void setTotalDay(int totalDay) {
        this.totalDay = totalDay;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getDetailPhoto() {
        return detailPhoto;
    }

    public void setDetailPhoto(String detailPhoto) {
        this.detailPhoto = detailPhoto;
    }

    public String getSelfBrief() {
        return selfBrief;
    }

    public void setSelfBrief(String selfBrief) {
        this.selfBrief = selfBrief;
    }

    public String getSelfDetail() {
        return selfDetail;
    }

    public void setSelfDetail(String selfDetail) {
        this.selfDetail = selfDetail;
    }

    public String getSelfTel() {
        return selfTel;
    }

    public void setSelfTel(String selfTel) {
        this.selfTel = selfTel;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }
}
