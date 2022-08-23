package com.learnjava8.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * This example will show you how the parallel stream creation help in speed up the prcess of operation
 */
public class ParallelStreamsExample {
    public static void main(String[] args) {

        System.out.println(performanceCheck(10,ParallelStreamsExample::sumSequentialStream));
        System.out.println(performanceCheck(10,ParallelStreamsExample::sumParallelStream));
    }

    public static long performanceCheck(int numberoftimes, Supplier<Integer> supplier){
        Long starttime = System.currentTimeMillis();
        for (int i=0;i<numberoftimes;i++) {
           supplier.get();
        }
        Long endtime = System.currentTimeMillis();

        return endtime-starttime;

    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }
}
