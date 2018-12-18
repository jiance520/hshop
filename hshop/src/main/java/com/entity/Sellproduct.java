package com.entity;

public class Sellproduct {
    private Long spid;

    private Long num;

    private Long productid;

    private Long orderid;

    public Long getSpid() {
        return spid;
    }

    public void setSpid(Long spid) {
        this.spid = spid;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "Sellproduct{" +
                "spid=" + spid +
                ", num=" + num +
                ", productid=" + productid +
                ", orderid=" + orderid +
                '}';
    }
}