package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

/**
 * This class will get the students whose activities are greater then 2 and then sum up the number of books for all students
 */
public class FilterMapReduceStreamExample {
    public static void main(String[] args) {
        System.out.println(printNoOfBooks());
    }
    public static int printNoOfBooks(){
        return StudentInstace.getstudents().stream() // Stream<Students>
                .filter(students -> students.getMarks()>300) // Stream<Students>
                .filter(students -> students.getActivities().stream().count()>2)// Stream<Students> with activities greater then 2
                .peek(student -> {
                    System.out.println("Post filter "+ student);
                })
                .map(Students::getNotebooks)// Will give Stream<Integers>
                .peek(notebooks -> {
                    System.out.println("Notebooks for each student "+ notebooks);
                })
                //.reduce(0,(n1,n2)->n1+n2);
        .reduce(0,Integer::sum); // direct using the java class to sum up

    }

}
