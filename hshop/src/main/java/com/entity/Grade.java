package com.entity;

public class Grade {
    private Long gid;

    private Long discount;

    private String gradetype;

    private Long point;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getGradetype() {
        return gradetype;
    }

    public void setGradetype(String gradetype) {
        this.gradetype = gradetype == null ? null : gradetype.trim();
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gid=" + gid +
                ", discount=" + discount +
                ", gradetype='" + gradetype + '\'' +
                ", point=" + point +
                '}';
    }
}