package com.learnjava8.parallelstreams;

import java.util.stream.IntStream;

public class WhyNotToUseParallelStreams {
    public static void main(String[] args) {
        SumBean sumBean = new SumBean();
        IntStream.rangeClosed(1,1000)
                .parallel() // this will give diff rsults
                .forEach(sumBean::sum);
        System.out.println(sumBean.getTotal());
    }
}
