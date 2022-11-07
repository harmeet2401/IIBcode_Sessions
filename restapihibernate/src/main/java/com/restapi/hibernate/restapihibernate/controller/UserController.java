package com.restapi.hibernate.restapihibernate.controller;

import com.restapi.hibernate.restapihibernate.JPASpring.UserDetailsJPAService;
import com.restapi.hibernate.restapihibernate.JPASpring.UserDetailsRepository;
import com.restapi.hibernate.restapihibernate.bean.User_details;
import com.restapi.hibernate.restapihibernate.springjdbc.JDBCSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    public JDBCSpringService jdbcSpringService;

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @PostMapping(path = "/saveuser")
    public String saveUser(@RequestBody User_details user_details){
        jdbcSpringService.insert(user_details);
        return "inserted";
    }

    @DeleteMapping(path = "/removeuser/{id}")
    public String removeUser(@PathVariable long id){
        jdbcSpringService.delete(id);
        return "inserted";
    }
    @GetMapping(path = "/user/{id}")
    public User_details getUser(@PathVariable long id){
        return jdbcSpringService.select(id);
    }


    @PostMapping(path = "/jpa/saveuser")
    public String saveJpaUser(@RequestBody User_details user_details){
        userDetailsRepository.save(user_details);
        return "inserted";
    }

    @DeleteMapping(path = "/jpa/removeuser/{id}")
    public String removeJpaUser(@PathVariable int id){
        userDetailsRepository.deleteById(id);
        return "inserted";
    }
    @GetMapping(path = "/jpa/user/{id}")
    public User_details getJpaUser(@PathVariable int id){
        return userDetailsRepository.findById(id).get();
    }

}
