package com.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.functionalinterfaces.PredicateAndConsumerLambdaExample;
import com.functionalinterfaces.bean.Students;
import com.functionalinterfaces.service.StudentInstace;

/**
 * This classwill use th BiFunction interface and allow two input paramters to be used
 */
public class BiFunctionLambdaExample {
    static BiFunction<List<Students>, BiPredicate<Integer,Integer>, Map<String,Integer>> mapBiFunction =
            (students,predicate)->{
                Map<String  , Integer> map = new HashMap<>();
                students.forEach(student->{
                    if(predicate.test(student.getMarks(),(int)student.getActivities().stream().count())){
                        map.put(student.getName(),student.getMarks());
                    }
                });
                    return  map;
            };


    public static void main(String[] args) {
        List<Students> list = new StudentInstace().getstudents();
        filterStudents(list);
    }
    public static void filterStudents(List<Students> list){
        System.out.println(mapBiFunction.apply(list,PredicateAndConsumerLambdaExample. biPredicate));
    }
}
