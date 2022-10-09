package com.in28minutes.rest.webservices.restfullservice.controllers;

import com.in28minutes.rest.webservices.restfullservice.bean.User;
import com.in28minutes.rest.webservices.restfullservice.serviceDAO.UserServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    public UserServiceDAO userServiceDAO;

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return userServiceDAO.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id){
        return userServiceDAO.findOne(id);
    }

    /**
     * Below post mapping is creating an object so we need to send correct http response code of 201
     * which is for object created
     * So return a ResponseEntity object in place of a string return
     * @param user
     * @return
     */
    @PostMapping(path = "/users")
    public ResponseEntity<Object> PostUser(@RequestBody User user ){
        if(userServiceDAO.saveUser(user)!=null){
            //return ResponseEntity.created(null).body("User created with id : - "+user.getId());
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
            return ResponseEntity.created(location).body("!!! User Created !!!");
        }
        return ResponseEntity.internalServerError().build();
    }
}
