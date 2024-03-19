package com.orielly.jpapersistence.jpamicroservice.daoservice;

import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface CustomerRepoNewApp extends JpaRepository<Customer,Integer> {

    // these below function we can add the spring boot will add the backend queries for it .
    List<Customer> findByLast( String last);
    List<Customer> findByFirst(String first);
}
