package com.in28minutes.rest.webservices.restfullservice.bean;

import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
public class Post {

    @jakarta.persistence.Id
    @GeneratedValue
    private int Id;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;


    /**
     * This getter should not be there it in an association with the post
     * @param user
     */
   /* public User getUser() {
        return user;
    }*/

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
