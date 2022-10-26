package com.in28minutes.rest.webservices.restfullservice.serviceDAO;

import com.in28minutes.rest.webservices.restfullservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
