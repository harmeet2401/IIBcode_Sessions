package com.functionalinterfaces.bean;

import java.util.List;
public class Students {
    public String name;
    public String mobno;
    public String address;
    public int marks;
    public List<String> activities;

    public Students(String name, String mobno, String address, int marks, List<String> activities) {
        this.name = name;
        this.mobno = mobno;
        this.address = address;
        this.marks = marks;
        this.activities = activities;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", mobno='" + mobno + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                ", activities=" + activities +
                '}';
    }
}
