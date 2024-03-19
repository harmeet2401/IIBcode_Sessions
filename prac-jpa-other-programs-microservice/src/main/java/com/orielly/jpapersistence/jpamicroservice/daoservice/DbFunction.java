package com.orielly.jpapersistence.jpamicroservice.daoservice;
import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface DbFunction {
    public List<Customer> findAll();
    public Customer findById(Integer id);
    public void delete(Customer customer);
    public int count();
    public void save(Customer customer);


}
