package com.learnjava8.methodreferences;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodrReferencesExample {
    /**
     * syntax :
     * classname::method ref
     */

    static Consumer<String> consumer1 = (s)-> System.out.println(s.toUpperCase(Locale.ROOT)+" Checking string 1");
    static Consumer<String> consumer2 = System.out::println;
    static Function<Integer ,String> function1 = (i)->Integer.toString(i);
    static Function<String , String> function2 = (s)->s.toUpperCase();
    static Function<String , String> function3 = String::toUpperCase;
    //static Function<String , ArrayList<Students>> listStringFunction = StudentInstace::getstudents;
    static Supplier<ArrayList<Students>> listSupplier = StudentInstace::getstudents;
    public static void main(String[] args) {

        consumer1.accept("My name ");
        consumer2.accept("uejejej");
        System.out.println("funtions returns 1 : "+ function1.apply(90));
        System.out.println("funtions returns 2 : "+ function2.apply("London"));
        System.out.println("funtions returns 3 : "+ function3.apply("Italy")+"\n");
        ArrayList<Students> list = listSupplier.get();
        list.forEach(student -> {
            System.out.println(student.getActivities());});
    }
}
