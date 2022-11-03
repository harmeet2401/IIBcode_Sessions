package com.restapi.hibernate.restapihibernate.springjdbc;

import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JDBCSpringService jdbcSpringService;
    @Override
    public void run(String... args) throws Exception {
        jdbcSpringService.insert(new User_details(1,"CommandLineRunner","CommandLineRunner Class"));
        jdbcSpringService.delete(3);
    }
}