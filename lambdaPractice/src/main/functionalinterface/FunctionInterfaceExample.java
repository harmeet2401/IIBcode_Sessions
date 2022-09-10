package main.functionalinterface;
import main.bean.Student;
import main.service.StudentsService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterfaceExample {
    //static public Function<String,String> function = (name)->name.toUpperCase();
    /**
     * below right hand side is the shortcut way to write the lambda expression
     */
    static public Function<String,String> function = String::toUpperCase;
    static public Function<Student,List<Student>> function1 = StudentsService::getStudents_first;
    static Supplier<Student> supplier = Student::new; // allow it to create an empty constructor
    static Function<String, Student> function_cons_ref = Student::new;

    static public Function<String,String> addthenobj = (name)->name.concat(" - java8");
    static public Function<List<Student>, Map<String,String>> studentFn = (students)->{
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

    public static void filterFunciotnInterfaceUsage(List<Student> list){
        System.out.println(studentFn.apply(list));
    }
    public static void main(String[] args) {
        //filterFunciotnInterfaceUsage(StudentsService.getStudents());
        System.out.println(function_cons_ref.apply("harmeet singh"));
    }


}
