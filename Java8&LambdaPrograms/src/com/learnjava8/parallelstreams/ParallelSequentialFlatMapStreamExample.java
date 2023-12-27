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

    public static void classicReductionParallelStream(){
        /**
         * Classic example of how the parallel processing will work
         * In below example the above educate stream will be break down by two threads
         * will get appended and at the end two string builder examples will be appeneded
         * at the end.
         */

        Instant start = Instant.now();
        Stream<String> educate = Stream.of("ed","u","ca","te","ed","u","ca","te","ed","u","ca","te","ed","u","ca","te");
        StringBuilder endStr = educate.collect(()->new StringBuilder(),
                (sb,st)->sb.append(st),
                (sb1,sb2)->sb1.append(sb2));
        System.out.println(endStr);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

        Instant start1 = Instant.now();
        Stream<String> honesty = Stream.of("ho","n","es","ty","ho","n","es","ty","ho","n","es","ty","ho","n","es","ty","ho","n","es","ty");
        String endStr2 = honesty
                .collect(Collectors.joining(""));

        System.out.println(endStr2);
        Instant end1 = Instant.now();
        Duration timeElapsed1 = Duration.between(start1, end1);
        System.out.println("Time taken: "+ timeElapsed1.toMillis() +" milliseconds");
    }
}
