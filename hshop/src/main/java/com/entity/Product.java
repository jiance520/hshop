package com.entity;

import java.util.Date;

public class Product {
    private Long productid;

    private Long alarmnum;

    private Long discount;/*打折扣*/

    private Long isdiscount;

    private String oneimg;

    private Double price;

    private Long productnum;

    private String productname;

    private Object productno;

    private String threeimg;

    private String twoimg;

    private Long brandid;

    private Long cpuunitid;

    private Long dvdromid;

    private Long featureid;

    private Long genreid;

    private Long graphicsid;

    private Long harddiskid;

    private Long productosid;

    private Long romid;

    private Long screenid;

    private Long productstyleid;

    private String productdesc;

    private Long supplierid;

    private Date logdate;

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getAlarmnum() {
        return alarmnum;
    }

    public void setAlarmnum(Long alarmnum) {
        this.alarmnum = alarmnum;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(Long isdiscount) {
        this.isdiscount = isdiscount;
    }

    public String getOneimg() {
        return oneimg;
    }

    public void setOneimg(String oneimg) {
        this.oneimg = oneimg == null ? null : oneimg.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getProductnum() {
        return productnum;
    }

    public void setProductnum(Long productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Object getProductno() {
        return productno;
    }

    public void setProductno(Object productno) {
        this.productno = productno;
    }

    public String getThreeimg() {
        return threeimg;
    }

    public void setThreeimg(String threeimg) {
        this.threeimg = threeimg == null ? null : threeimg.trim();
    }

    public String getTwoimg() {
        return twoimg;
    }

    public void setTwoimg(String twoimg) {
        this.twoimg = twoimg == null ? null : twoimg.trim();
    }

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public Long getCpuunitid() {
        return cpuunitid;
    }

    public void setCpuunitid(Long cpuunitid) {
        this.cpuunitid = cpuunitid;
    }

    public Long getDvdromid() {
        return dvdromid;
    }

    public void setDvdromid(Long dvdromid) {
        this.dvdromid = dvdromid;
    }

    public Long getFeatureid() {
        return featureid;
    }

    public void setFeatureid(Long featureid) {
        this.featureid = featureid;
    }

    public Long getGenreid() {
        return genreid;
    }

    public void setGenreid(Long genreid) {
        this.genreid = genreid;
    }

    public Long getGraphicsid() {
        return graphicsid;
    }

    public void setGraphicsid(Long graphicsid) {
        this.graphicsid = graphicsid;
    }

    public Long getHarddiskid() {
        return harddiskid;
    }

    public void setHarddiskid(Long harddiskid) {
        this.harddiskid = harddiskid;
    }

    public Long getProductosid() {
        return productosid;
    }

    public void setProductosid(Long productosid) {
        this.productosid = productosid;
    }

    public Long getRomid() {
        return romid;
    }

    public void setRomid(Long romid) {
        this.romid = romid;
    }

    public Long getScreenid() {
        return screenid;
    }

    public void setScreenid(Long screenid) {
        this.screenid = screenid;
    }

    public Long getProductstyleid() {
        return productstyleid;
    }

    public void setProductstyleid(Long productstyleid) {
        this.productstyleid = productstyleid;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public Long getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Long supplierid) {
        this.supplierid = supplierid;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", alarmnum=" + alarmnum +
                ", discount=" + discount +
                ", isdiscount=" + isdiscount +
                ", oneimg='" + oneimg + '\'' +
                ", price=" + price +
                ", productnum=" + productnum +
                ", productname='" + productname + '\'' +
                ", productno=" + productno +
                ", threeimg='" + threeimg + '\'' +
                ", twoimg='" + twoimg + '\'' +
                ", brandid=" + brandid +
                ", cpuunitid=" + cpuunitid +
                ", dvdromid=" + dvdromid +
                ", featureid=" + featureid +
                ", genreid=" + genreid +
                ", graphicsid=" + graphicsid +
                ", harddiskid=" + harddiskid +
                ", productosid=" + productosid +
                ", romid=" + romid +
                ", screenid=" + screenid +
                ", productstyleid=" + productstyleid +
                ", productdesc='" + productdesc + '\'' +
                ", supplierid=" + supplierid +
                ", logdate=" + logdate +
                '}';
    }
}