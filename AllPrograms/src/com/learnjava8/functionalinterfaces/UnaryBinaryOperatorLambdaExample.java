package com.learnjava8.functionalinterfaces;

import java.util.Comparator;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorLambdaExample {
    static UnaryOperator<String> unaryOperator = (s)->s.toUpperCase(Locale.ROOT);
    static BinaryOperator<String> binaryOperator = (s1,s2)->s1.concat(s2);
    static Comparator<Integer> integerComparator = (i1,i2)->i1.compareTo(i2);



    public static void main(String[] args) {

        System.out.println("using unary operator : " +unaryOperator.apply("Harmeet Singh "));
        System.out.println("using binry operator : " +binaryOperator.apply("Harmeet Singh ","Virdi"));
        BinaryOperator<Integer> integerBinaryOperator = BinaryOperator.maxBy(integerComparator);
        System.out.println("maxby : "+integerBinaryOperator.apply(8,9));


    }
}
