package com.entity;

public class Orderstate {
    private Long stateid;

    private String remark;

    private String statetype;

    public Long getStateid() {
        return stateid;
    }

    public void setStateid(Long stateid) {
        this.stateid = stateid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatetype() {
        return statetype;
    }

    public void setStatetype(String statetype) {
        this.statetype = statetype == null ? null : statetype.trim();
    }

    @Override
    public String toString() {
        return "Orderstate{" +
                "stateid=" + stateid +
                ", remark='" + remark + '\'' +
                ", statetype='" + statetype + '\'' +
                '}';
    }
}