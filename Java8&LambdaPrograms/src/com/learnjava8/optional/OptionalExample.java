package com.learnjava8.optional;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Students students = getNameOldApproach();
        Optional<Students> studentop = getNameNewApproach();

        if(studentop.isPresent()) {
            System.out.println("New : "+ studentop.get().getName().toUpperCase(Locale.ROOT));
        }

        if(students!=null){
            System.out.println("old : "+ students.getName().toUpperCase(Locale.ROOT));
        }

    }

    /**
     * This fn return null in case the student doesn't exists
     * @return
     */
    public static  Students  getNameOldApproach(){
        Students students = null;//StudentInstace.supplier.get();
        if(students!=null){
            return students;
        }
    return null;

    }
    public static  Optional<Students>  getNameNewApproach(){
        Optional<Students> optionalStudents = Optional.ofNullable(StudentInstace.supplier.get());
        if(optionalStudents.isPresent()){
            return optionalStudents;
        }else{
            System.out.println("Student doesn't exists");
        }
        return Optional.empty();

    }
}
