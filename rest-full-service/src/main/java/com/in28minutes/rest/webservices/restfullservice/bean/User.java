package com.in28minutes.rest.webservices.restfullservice.bean;

import java.time.LocalDate;

/**
 * User bean to be used for he object mapping
 * below attributes are abstracted as private and can be accessed using the getter and setter
 */
public class User {
    private int id;
    private String name;
    private LocalDate birthdate;


    public User(int id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
