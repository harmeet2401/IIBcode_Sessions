package com.learnjava8.interfaces;

import java.util.Arrays;
import java.util.List;
public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> list) {

        return list.stream()
                .reduce(1,(x,y)->x*y);

    }
    @Override
    public int listSize(List<Integer> list){
        System.out.println("Size using MultiplierImpl class : ");
        return list.size();
    }
}
