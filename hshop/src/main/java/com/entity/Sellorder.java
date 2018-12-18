package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Sellorder {
    private Long soid;

    private Date logdate;

    private String ordernum;

    private Long paystate;

    private String paytype;

    private BigDecimal sum;

    private Long expressid;

    private Long orderstateid;

    private Long vipid;

    private String postaddr;

    private String postname;

    private String postphone;

    private String remark;

    private Long state;

    public Long getSoid() {
        return soid;
    }

    public void setSoid(Long soid) {
        this.soid = soid;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Long getPaystate() {
        return paystate;
    }

    public void setPaystate(Long paystate) {
        this.paystate = paystate;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Long getExpressid() {
        return expressid;
    }

    public void setExpressid(Long expressid) {
        this.expressid = expressid;
    }

    public Long getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(Long orderstateid) {
        this.orderstateid = orderstateid;
    }

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    public String getPostaddr() {
        return postaddr;
    }

    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr == null ? null : postaddr.trim();
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname == null ? null : postname.trim();
    }

    public String getPostphone() {
        return postphone;
    }

    public void setPostphone(String postphone) {
        this.postphone = postphone == null ? null : postphone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Sellorder{" +
                "soid=" + soid +
                ", logdate=" + logdate +
                ", ordernum='" + ordernum + '\'' +
                ", paystate=" + paystate +
                ", paytype='" + paytype + '\'' +
                ", sum=" + sum +
                ", expressid=" + expressid +
                ", orderstateid=" + orderstateid +
                ", vipid=" + vipid +
                ", postaddr='" + postaddr + '\'' +
                ", postname='" + postname + '\'' +
                ", postphone='" + postphone + '\'' +
                ", remark='" + remark + '\'' +
                ", state=" + state +
                '}';
    }
}