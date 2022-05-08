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
}
