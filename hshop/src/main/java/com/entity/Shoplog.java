package com.entity;

import java.util.Date;

public class Shoplog {
    private Long logid;

    private String logcontent;

    private Date logtime;

    private Long userid;

    public Long getLogid() {
        return logid;
    }

    public void setLogid(Long logid) {
        this.logid = logid;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Shoplog{" +
                "logid=" + logid +
                ", logcontent='" + logcontent + '\'' +
                ", logtime=" + logtime +
                ", userid=" + userid +
                '}';
    }
}