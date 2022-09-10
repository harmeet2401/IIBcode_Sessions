package main.functionalinterface;

import main.bean.Student;
import main.service.StudentsService;

import java.util.function.BiConsumer;
import java.util.List;

public class BiConsumerExample {
    static  BiConsumer<String, Student> biConsumer = (name, students)->{
        if(students.getBooks()>=30){
            System.out.println(students);
        }
    };
    public static void main(String[] args) {
        List<Student> list = StudentsService.getStudents();
        getStudentUsingBiConsumer(list);
    }
    public static void getStudentUsingBiConsumer(List<Student> list)
    {
            list.forEach(student -> biConsumer.accept(student.getName(),student));
    }

}
