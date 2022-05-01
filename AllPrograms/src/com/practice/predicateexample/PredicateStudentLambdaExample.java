package com.practice.predicateexample;

import com.practice.bean.Students;
import com.practice.service.StudentInstace;
import java.util.List;
import java.util.function.Predicate;

/**
 * predicate interface to apply boolean operations on the students objects
 */

public class PredicateStudentLambdaExample {
    static Predicate<Students> p1 = (student)-> student.getMarks()>=600;
    static Predicate<Students> p2 = (student)-> student.getName().startsWith("A");
    static List<Students> studentsList = new StudentInstace().getstudents();
    public static void main(String[] args) {
        predicateFilterStudents();
    }
    public static void predicateFilterStudents(){
        studentsList.forEach((students -> {
            if(p1.and(p2).test(students)){
                System.out.println("Students with marks greater then of equal to 600 : " + students.getName());
            }
        }));
    }
}
