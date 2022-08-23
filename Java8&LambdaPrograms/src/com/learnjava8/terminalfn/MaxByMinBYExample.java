package com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MaxByMinBYExample {
    public static void main(String[] args) {
        Optional<Students> optionalStudents = maxBy_test();
        if(optionalStudents.isPresent()){
            System.out.println(optionalStudents.get());
        }
        Optional<Students> optionalStudents1 = minBy_test();
        if(optionalStudents1.isPresent()){
            System.out.println(optionalStudents1.get());
        }

    }
    public static Optional<Students> maxBy_test(){
        return StudentInstace.getstudents()
                .stream()
                .collect(maxBy(Comparator.comparing(students -> students.getMarks())));
    }
    public static Optional<Students> minBy_test(){
        return StudentInstace.getstudents()
                .stream()
                .collect(minBy(Comparator.comparing(students -> students.getMarks())));
    }
}
