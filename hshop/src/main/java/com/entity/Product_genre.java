package com.entity;

public class Product_genre {
    private Long genreid;

    private String name;

    private String remark;

    public Long getGenreid() {
        return genreid;
    }

    public void setGenreid(Long genreid) {
        this.genreid = genreid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Product_genre{" +
                "genreid=" + genreid +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}