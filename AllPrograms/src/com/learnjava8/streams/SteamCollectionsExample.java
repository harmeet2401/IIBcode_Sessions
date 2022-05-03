package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.functionalinterfaces.PredicateAndConsumerLambdaExample;
import com.learnjava8.service.StudentInstace;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;
public class SteamCollectionsExample {
    public static void main(String[] args) {
        Map<String, List<String> > map = new HashMap<>();
        Predicate<Students> p = (student)-> PredicateAndConsumerLambdaExample.activitesCount(student)>=3;
        Predicate<Students> p1 = (student)-> student.getMarks()>300;
        map = StudentInstace.getstudents().stream()
                .filter(p)
                .filter(p1)
                .collect(Collectors.toMap(Students::getName,Students::getActivities));
        System.out.println(map);
    }
}
