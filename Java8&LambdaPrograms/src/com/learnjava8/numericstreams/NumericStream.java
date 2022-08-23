package com.learnjava8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
       // System.out.println(sumOfNInteger(list));
        //System.out.println(sumOfNIntegerUsingNumericStr(list));

        //numericStreamRangeFn();
        numericStreamRangeAggregateFn();

    }

    /**
     * :( Unboxing happens when the stream created send the el to reduce functon which is an extra step
     * that happens in backend
     * @param list
     * @return
     */
    public static int sumOfNInteger(List<Integer> list){
        return list.stream()   // whenever it passes the list elements one by one it unboxes the value from Integer to int.
                .reduce(1,(x,y)->x*y);
    }

    /**
     * Here the unboxing step is avoided and directly the int value is send to the reduce method.
     * @return
     */
    public static int sumOfNIntegerUsingNumericStr(List<Integer> lis){

        return IntStream
                .rangeClosed(1,6)
                .sum();


    }

    public static void numericStreamRangeFn(){

        System.out.println("Int Range closed count : "+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(System.out::print);
        System.out.println();
        System.out.println("Int Range count : "+IntStream.range(1,50).count());
        IntStream.range(1,50).forEach(System.out::print);
        System.out.println();
        System.out.println("Long Range closed count : "+LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(System.out::print);
        System.out.println();
        System.out.println("Long Range count : "+LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(System.out::print);
        System.out.println();
        System.out.println("Decimal Range closed count : "+IntStream.rangeClosed(1,50).asDoubleStream().count());
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(System.out::print);
        System.out.println();
        System.out.println("Decimal Range count : "+IntStream.range(1,50).asDoubleStream().count());
        IntStream.range(1,50).asDoubleStream().forEach(System.out::print);
    }
    public static void numericStreamRangeAggregateFn(){

        System.out.println("Int Range closed sum : "+IntStream.rangeClosed(1,50).sum());
        System.out.println();
        System.out.println("Int Range sum : "+IntStream.range(1,50).sum());
        System.out.println();
        System.out.println("Long Range closed sum : "+LongStream.rangeClosed(1,50).sum());
        System.out.println();
        System.out.println("Long Range sum : "+LongStream.range(1,50).sum());
        System.out.println();
        System.out.println("Double Range closed sum : "+ IntStream.rangeClosed(1,50).asDoubleStream().sum());
        System.out.println();
        System.out.println("Double Range  sum : "+ IntStream.range(1,50).asDoubleStream().sum());
        System.out.println();

        OptionalInt min = IntStream.rangeClosed(1, 50).min();
        if(min.isPresent()){
            System.out.println(min.getAsInt());
        }else{
            System.out.println("No range is there");
        }
        OptionalInt max = IntStream.rangeClosed(0, 0).max();
        if(max.isPresent()){
            System.out.println(max.getAsInt());
        }else{
            System.out.println("No range is there");
        }
    }

}
