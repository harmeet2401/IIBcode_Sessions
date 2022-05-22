package com.learnjava8.interfaces;

import java.util.Arrays;
import java.util.List;

public class RunableMainClass {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Result of multiplication : " + multiplier.multiply(list));
        System.out.println("Size of the list is : "+multiplier.listSize(list));
        System.out.println("Is the list empty? : "+Multiplier.isEmpty(list));
    }
}
