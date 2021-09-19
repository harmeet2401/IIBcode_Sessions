package com.orielly.jpapersistence.jpamicroservice.controller;

import com.orielly.jpapersistence.jpamicroservice.daoservice.CustomerDAO;
import com.orielly.jpapersistence.jpamicroservice.daoservice.CustomerRepoNewApp;
import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JPAController {

    //Old Approach
    @Autowired
    CustomerDAO customerDAO;

    //New Approach
    @Autowired
    CustomerRepoNewApp customerRepoNewApp;

    @GetMapping(path = "/customer/new")
    public List<Customer> getCustomerNew(){
        //return customerDAO.findAll();
        List<Customer> all = customerRepoNewApp.findAll();
        return all;
    }

    @GetMapping(path = "/customer/old")
    public List<Customer> getCustomerOld(){
        return customerDAO.findAll();

    }

    @GetMapping(path = "/getbyid/{id}")
    public Customer getById(@PathVariable int id){
        return customerDAO.findById(id);

    }
}
