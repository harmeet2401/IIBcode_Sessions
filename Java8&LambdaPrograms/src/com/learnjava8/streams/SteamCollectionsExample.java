package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.functionalinterfaces.PredicateAndConsumerLambdaExample;
import com.learnjava8.service.StudentInstace;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

/**
 * The stream each operation sends single element to next operation only if it returns true or else it is filtered out.
 */
public class SteamCollectionsExample {
    public static void main(String[] args) {
        Map<String, List<String> > map = new HashMap<>();
        Predicate<Students> p = (student)-> PredicateAndConsumerLambdaExample.activitesCount(student)>=3;
        Predicate<Students> p1 = (student)-> student.getMarks()>300;
        map = StudentInstace.getstudents().stream()
                .peek(students -> {
                    System.out.println("Before filter :" +students);
                })
                .filter(p)
                .peek(students -> {
                    System.out.println("After 1st  filter :" +students);
                })
                .filter(p1)
                .peek(students -> {
                    System.out.println("After 2nd   filter :" +students);
                })
                .collect(Collectors.toMap(Students::getName,Students::getActivities));
        Stream<Students> studentsStream = StudentInstace.getstudents().stream()
                .filter(p)
                .filter(p1);
        System.out.println("Stream : "+ studentsStream.count());
        System.out.println("Map created : "+map);

    }
    publiv void parallelProcessing(){
        /**
         * Classic example of how the parallel processing will work
         * In below example the above educate stream will be break down by two threads
         * will get appended and at the end two string builder examples will be appeneded
         * at the end.
         */

        Instant start = Instant.now();
        Stream<String> educate = Stream.of("ed","u","ca","te");
        StringBuilder endStr = educate.collect(()->new StringBuilder(),
                (sb,st)->sb.append(st),
                (sb1,sb2)->sb1.append(sb2));
        System.out.println(endStr);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

        Instant start1 = Instant.now();
        Stream<String> honesty = Stream.of("ho","n","es","ty");
        String endStr2 = honesty
                .collect(Collectors.joining(""));

        System.out.println(endStr2);
        Instant end1 = Instant.now();
        Duration timeElapsed1 = Duration.between(start1, end1);
        System.out.println("Time taken: "+ timeElapsed1.toMillis() +" milliseconds");
    }
}
