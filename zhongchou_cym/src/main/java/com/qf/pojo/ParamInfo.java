package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("paraminfo")
public class ParamInfo {
    private int paramid;
    private String paramname;
    private String paramcode;
    private int paramvalue;

    @Override
    public String toString() {
        return "ParamInfo{" +
                "paramid=" + paramid +
                ", paramname='" + paramname + '\'' +
                ", paramcode='" + paramcode + '\'' +
                ", paramvalue=" + paramvalue +
                '}';
    }

    public int getParamid() {
        return paramid;
    }

    public void setParamid(int paramid) {
        this.paramid = paramid;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname;
    }

    public String getParamcode() {
        return paramcode;
    }

    public void setParamcode(String paramcode) {
        this.paramcode = paramcode;
    }

    public int getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(int paramvalue) {
        this.paramvalue = paramvalue;
    }
}
