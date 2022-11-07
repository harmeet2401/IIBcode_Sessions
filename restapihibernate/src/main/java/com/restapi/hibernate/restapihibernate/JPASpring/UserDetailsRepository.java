package com.restapi.hibernate.restapihibernate.JPASpring;


import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<User_details, Integer> {
}
