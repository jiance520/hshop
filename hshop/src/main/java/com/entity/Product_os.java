package com.entity;

public class Product_os {
    private Long osid;

    private Object name;

    private String remark;

    public Long getOsid() {
        return osid;
    }

    public void setOsid(Long osid) {
        this.osid = osid;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Product_os{" +
                "osid=" + osid +
                ", name=" + name +
                ", remark='" + remark + '\'' +
                '}';
    }
}