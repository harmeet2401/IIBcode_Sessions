package com.learnjava8.streams;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

public class MoreStreamFunctionsExample {
    public static void main(String[] args) {
        System.out.println("Get the students activities in list of String List : "+getStudentsActivitiesInListOfStringList());
        System.out.println("Get the students activities in list of String  : "+getStudentsActivitiesInListOfString());
        System.out.println("Get the Unique activities in list of String in sorted order : "+getStudentsActivitiesInListOfStringDistinct());
        System.out.println("COunt of activitues " +StudentInstace.getstudents().stream()  // stream of students Stream<Students>
                .map(Students::getActivities) // stream of List of activities Stream<List<activities>>
                .flatMap(List::stream) // Stream of String Stream<String>
                .distinct()
                .count());
    }
    public  static List<List<String>> getStudentsActivitiesInListOfStringList()
    {
        return StudentInstace.getstudents().stream()  // stream of students Stream<Students>
                .map(Students::getActivities) // stream of List of activities Stream<List<activities>>
                //.flatMap(List::stream) // Stream of String Stream<String>
                .collect(Collectors.toList());
    }
    public  static List<String> getStudentsActivitiesInListOfString()
    {
        return StudentInstace.getstudents().stream()  // stream of students Stream<Students>
                .map(Students::getActivities) // stream of List of activities Stream<List<activities>>
                .flatMap(List::stream) // Stream of String Stream<String>
                .collect(Collectors.toList());
    }
    public  static List<String> getStudentsActivitiesInListOfStringDistinct()
    {
        return StudentInstace.getstudents().stream()  // stream of students Stream<Students>
                .map(Students::getActivities) // stream of List of activities Stream<List<activities>>
                .flatMap(List::stream) // Stream of String Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


}
