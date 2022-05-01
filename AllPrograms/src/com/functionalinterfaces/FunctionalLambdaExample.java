package com.functionalinterfaces;

import java.util.Locale;
import java.util.function.Function;

/**
 * This class will use function functinal interface to be cretad.
 */
public class FunctionalLambdaExample {

    static Function<String , String > function1 = (name)->name.concat("Default");
    static Function<String , String > function2 = (name)->name.toUpperCase(Locale.ROOT);
    public static void main(String[] args) {
        System.out.println(function1.andThen(function2).apply("Hello"));// the output of fn1 is input to fn2
        System.out.println(function1.compose(function2).apply("Hello"));// the output of fn2 will run first and will be
                                                                            // input to fn1

    }

}
