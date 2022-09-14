package main.service;

import main.bean.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentsService {
    public static Supplier<Student> supplier = ()->{
        return new Student("Harmeet","pot 90","IT",12,100);
    };
    public static Supplier<String> suppliername = ()->{
        return "Sample Name";
    };

     public static List<Student> getStudents(){
            List<Student> studentList = Arrays.asList(
                    new Student("Harmeet","pot 90","IT",12,100),
                    new Student("Gerry","pot 1991","CSE",13,32),
                    new Student("Drake","House 1900","ELEC",14,50),
                    new Student("Gevin","pot 90 wz 090","IT-1",15,60),
                    new Student("Zesi","pot 7788 yhhjj","I2",16,70),
                    new Student("Steph","666 rtsg","CSE-2",17,39));

        return studentList;
    }
    public static List<Student> getStudents_first(Student st){
        List<Student> studentList = Arrays.asList(new Student("harmeet","pot 90","IT",12,10),
                new Student("Gerry","pot 1991","CSE",13,32),
                new Student("Drake","House 1900","ELEC",14,50),
                new Student("Gevin","pot 90 wz 090","IT-1",15,60),
                new Student("Zesi","pot 7788 yhhjj","I2",16,70),
                new Student("Steph","666 rtsg","CSE-2",17,39));

        return studentList;
    }


}
