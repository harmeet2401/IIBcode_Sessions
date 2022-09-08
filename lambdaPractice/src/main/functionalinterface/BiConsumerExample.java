package main.functionalinterface;

import main.bean.Students;
import main.service.StudentsService;

import java.util.function.BiConsumer;
import java.util.List;

public class BiConsumerExample {
    static  BiConsumer<String,Students> biConsumer = (name,students)->{
        if(students.getBooks()>=30){
            System.out.println(students);
        }
    };
    public static void main(String[] args) {
        List<Students> list = StudentsService.getStudents();
        getStudentUsingBiConsumer(list);
    }
    public static void getStudentUsingBiConsumer(List<Students> list)
    {
            list.forEach(student -> biConsumer.accept(student.getName(),student));
    }

}
