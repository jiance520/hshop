package com.entity;

import java.util.Date;

public class Shopcart {
    private Long id;

    private Date logdate;

    private Long productnum;

    private Long productid;

    private Long vipid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public Long getProductnum() {
        return productnum;
    }

    public void setProductnum(Long productnum) {
        this.productnum = productnum;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    @Override
    public String toString() {
        return "Shopcart{" +
                "id=" + id +
                ", logdate=" + logdate +
                ", productnum=" + productnum +
                ", productid=" + productid +
                ", vipid=" + vipid +
                '}';
    }
}