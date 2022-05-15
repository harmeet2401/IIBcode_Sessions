package com.learnjava8.numericstreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class BoxingAndUnboxingExample {
    public static void main(String[] args) {
        System.out.println("Boxing : "+boxing());
        List<Integer> integers = boxing();
        System.out.println("UnBoxing : "+unBoxing(integers));
    }
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integers){
        return integers.stream().
                mapToInt(Integer::intValue)
                .sum();
    }

}

