package com.in28minutes.rest.webservices.restfullservice.serviceDAO;


import com.in28minutes.rest.webservices.restfullservice.bean.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Component
public class EmployeeUserDAO {
    public List<Employee> list;
    public Supplier<List<Employee>> supplier = ()->{
        list =  Arrays.asList(
                new Employee( "Juneet",  "plot no7829",  "7982195509",  "Female"),
                new Employee( "Harmeet1",  "plot no7829",  "7982195508",  "Male"),
                new Employee( "Harmeet2",  "plot no7829",  "7982195507",  "Male"),
                new Employee( "Linda",  "plot no7829",  "7982195507",  "Female"),
                new Employee( "Harmeet2",  "plot no7829",  "7982195507",  "Male"),
                new Employee( "Geeta",  "plot no7829",  "7982195507",  "Female"),
                new Employee( "Harmeet2",  "plot no7829",  "7982195507",  "Male")
        );
        return list;
    };

    public Predicate<Employee> predicate = (e)->e.getGender().equalsIgnoreCase("Female");
    public Predicate<Employee> predicate2 = (e)->e.getGender().equalsIgnoreCase("male");
    public BiPredicate<String, Employee> predicate3 = (mob, e)->e.getMobile().equalsIgnoreCase(mob);
    /**
     * This function will filter the emp as per the gender
     */
    public BiFunction<String, List<Employee>,List<Employee>> function = (gender, emplist)->{
        List<Employee> outlist = new ArrayList<>();
        for (Employee employee : emplist) {
            if(gender.equalsIgnoreCase("female")) {
                if (predicate.test(employee)) {
                    outlist.add(employee);
                }
            }
            if(gender.equalsIgnoreCase("male")){
                if (predicate2.test(employee)) {
                    outlist.add(employee);
                }
            }
        }
        return outlist;

    };
}
