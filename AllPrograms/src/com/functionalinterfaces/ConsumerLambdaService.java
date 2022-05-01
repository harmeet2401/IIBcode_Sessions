package com.functionalinterfaces;

import com.functionalinterfaces.bean.Students;
import com.functionalinterfaces.service.StudentInstace;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerLambdaService {

       static Consumer<Students> consumer1 = (student)->System.out.println("By setting it as part" +
                " of consumer object "+student);
        static Consumer<Students> consumer2 = (student)->{
            System.out.println("Name:"+student.getName() +" " +"Activities:"+student.getActivities());
        };
    static Consumer<Students> consumer3 = (student)->{
        if (student.getMarks() > 600 ) {
            System.out.println("Name:" + student.getName() + " " + "Activities:" + student.getActivities());
        }

    };

    public static void main(String[] args) {
        StudentInstace studentInstace = new StudentInstace();
        ArrayList<Students> list = studentInstace.getstudents();
        printStudents(list);
        printNameAndActivities(list);
        filterStudentNameAsPerMarks(list);


    }

    public static void printStudents(ArrayList<Students> students){
        /**
         * Below logic is implemented in two ways one is by directly writing the lambda expression inside foreach or
         * other by creating a consumer object which is also the same lambda we wrote directly inide the foreach in first
         * technique
         */
        students.forEach(student ->
                System.out.println("Student Name using direct :"  +student)
        );

        students.forEach(consumer1);
    }
    public static  void printNameAndActivities(ArrayList<Students> list){
        System.out.println("          ");
        System.out.println("printNameAndActivities------------------");

        list.forEach(consumer2);

    }
    public static  void filterStudentNameAsPerMarks(ArrayList<Students> list){
        System.out.println("          ");
        System.out.println("filterStudentNameAsPerMarks------------------");
        list.forEach(consumer3);

    }

}
