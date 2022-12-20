package com.learnjava8.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

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

public static Function<Students,String> f1 =
        (students)->{
                if(students.getName().contains("ar")){
                  return students.getName().toLowerCase();
                }
                return null;
        };
    public static Function<Students,Students> f2 =(students)->{ return students;  };
    public static void main(String[] args) {
        List<Students> list = new StudentInstace().getstudents();

        list.stream()
                .collect(Collectors.toMap(f1,f2));

        // above can be done as
        Map<String , Students> map1 = new HashMap<>();
        list.forEach(student -> map1.put(student.getName().toUpperCase(),student));
        System.out.println(map1);

        filterStudents(list);
    }
    public static void filterStudents(List<Students> list){
        System.out.println(mapBiFunction.apply(list,PredicateAndConsumerLambdaExample.biPredicate));
    }
}
