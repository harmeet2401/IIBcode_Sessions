package com.practice.beans;
public class Person {
    public String name;
    public String hieght;
    public String weigth;
    public String Id;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int hours;
   public void gym(){
        System.out.println(name+" does the gym "+hours+" hours a day");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHieght() {
        return hieght;
    }

    public void setHieght(String hieght) {
        this.hieght = hieght;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
