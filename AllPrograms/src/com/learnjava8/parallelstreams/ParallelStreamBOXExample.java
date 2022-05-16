package com.learnjava8.parallelstreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

/**
 * this example we are going to use box function to create a List of integer instead of using the List<></>
 */
public class ParallelStreamBOXExample {
    public static void main(String[] args) {
        List<Integer> list  = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());
        parallelSum(list);
        sequentialSum(list);


    }
    public static void parallelSum(List<Integer> list){
        long strTime = System.currentTimeMillis();
        int sum = list.parallelStream()
                .reduce(0,(x,y)->x+y);
        System.out.println("Duration taken for parallelSum "+ (System.currentTimeMillis()-strTime));


    }
    public static void sequentialSum(List<Integer> list){
        long strTime = System.currentTimeMillis();
        int sum = list.stream()
                .reduce(0,(x,y)->x+y);

        System.out.println("Duration taken for sequentialSum "+ (System.currentTimeMillis()-strTime));
    }
}
