package com.in28minutes.rest.webservices.restfullservice.controllers;

import com.in28minutes.rest.webservices.restfullservice.bean.Employee;
import com.in28minutes.rest.webservices.restfullservice.serviceDAO.EmployeeUserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    public Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    public EmployeeUserDAO employeeUserDAO;

    /**
     * Get all the employees for an organisation
     */
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){
            logger.info("-----------Get all the employees for an organisation----------");
            return employeeUserDAO.supplier.get();
    }

    @GetMapping(path = "/log")
    public String loggin(){
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");
        return "Hey checkout the logs in the file";
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
