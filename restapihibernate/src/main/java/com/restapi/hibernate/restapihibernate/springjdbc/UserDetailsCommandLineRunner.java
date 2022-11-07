package com.restapi.hibernate.restapihibernate.springjdbc;

import com.restapi.hibernate.restapihibernate.JPASpring.UserDetailsRepository;
import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * THIS CLASS IS ONLY TO BE USD FOR TESTING PURPOSE . THIS CLASS
 * DOESN'T SERVER ANY PURPOSE OF SETTING UP JDBCTEMPLATE
 */

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    @Autowired
    private JDBCSpringService jdbcSpringService;
    public Consumer<User_details> consumer = (ud)->{
      ud.getName();
    };
    public Predicate<User_details> predicate = (u)->u.getName().equalsIgnoreCase("harmeet")|| u.getName().length()>=4;

    public Function<String,String> function =(name)->{
        return name.substring(0,3);
    };
    //
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    @Override
    public void run(String... args) throws Exception {
        /*jdbcSpringService.insert(new User_details(1,"CommandLineRunner","CommandLineRunner Class"));
        jdbcSpringService.insert(new User_details(2,"Bruno","Toronto"));
        jdbcSpringService.insert(new User_details(3,"Spinner","USA"));
        jdbcSpringService.insert(new User_details(4,"Robert","California"));
        jdbcSpringService.insert(new User_details(5,"Charles","Texas"));
        jdbcSpringService.delete(3);*/
        System.out.println("Results of query 1 : "+ userDetailsRepository.findById(1));
        System.out.println("Results of query 2 : "+ userDetailsRepository.findByName("HARMEET"));
        System.out.println("Results of query 3 : "+ userDetailsRepository.findByName("MEET"));
        System.out.println("Results of query 4 : "+ userDetailsRepository.findByName("GEET"));
        System.out.println("Results of query 5 : "+ userDetailsRepository.findByName(""));
        System.out.println("Results of query 6 : "+ userDetailsRepository.findByAddress("AUSTRALIA"));
        System.out.println("Results of query 7 " + findByLoc("AUSTRALIA"));
    }
    public List<String> findByLoc(String loc){
        List<String> collect = userDetailsRepository.findByAddress(loc)
                .stream()
                .filter(predicate)  // Stream<User_details>
                .map(User_details::getName)
                .map(String::toUpperCase)
                .map(function)
                .collect(Collectors.toList());
        System.out.println("000000000000000000000000000000");
    collect.forEach(System.out::println);
        return collect;

    }
}
