package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceFnExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,5,6);
        List<Integer> emptyintegerList = new ArrayList<>();
        System.out.println(printReducedValueUsingIdentity(integerList));
        Optional<Integer> integer = printReducedValueWithoutIdentity(emptyintegerList);
        if(integer.isPresent())
        {
            System.out.println("printReducedValueWithoutIdentity  "+integer.get());
        }else {
            System.out.println("Input list is empty ");
        }
        Optional<Students> optionalStudents = studentWithHighestMakrs();
        if(optionalStudents.isPresent()){
            System.out.println("highets marks gained by :"+ optionalStudents.get());
        }else{
            System.out.println("Input lis is empty ");
        }
        Optional<Integer> integer1 = printStudentNameWithMaxMarks(StudentInstace.getstudents());
        if(integer1.isPresent()){
            System.out.println("Max marks attained by a student : "+ integer1.get());
        }else{
        System.out.println("Input list is empty ");
        }

    }
    public static int printReducedValueUsingIdentity(List<Integer> inlist){
        //inlist.forEach(System.out::println);
        return inlist.stream()
                //1
                //2
                //3
                //4
                /**
                 * In 1st iteration
                 * a = 1(default value given ) , b = 1(first element from the list )
                 * in 2nd iteration
                 * a= 1(result  from the 1st iteration a*b ) , b = 2
                 * in 3rd iteration
                 * a=2(result from 2nd iteration a*b) , c = 3
                 * and soo on
                  */
                .reduce(0,(a,b)-> a+b);

    }
    public static Optional<Integer> printReducedValueWithoutIdentity(List<Integer> inlist){
        //inlist.forEach(System.out::println);
        return inlist.stream()
                //1
                //2
                //3
                //4
                .reduce((a,b)-> a+b); // this is going to return optional clss object

    }

    public static Optional<Integer> printStudentNameWithMaxMarks(List<Students> list){
            return list.stream() //Stream<Students>
                    .map(students -> students.getMarks()) // Stream<Integers>
                    //.reduce((a,b)->a>b?a:b);
                //.reduce((a,b)->Integer.max(a,b));
        .reduce((a,b)->Integer.min(a,b));

    }
    public static Optional<Students> studentWithHighestMakrs(){
        return StudentInstace.getstudents().stream()
                .reduce((s1,s2)->s1.getMarks()>s2.getMarks() ? s1:s2);

    }
}
