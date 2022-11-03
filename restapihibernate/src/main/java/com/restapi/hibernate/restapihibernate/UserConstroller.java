package com.restapi.hibernate.restapihibernate;

import com.restapi.hibernate.restapihibernate.bean.User_details;
import com.restapi.hibernate.restapihibernate.springjdbc.JDBCSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserConstroller {
    @Autowired
    public JDBCSpringService jdbcSpringService;


    @PostMapping(path = "/saveuser")
    public String saveUser(@RequestBody User_details user_details){
        jdbcSpringService.insert(user_details);
        return "inserted";
    }

    @DeleteMapping(path = "/removeuser/{id}")
    public String saveUser(@PathVariable int id){
        jdbcSpringService.delete(id);
        return "inserted";
    }
    @GetMapping(path = "/allusers")
    public List<User_details> saveUser(){

        return null;
    }

}
