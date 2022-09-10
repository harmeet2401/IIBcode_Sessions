package main.functionalinterface;

import main.bean.Student;
import main.service.StudentsService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BiFunctionFunctionalExample {
    /**
     * unaryoperator is used similar to function functional interface , the diff is it is used in case of
     * same input and out is required
     */
    UnaryOperator<String> unaryOperator = (s)->{return s;};

    /**
     * supplier is only to generate some data and for that it doesn't required any inputs.
     */
    static  Supplier<Map<String,String>> supplier = ()->{
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Check","Key");
      return stringMap;
    };
    static Predicate<Student> predicate = (st)->st.getBooks()>=50;
    static  BiFunction<List<Student>, Predicate<Student>, Map<String , Integer>> biFunction = (students, predicate)->{
        Map<String ,Integer > map = new HashMap<>();
        students.forEach((st)-> {
            if (predicate.test(st)) {
                map.put(st.getName(),st.getBooks());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentsService.getStudents(),predicate));
        System.out.println(supplier.get());
    }
}
