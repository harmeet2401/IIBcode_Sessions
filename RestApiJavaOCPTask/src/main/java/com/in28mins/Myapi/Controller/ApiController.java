package com.in28mins.Myapi.Controller;

import com.in28mins.Myapi.ApiBeans.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(path = "/hey")
    public String getWelcomeMsg(){
        return "!!!! welcome to openshift rest api !!!!";
    }

    @GetMapping(path = "/User")
    public User getUser()
    {
            User user = new User();
            user.setAdd("Plotno 63 wz 31 b3/8 ff navyug block");
            user.setName("HARMEET SINGH");
            return user;
    }
}
