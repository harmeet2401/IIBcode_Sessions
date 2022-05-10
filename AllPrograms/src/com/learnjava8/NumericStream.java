package com.learnjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfNInteger(list));
        System.out.println(sumOfNIntegerUsingNumericStr(list));
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

}
