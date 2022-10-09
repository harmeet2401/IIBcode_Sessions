package com.in28minutes.rest.webservices.restfullservice.serviceDAO;

import com.in28minutes.rest.webservices.restfullservice.bean.Employee;
import com.in28minutes.rest.webservices.restfullservice.bean.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Component
public class UserServiceDAO {
    public static List<User> userlist = new ArrayList<>();
    public static int countid =0;
    /*public Supplier<List<User>> usersupplier = ()->{
        userlist =  Arrays.asList(
                new User(++countid, "Prince", LocalDate.now().minusDays(24)),
                new User(++countid, "Pramod", LocalDate.now().minusDays(20)),
                new User(++countid, "jenita", LocalDate.now().minusDays(30)),
                new User(++countid, "Gavin", LocalDate.now().minusDays(35)),
                new User(++countid, "Guru", LocalDate.now().minusDays(29))


        );
        return userlist;
    };*/

    static{
        userlist.add(new User(++countid, "Prince", LocalDate.now().minusDays(24)));
        userlist.add(new User(++countid, "Pramod", LocalDate.now().minusDays(20)));
        userlist.add(new User(++countid, "jenita", LocalDate.now().minusDays(30)));
        userlist.add(new User(++countid, "Gavin", LocalDate.now().minusDays(35)));
        userlist.add(new User(++countid, "Guru", LocalDate.now().minusDays(29)));

    };

    public List<User> findAll(){
        return userlist;
    }
    public User findOne(int id){
        Predicate<User> userPredicate = (u)->u.getId()==id;
        return userlist.stream()
                .filter(userPredicate)
                .findFirst()
                .get();
    }

    public User saveUser(User user){
        user.setId(++countid);
        userlist.add(user);
        return user;
    }



}
