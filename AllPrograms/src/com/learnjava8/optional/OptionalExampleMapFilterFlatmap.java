package com.learnjava8.optional;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExampleMapFilterFlatmap {
    public static void main(String[] args) {
        filterMethod();
        mapMethod();
        flatMapMethod();
    }
    public static void filterMethod(){
        Optional<Students> optional = Optional.ofNullable(StudentInstace.supplier.get());
        optional.
        filter(students -> students.getMarks()>=500)
        .ifPresent((s)->{
            System.out.println("Name : "+s.getName()+ "," +"Mobile number : "+s.getMobno());
        });
    }
    public static void mapMethod(){
        Optional<Students> optional = Optional.ofNullable(StudentInstace.supplier.get());
        optional.
                filter(students -> students.getMarks()>=500)
                .map(students -> students.getMobno())
                .ifPresent((s)->{
                    System.out.println("+91-"+s);
                })
        ;
    }
    public static void flatMapMethod(){
        Optional<Students> optional = Optional.ofNullable(StudentInstace.supplier.get());
        optional.
                filter(students -> students.getMarks()>=500)
                .flatMap(students -> students.getBicycle())
                .ifPresent((s)->{
                    System.out.println("Model-"+s.getModelname());
                })
        ;
    }
}

