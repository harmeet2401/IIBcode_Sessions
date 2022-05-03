package com.learnjava8.methodreferences;

import com.learnjava8.bean.Students;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RefractoredMethodReferenceExample {
    static Predicate<Integer> p1 = RefractoredMethodReferenceExample::test;


    /**
     * Constructor reference using java 8
     */
    static Supplier<Students> supplier = Students::new;
    static Function<String,Students> stringStringFunction = Students::new;

    public static void main(String[] args) {

        System.out.println(p1.test(9));
        System.out.println(stringStringFunction.apply("Harmeet Singh"));
        System.out.println(supplier.get());

    }

    private static boolean test(Integer number) {
        return number % 2 == 0;
    }
}
