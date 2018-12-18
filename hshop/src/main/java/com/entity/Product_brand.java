package com.entity;

public class Product_brand {
    private Long brandid;

    private String img;

    private String infomation;

    private Long logorder;

    private String name;

    private String url;

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
    }

    public Long getLogorder() {
        return logorder;
    }

    public void setLogorder(Long logorder) {
        this.logorder = logorder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        return "Product_brand{" +
                "brandid=" + brandid +
                ", img='" + img + '\'' +
                ", infomation='" + infomation + '\'' +
                ", logorder=" + logorder +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}