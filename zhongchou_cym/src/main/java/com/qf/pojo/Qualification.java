package com.qf.pojo;

import org.apache.ibatis.type.Alias;

@Alias("qualification")
public class Qualification {
    private int qid;
    private String qname;

    @Override
    public String toString() {
        return "Qualification{" +
                "qid=" + qid +
                ", qname='" + qname + '\'' +
                '}';
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }
}
