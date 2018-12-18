package com.entity;

import java.util.Date;

public class Service {
    private Long serviceid;

    private String content;

    private Date logdate;

    private Date managedate;

    private String manageremark;

    private Long managestatus;

    private String ordernum;

    private String remark;

    private String title;

    private Long vipid;

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public Date getManagedate() {
        return managedate;
    }

    public void setManagedate(Date managedate) {
        this.managedate = managedate;
    }

    public String getManageremark() {
        return manageremark;
    }

    public void setManageremark(String manageremark) {
        this.manageremark = manageremark == null ? null : manageremark.trim();
    }

    public Long getManagestatus() {
        return managestatus;
    }

    public void setManagestatus(Long managestatus) {
        this.managestatus = managestatus;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceid=" + serviceid +
                ", content='" + content + '\'' +
                ", logdate=" + logdate +
                ", managedate=" + managedate +
                ", manageremark='" + manageremark + '\'' +
                ", managestatus=" + managestatus +
                ", ordernum='" + ordernum + '\'' +
                ", remark='" + remark + '\'' +
                ", title='" + title + '\'' +
                ", vipid=" + vipid +
                '}';
    }
}