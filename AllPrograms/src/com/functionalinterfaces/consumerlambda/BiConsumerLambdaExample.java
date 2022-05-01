package com.functionalinterfaces.consumerlambda;

import com.functionalinterfaces.bean.Students;
import com.functionalinterfaces.service.StudentInstace;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * Ths class shows the BiConsumer example to accept two paramters as an input.
 */
public class BiConsumerLambdaExample {
    public static void main(String[] args) {
        System.out.println("Simple example to mltiple and divide two number using BiConsumer interface.");
        mathsOperations();
        System.out.println(" ");
        System.out.println("Students class operations :-------------------- ");
        studentsOperation();
    }
    public static void mathsOperations(){
        BiConsumer<Integer,Integer> biConsumer1 = (a1,b1)->{
            System.out.println("Multiple the numbers : "+ a1*b1);
        };
        BiConsumer<Integer,Integer> biConsumer2 = (a2,b2)->{
            System.out.println("Divide the numbers : "+ a2/b2);
        };
        biConsumer1.andThen(biConsumer2).accept(10,2);
    }
    public static void studentsOperation(){

        List<Students> studentsList = new StudentInstace().getstudents();

        BiConsumer<String,Students> biConsumerStudents = (name,student)->{
            System.out.println(name + " :  " + student.getActivities());
        };

        studentsList.forEach(student -> {
            biConsumerStudents.accept(student.getName(),student);
        });
    }
}
