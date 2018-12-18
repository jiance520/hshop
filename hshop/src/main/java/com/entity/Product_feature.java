package com.entity;

public class Product_feature {
    private Long featureid;

    private Object name;

    private String parameter;

    private String remark;

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Product_feature{" +
                "featureid=" + featureid +
                ", name=" + name +
                ", parameter='" + parameter + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}