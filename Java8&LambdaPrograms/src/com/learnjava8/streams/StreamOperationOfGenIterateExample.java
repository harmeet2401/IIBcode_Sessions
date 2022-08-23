package com.learnjava8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOperationOfGenIterateExample {
    public static void main(String[] args) {
        //This 'of()' help in creating infinite stream of certain values.
        Stream<String> integerStream =Stream.of("Anna","Maurice","berlin");
        integerStream.forEach(System.out::println);

        /**
         *iterate() fn will help in creating an infinite stream using a UnaryOperator functional interface
         * which takes one input of type and return a value of same type.
         */
        Stream.iterate(0,(x)->x+2)
                .limit(10)
        .forEach(System.out::println);

        /**
         * The generate method will help in creating the infinite stream by asking for a Supplier functional interface
         * object
         */
        Supplier<Integer> supplier = new Random()::nextInt;//()-> new Random().nextInt();
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);


    }
}
