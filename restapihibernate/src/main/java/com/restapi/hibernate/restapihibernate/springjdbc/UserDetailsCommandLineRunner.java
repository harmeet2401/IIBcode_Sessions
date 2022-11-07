package com.restapi.hibernate.restapihibernate.springjdbc;

import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * THIS CLASS IS ONLY TO BE USD FOR TESTING PURPOSE . THIS CLASS
 * DOESN'T SERVER ANY PURPOSE OF SETTING UP JDBCTEMPLATE
 */

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JDBCSpringService jdbcSpringService;
    @Override
    public void run(String... args) throws Exception {
        /*jdbcSpringService.insert(new User_details(1,"CommandLineRunner","CommandLineRunner Class"));
        jdbcSpringService.insert(new User_details(2,"Bruno","Toronto"));
        jdbcSpringService.insert(new User_details(3,"Spinner","USA"));
        jdbcSpringService.insert(new User_details(4,"Robert","California"));
        jdbcSpringService.insert(new User_details(5,"Charles","Texas"));
        jdbcSpringService.delete(3);*/
    }
}
