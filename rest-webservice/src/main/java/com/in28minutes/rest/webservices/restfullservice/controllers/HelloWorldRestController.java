package com.in28minutes.rest.webservices.restfullservice.controllers;

import com.in28minutes.rest.webservices.restfullservice.bean.HelloworldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
public class HelloWorldRestController {
    public Supplier<HelloworldBean> supplier = ()->{
        return new HelloworldBean("He message from  bean devtools");
    };


    //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String HelloWorld(){
        return "Hello-world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloworldBean HelloWorldBean(){
        return supplier.get();
    }



}
