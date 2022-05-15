package com.learnjava8.com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SummingAveragingInt {

    public static void main(String[] args) {
        System.out.println(sumEarlierApproach());
        System.out.println(sumNewApproach());
        System.out.println(avgNewApproach());
    }
    public static int sumEarlierApproach(){
        return StudentInstace.getstudents()
                .stream()
                .map(Students::getNotebooks)
                .reduce(0,(a,b)->Integer.sum(a,b));
    }

    public static int sumNewApproach(){
        return StudentInstace.getstudents()
                .stream()
                .collect(Collectors.summingInt(Students::getNotebooks));
    }
    public static double avgNewApproach(){
        return StudentInstace.getstudents()
                .stream()
                .collect(Collectors.averagingInt(Students::getNotebooks));
    }
}
