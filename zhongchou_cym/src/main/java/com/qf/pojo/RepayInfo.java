package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("repayInfo")
public class RepayInfo {
    private int repayId;
    private String repayType;
    private int supportMoney;
    private String repayContent;
    private String showPhoto;
    private int repayNum;
    private int limitedBuy;
    private int carriage;
    private String invoice;
    private int repayDay;
    private int projectId;

    @Override
    public String toString() {
        return "RepayInfo{" +
                "repayId=" + repayId +
                ", repayType='" + repayType + '\'' +
                ", supportMoney=" + supportMoney +
                ", repayContent='" + repayContent + '\'' +
                ", showPhoto='" + showPhoto + '\'' +
                ", repayNum=" + repayNum +
                ", limitedBuy=" + limitedBuy +
                ", carriage=" + carriage +
                ", invoice='" + invoice + '\'' +
                ", repayDay=" + repayDay +
                ", projectId=" + projectId +
                '}';
    }

    public int getRepayId() {
        return repayId;
    }

    public void setRepayId(int repayId) {
        this.repayId = repayId;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public int getSupportMoney() {
        return supportMoney;
    }

    public void setSupportMoney(int supportMoney) {
        this.supportMoney = supportMoney;
    }

    public String getRepayContent() {
        return repayContent;
    }

    public void setRepayContent(String repayContent) {
        this.repayContent = repayContent;
    }

    public String getShowPhoto() {
        return showPhoto;
    }

    public void setShowPhoto(String showPhoto) {
        this.showPhoto = showPhoto;
    }

    public int getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(int repayNum) {
        this.repayNum = repayNum;
    }

    public int getLimitedBuy() {
        return limitedBuy;
    }

    public void setLimitedBuy(int limitedBuy) {
        this.limitedBuy = limitedBuy;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public int getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(int repayDay) {
        this.repayDay = repayDay;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
