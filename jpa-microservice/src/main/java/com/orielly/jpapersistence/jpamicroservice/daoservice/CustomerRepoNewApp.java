package com.orielly.jpapersistence.jpamicroservice.daoservice;

import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepoNewApp extends JpaRepository<Customer,Integer> {

}
