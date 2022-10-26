package com.in28minutes.rest.webservices.restfullservice.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDate;
import java.util.List;

/**
 * User bean to be used for the object mapping
 * below attributes are abstracted as private and can be accessed using the getter and setter
 */
@Entity(name = "user_details")
public class User
{
    protected User(){

    }
    @Id
    @GeneratedValue
    private int id;
    @Size(min = 2,message = "Name should have min 2 characters")
    private String name;
    @Past(message = "DOB should be in the past")
    private LocalDate birthdate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> post;
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
    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
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
