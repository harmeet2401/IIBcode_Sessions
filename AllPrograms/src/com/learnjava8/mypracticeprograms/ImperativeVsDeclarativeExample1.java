package com.learnjava8.mypracticeprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        ImperativeVsDeclarativeExample1 i = new ImperativeVsDeclarativeExample1();

        //Sum of first 200 numbers
        i.sumoffirst200();
        //remove duplicate from a list of integers
        i.removeDuplicates();

    }
    public void sumoffirst200(){
        /**
         * Imperative approach : how style of coding
         */
        int sum = 0;
        for (int i=0;i<=200;i++){
            sum+=i;
        }
        System.out.println("Imperative style of approach : "+sum);

        /**
         *Declarative approach : it says what style of coding here we do not bother about how the results came.
         */
        System.out.println("Declarative style of coding : "+IntStream.rangeClosed(0,200).sum());
        //Intstream is the class introduced in java 8 and have more feature and thread safe s compared to above imp
        // erative approach.
    }
    public void removeDuplicates(){

        List<Integer> intergerlist = Arrays.asList(1,2,3,4,4,5,6,6,7,8,8);
        //Imperative
        List<Integer> uniquelist  =new ArrayList<>();
        for(Integer num : intergerlist){
            if(!uniquelist.contains(num)){
                uniquelist.add(num);
            }

        }
        System.out.println("Imperative approach uniquelist : "+ uniquelist);

        //Declarative
        List<Integer> uniquelist1 = intergerlist.stream().distinct().collect(Collectors.toList());
        System.out.println("Imperative approach : "+uniquelist1);
    }
}
