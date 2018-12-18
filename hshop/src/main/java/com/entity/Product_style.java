package com.entity;

public class Product_style {
    private Long styleid;

    private Object color;

    private String remark;

    public Long getStyleid() {
        return styleid;
    }

    public void setStyleid(Long styleid) {
        this.styleid = styleid;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Product_style{" +
                "styleid=" + styleid +
                ", color=" + color +
                ", remark='" + remark + '\'' +
                '}';
    }
}