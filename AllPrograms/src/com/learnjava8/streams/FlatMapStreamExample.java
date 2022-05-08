package com.learnjava8.streams;
import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamExample {
    public static void main(String[] args) {
        System.out.println(studentsActivities());
    }
    public static List<String> studentsActivities(){
        return StudentInstace.getstudents().stream()
                .map(Students::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
