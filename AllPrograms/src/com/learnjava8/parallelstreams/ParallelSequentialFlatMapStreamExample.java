package com.learnjava8.parallelstreams;
import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelSequentialFlatMapStreamExample {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        studentsSequentialActivities();
        studentsParallelActivities();

    }
    public static List<String> studentsSequentialActivities(){
        long  starttime1 = System.currentTimeMillis();
        List<String> strings =   StudentInstace.getstudents().stream()
                .map(Students::getActivities)
                .flatMap(List::stream)
                //.distinct()
                //.sorted()
                .collect(Collectors.toList());
        long  endtime1 = System.currentTimeMillis();
        System.out.println("TIme taken for sequential execution "+ (endtime1-starttime1));
        return strings;
    }
    public static List<String> studentsParallelActivities(){
        long  starttime = System.currentTimeMillis();
    List<String> strings =  StudentInstace.getstudents().parallelStream()
                .map(Students::getActivities)
                .flatMap(List::stream)
                //.distinct()
                //.sorted()
                .collect(Collectors.toList());
        long  endtime = System.currentTimeMillis();
        System.out.println("TIme taken for parallel execution "+ (endtime-starttime));

        return strings;
    }
}
