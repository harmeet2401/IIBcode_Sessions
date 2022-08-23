package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

public class MatchFnStreamExample {
    public static void main(String[] args) {
        System.out.println(StudentInstace.getstudents().stream()
                .allMatch(students -> students.getMarks()>500));
        System.out.println(StudentInstace.getstudents().stream()
                .noneMatch(students -> students.getMarks()>500));
        System.out.println(StudentInstace.getstudents().stream()
                .anyMatch(students -> students.getMarks()>500));
    }
}
