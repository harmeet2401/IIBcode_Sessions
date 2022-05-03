package com.learnjava8.functionalinterfaces;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * This example will use the function functional interface lambda expression.
 * It is used to create a map (name , marks) from the students under a condition for students marks above 300
 */
public class FunctionLambdaExampleStudents {
    static Function<List<Students>, Map<String, Integer>> studentsMapFunction = (students -> {
        Map<String , Integer> map1 = new HashMap<>();
        students.forEach(student->{
            if(PredicateAndConsumerLambdaExample.biPredicate.test(student.getMarks(),
                    PredicateAndConsumerLambdaExample.activitesCount(student))){
                map1.put(student.getName(),student.getMarks());
            }
        });

        return map1;
    });

    public static void main(String[] args) {
        List<Students>  students = new StudentInstace().getstudents();
        filterStudents(students);
    }
    public static void filterStudents(List<Students> students){
        System.out.println(studentsMapFunction.apply(students));
    }
}
