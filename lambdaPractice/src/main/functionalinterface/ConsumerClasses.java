package main.functionalinterface;

import main.bean.Student;
import main.service.StudentsService;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerClasses {
    //** below consumer declaration will help in reducing the code duplications.
    static Consumer<Student>  consumer1 = (students)-> System.out.print(students);
    static Consumer<Student>  consumer2 = (students)-> System.out.println(students.getName()+" have "+students.getBooks()+" books ");
    static Consumer<Student>  consumer3 = (students)-> {
        if(students.getBooks()>30) {
            System.out.println(students.getName()+" and ID : - "+students.getId());

        }
    };
    public static void getNameForMoreThen30Books(List<Student> list){
        list.forEach(consumer3);
    }
    public static void main(String[] args) {
        List<Student> students = StudentsService.getStudents();
        System.out.println("Consumer class");
        consumer1.andThen(consumer2).andThen(consumer3).accept(students.get(1));
        //getstudents(students);
        //getBooksByname(students);
        //getNameFollowedByBooks(students);
        //getNameForMoreThen30Books(students);
    }

    /**
     * This function will print the consumer1 output along with consumer2 output
     * @param students
     */
    public static void getNameFollowedByBooks(List<Student> students){
        students.forEach(consumer1.andThen(consumer2));
    }
    public static void getstudents(List<Student> students){

        students.forEach(consumer1);
    }
    public static void getBooksByname(List<Student> students){
        students.forEach(consumer2);
    }
}
