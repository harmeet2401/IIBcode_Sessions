package com.expproj.demo.bean;

public class userBean {

    private String name ;
    private String Address ;
    private String mobile ;

    public userBean(String name, String address, String mobile) {
        this.name = name;
        Address = address;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "userBean{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
