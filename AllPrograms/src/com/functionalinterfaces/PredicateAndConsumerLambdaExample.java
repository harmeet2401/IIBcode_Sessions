package com.functionalinterfaces;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.functionalinterfaces.bean.Students;
import com.functionalinterfaces.service.StudentInstace;

public class PredicateAndConsumerLambdaExample {
    //Predicate<Students> p1 = (student)-> student.getMarks()>=300;
    //Predicate<Students> p2 = (student)->activitesCount(student) > 2;
    BiPredicate<Integer,Integer> biPredicate = (marks,actcount)-> marks>=300&&actcount>2; // this is replacing above two LOC
    BiConsumer<String,Students> biConsumer = (name,student)->{
        if(biPredicate.test(student.getMarks(),activitesCount(student))){
            System.out.println(name+"  : "+student.getActivities());
        }
    };
    Consumer<Students> consumer = (student)-> {
        biConsumer.accept(student.getName(),student);

        };
     public static void main(String[] args) {
        List<Students> studentsList = new StudentInstace().getstudents();
        new PredicateAndConsumerLambdaExample().filterStudents(studentsList);

    }
    public void filterStudents(List<Students> students){
            students.forEach(consumer);
    }
    public int activitesCount(Students student){
        int count = (int) student.getActivities().stream().count();
        //System.out.println("Students name :"+ student.getName() +" : count: "+count);
         return count;
    }
}
