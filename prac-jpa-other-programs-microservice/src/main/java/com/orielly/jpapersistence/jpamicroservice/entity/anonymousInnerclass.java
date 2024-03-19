package com.orielly.jpapersistence.jpamicroservice.entity;

import java.util.Comparator;

interface Greeting{
    void greet();
}
 public class  anonymousInnerclass {
    public static void main(String[] args) {
        /**
         * This is used sort the objects in natural order using the defined values.
         */
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        /**
         * This is used for sorting in order basis of comparing object using customized fields comparison.
         */
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                return 0;
            }
        };
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class");
            }
        };
        greeting.greet();
    }
}