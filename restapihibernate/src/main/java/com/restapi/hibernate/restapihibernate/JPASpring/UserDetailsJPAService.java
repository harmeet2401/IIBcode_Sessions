package com.restapi.hibernate.restapihibernate.JPASpring;

import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsJPAService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void insertUser(User_details user_details){
        userDetailsRepository.save(user_details);
    }
    public void deleteUser(int  id){
        userDetailsRepository.deleteById(id);
    }
    public User_details getUser(int id){

        return userDetailsRepository.findById(id).get();
    }


}
