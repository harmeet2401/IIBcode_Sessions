package com.expproj.demo.controller;


import com.expproj.demo.bean.userBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldConroller {

    /**
     * for  @RequestParms the url will look like http://localhost:8080/hello?name=Harmeet
     * If we hit the url like http://localhost:8080/hello , then the default value of world will go in name
     * string variable
     * @param name
     * @param model
     * @return
     */
    //@RequestMapping(path = "/test",method = RequestMethod.GET)
    @GetMapping(path = "/model")
    public String getMessage(@RequestParam(defaultValue = "World",required = false) String name
    , Model model){
            model.addAttribute("user",name);
        return "hello";     // this name is the same for the thymleaf html template we added .
    }

}
