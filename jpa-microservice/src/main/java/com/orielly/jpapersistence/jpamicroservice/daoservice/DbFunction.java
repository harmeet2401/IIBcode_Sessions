package com.orielly.jpapersistence.jpamicroservice.daoservice;
import com.orielly.jpapersistence.jpamicroservice.entity.Customer;

import java.util.*;
public interface DbFunction {
    public List<Customer> findAll();
    public Customer findById(Integer id);
    public void delete();
    public int count();


}
