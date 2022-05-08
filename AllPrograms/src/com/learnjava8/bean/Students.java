package com.learnjava8.bean;

import java.util.List;
public class Students {
    private String name;
    private String mobno;
    private String address;
    private int marks;
    private List<String> activities;
    private int notebooks;
    public Students(String name, String mobno, String address, int marks, List<String> activities, int notebooks) {
        this.name = name;
        this.mobno = mobno;
        this.address = address;
        this.marks = marks;
        this.activities = activities;
        this.notebooks = notebooks;
    }




    public Students(String name, String mobno, String address, int marks, List<String> activities) {
        this.name = name;
        this.mobno = mobno;
        this.address = address;
        this.marks = marks;
        this.activities = activities;
    }

    public Students() {

    }

    public Students(String s) {
        this.name=s;
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

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
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
