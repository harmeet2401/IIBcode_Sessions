package com.orielly.jpapersistence.jpamicroservice.entity;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "Test")
public class Customer {

    @GeneratedValue
    @Id
    public int id;

    @Column(name = "FIRST_NAME")
    public String fname;
    @Column(name = "LAST_NAME")
    public String lname;
    @Column(name = "ADDRESS")
    public String address;

    Customer(){

    }
   public Customer(int id, String fname, String lname, String ADDRESS) {

        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        id = id;
    }

    public String getfname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String ADDRESS) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + Integer.toString(id) +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", ADDRESS='" + address + '\'' +
                '}';
    }
}
