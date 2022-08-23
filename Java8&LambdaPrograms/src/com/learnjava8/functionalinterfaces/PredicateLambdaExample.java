package com.learnjava8.functionalinterfaces;

import java.util.function.Predicate;

/**
 * Predicate functional interface will help is executing the boolean operation method provided by preducate functional
 * interface  like or , negate , and .
 * test function is the one which will be receiving the parameters.
 */
public class PredicateLambdaExample {
static Predicate<Integer> p1 = (number)->number%2==0;
static Predicate<Integer> p2 = (number)->number%5==0;

    public static void main(String[] args) {
        predicateEven();
        predicateAnd();
        predicateNegate();
        predicateOr();
    }
    public static void predicateEven(){
        System.out.println("   ");
        System.out.println("Predicate value for number is even : ? "+p1.test(8));
        System.out.println("Predicate value for number is multiple of 5 : ? "+p1.test(10));

    }
    public static void predicateOr(){
        System.out.println("   ");
        System.out.println("predicateOr value for number is even : ? "+p1.or(p2).test(8));
        System.out.println("predicateOr value for number is even : ? "+p1.or(p2).test(10));

    }
    public  static void predicateAnd(){
        System.out.println("   ");
        System.out.println("predicateAnd value for number is even : ? "+p1.and(p2).test(8));
        System.out.println("predicateAnd value for number is even : ? "+p1.and(p2).test(10));

    }
    public static void predicateNegate(){
        System.out.println("   ");
        System.out.println("predicateNegate value for number is even : ? "+p1.or(p2).negate().test(8));
        System.out.println("predicateNegate value for number is even : ? "+p1.or(p2).negate().test(10));

    }
 }

