package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("projectType")
public class ProjectType {
    private int ptid;
    private String ptname;
    private String introduction;

    @Override
    public String toString() {
        return "ProjectType{" +
                "ptid=" + ptid +
                ", ptname='" + ptname + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public int getPtid() {
        return ptid;
    }

    public void setPtid(int ptid) {
        this.ptid = ptid;
    }

    public String getPtname() {
        return ptname;
    }

    public void setPtname(String ptname) {
        this.ptname = ptname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
