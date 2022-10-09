package com.in28minutes.rest.webservices.restfullservice.controllers;

import com.in28minutes.rest.webservices.restfullservice.bean.Employee;
import com.in28minutes.rest.webservices.restfullservice.serviceDAO.EmployeeUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeUserDAO employeeUserDAO;

    /**
     * Get all the employees for an organisation
     */
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){

            return employeeUserDAO.supplier.get();
    }

    /**
     * This function will return the employee with mobile number sent in the path variable
     * predicate will help in searching tha from the list of the employees.
     */
    @GetMapping(path = "/employees/mobile/{mobile}")
    public Employee getEmployees(@PathVariable String mobile){
        return employeeUserDAO.supplier.get().stream()
                .filter((e)->employeeUserDAO.predicate3.test(mobile,e))
                .findFirst()
                .get();

    }

    /**
     * use predicate ot get the male employees.
     * @return
     */
    @GetMapping(path = "/employees/gender/{gender}")
    public List<Employee> getEmployeeGender(@PathVariable String gender){
        return employeeUserDAO.function.apply(gender,employeeUserDAO.supplier.get());

    }


}
