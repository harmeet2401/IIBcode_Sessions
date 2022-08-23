package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingStreamExample {
    public static void main(String[] args) {
        System.out.println("printStudents :");
        printStudents().forEach(System.out::println);
        System.out.println("printStudentsByNameDesc :");
        printStudentsByNameAlphabeticalOrder().forEach(System.out::println);
        System.out.println("printStudentsByNameAsc :");
        printStudentsByNameAlphabeticalOrderReveresed().forEach(System.out::println);
        System.out.println("printStudentsByMarks :");
        printStudentsByMarks().forEach(System.out::println);

    }
    public static List<Students> printStudents(){
        return StudentInstace.getstudents().stream()
                .collect(Collectors.toList());
    }
    public static List<Students> printStudentsByNameAlphabeticalOrder(){
        return StudentInstace.getstudents().stream()
                .sorted(Comparator.comparing(Students::getName))
                .collect(Collectors.toList());
    }
    public static List<Students> printStudentsByNameAlphabeticalOrderReveresed(){
        return StudentInstace.getstudents().stream()
                .sorted(Comparator.comparing(Students::getName).reversed())
                .collect(Collectors.toList());
    }
    public static List<Students> printStudentsByMarks(){
        return StudentInstace.getstudents().stream()
                .sorted(Comparator.comparing(Students::getMarks))
                .collect(Collectors.toList());
    }
}
