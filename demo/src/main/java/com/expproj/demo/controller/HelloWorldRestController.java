package com.expproj.demo.controller;

import com.expproj.demo.bean.Greetings;
import com.expproj.demo.bean.userBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/rest")
    public Greetings greet(@RequestParam(required = false,defaultValue = "World") String name){

        return new Greetings(String.format("Hello %s!", name));
    }
    @GetMapping(path = "/user")
    public userBean getUser (){

        return new userBean("Harmeet","Appkajjjk" , "99002999299");

    }
}
