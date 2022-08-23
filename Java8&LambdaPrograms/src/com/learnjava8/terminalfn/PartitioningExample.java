package com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class PartitioningExample {
    public static void main(String[] args) {
       // System.out.println(partitioningBY_1());
        System.out.println(partitioningBY_2());
    }
    public static Map<Boolean, List<Students>> partitioningBY_1(){
        Map<Boolean, List<Students>> collect = StudentInstace.getstudents()
                .stream()
                .collect(partitioningBy(Students -> Students.getMarks() >= 500));
        return collect;
    }
    public static Map<Boolean, Set<Students>> partitioningBY_2(){
        Map<Boolean, Set<Students>> collect = StudentInstace.getstudents()
                .stream()
                .collect(partitioningBy(Students -> Students.getMarks() >= 500,toSet()));
        return collect;
    }
}
