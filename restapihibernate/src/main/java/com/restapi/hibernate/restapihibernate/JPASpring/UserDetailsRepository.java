package com.restapi.hibernate.restapihibernate.JPASpring;


import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<User_details, Integer> {

        List<User_details> findByName(String name);
        List<User_details> findByAddress(String address);

        //List<String> findByCountry(String address);
}
