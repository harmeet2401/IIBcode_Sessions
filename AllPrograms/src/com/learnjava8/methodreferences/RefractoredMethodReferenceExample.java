package com.learnjava8.methodreferences;

import java.util.function.Predicate;

public class RefractoredMethodReferenceExample {
    static Predicate<Integer> p1 = RefractoredMethodReferenceExample::test;
    public static void main(String[] args) {

        System.out.println(p1.test(9));

    }

    private static boolean test(Integer number) {
        return number % 2 == 0;
    }
}
