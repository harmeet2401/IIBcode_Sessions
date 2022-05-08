package com.learnjava8.streams;
import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Map method of streams api generally used to transform the stream to one type to another
 */
public class StreamsMapExample {
    public static void main(String[] args) {
        System.out.println("Address list : ");
        addressList().forEach(System.out::println);
        System.out.println("nameSet list : ");
        nameSet().forEach(System.out::println);
        System.out.println("mobSet list : ");
        mobSet().forEach(System.out::println);
        System.out.println("printStudentsFilterBymarks -------");
        printStudentsFilterBymarks().forEach(System.out::println);
    }
    public static List<String> addressList(){
        return StudentInstace.getstudents().stream() // will give Stream<Students>
                .map(Students::getAddress) // will give Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }
    public static Set<String> nameSet(){
        return  StudentInstace.getstudents().stream() // will give Stream<Students>
                .map(Students::getName) // will give Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
    public static List<Students> printStudentsFilterBymarks(){
        return StudentInstace.getstudents().stream()
                .filter(students -> students.getMarks()>500)
                .filter(students -> students.getActivities().stream().count()>2)
                .collect(Collectors.toList());

    }

    static Function<Students,String> function = (student)->{
        return student.getMobno().concat("+Mobile numbers").toUpperCase();
    };
    static Function<Students,String> function1 = (student)->{
        return student.getMobno().concat("+Mobile numbers").toUpperCase();
    };
    public static Set<String> mobSet(){
        Set<String> collect = StudentInstace.getstudents().stream()
                .map(function1)
                .collect(Collectors.toSet());
        return collect;
    }



}
