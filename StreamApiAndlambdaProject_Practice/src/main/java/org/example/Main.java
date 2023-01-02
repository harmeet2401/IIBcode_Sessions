package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Sum of first 100
        int sum=0;
        for (int i = 0; i <=100 ; i++) {
            sum+=i;
        }
        System.out.println("Sum imperative approach "+sum);

        //decalarative approach. RangeClosed will include both end values.
        System.out.println("Sum declarative approach "+ IntStream.rangeClosed(0,100)
                .sum());

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1,2,3,4,5,5,6,7,8,8,9,10);
        List<Integer> newlist = new ArrayList<>();
        List<Integer> newlist1 = new ArrayList<>();
        for (Integer integer : list) {
            if(!(newlist.contains(integer))){
                newlist.add(integer);
            }
        }

        newlist.stream()
                .forEach(System.out::println);
        System.out.println("------------------------");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        Map<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for (Integer integer : list) {
            map.put(k,integer);
            ++k;

        }
        HashSet<Integer> map1 = new HashSet<>();
        newlist1 = list.stream()
                        .filter((e)->!map1.add(e))
                                .collect(Collectors.toList());

        System.out.println("------------------------");
        System.out.println("Duplicates : "+ newlist1);

        System.out.println("------------------------");
        newlist1 = list.stream()
                .filter((e)->map1.add(e))
                .collect(Collectors.toList());
        System.out.println("Non-Duplicates : "+ map1);
    }
}