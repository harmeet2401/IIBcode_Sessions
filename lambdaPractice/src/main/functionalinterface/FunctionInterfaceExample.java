package main.functionalinterface;
import main.bean.Students;
import main.service.StudentsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceExample {
    static public Function<String,String> function = (name)->name.toUpperCase();

    static public Function<String,String> addthenobj = (name)->name.concat(" - java8");
    static public Function<List<Students>, Map<String,String>> studentFn = (students)->{
        Map<String,String> newstudents = new HashMap<>();
        students.forEach(s -> {
            if (PredicateandConsumerExample.predicate.and(PredicateandConsumerExample.predicate1).test(s)) {
                newstudents.put(s.getName(),s.getStreamname());
            }

        });
        return newstudents;
    };
    public static void practice() {
        //just going to perfomr uppercase
        System.out.println(function.apply("Harmeet Singh"));

        // will first apply the uppercase and then send it for concat
        System.out.println(function.andThen(addthenobj).apply("harmeet Singh"));

        // compose will execute the second function implementation of concat first and the go for the uppercase
        System.out.println(function.compose(addthenobj).apply("harmeet Singh"));

    }

    public static void filterFunciotnInterfaceUsage(List<Students> list){
        System.out.println(studentFn.apply(list));
    }
    public static void main(String[] args) {
        filterFunciotnInterfaceUsage(StudentsService.getStudents());
    }


}
