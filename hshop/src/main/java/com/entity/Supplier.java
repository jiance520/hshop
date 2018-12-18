package com.entity;

import java.util.Date;

public class Supplier {
    private Long ssid;

    private String address;

    private Date logdate;

    private String name;

    private String phone;

    public Long getSsid() {
        return ssid;
    }

    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "ssid=" + ssid +
                ", address='" + address + '\'' +
                ", logdate=" + logdate +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}