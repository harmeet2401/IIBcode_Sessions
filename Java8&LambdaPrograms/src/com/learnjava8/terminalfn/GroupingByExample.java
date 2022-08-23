package com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupingByExample {
    public static void main(String[] args) {
        //System.out.println(groupByMarks());
        //System.out.println(groupByCustomizeKey());
       // groupingBy_1();
        //groupingBy_2();
        //groupingBy_3();
        groupingBy_4();

    }

    /**
     * This fn will use groupingBy terminal collectors fns and will group the students as "AVERAGE"
     * and "OUTSTANDING"
     * This will randomly pick the key values from the value marks and will group the items
     */
    public static Map<Integer,List<Students>> groupByMarks(){
         Map<Integer,List<Students>> collect = StudentInstace.getstudents()
                .stream()
                .collect(groupingBy(students -> students.getMarks()));
         return collect;
    }

    /**
     * below fn also uses the same groupingBY fn but we customizes the Key values instead of letting it using the d
     * default ones.
     * @return
     */
    public static Map<String,List<Students>> groupByCustomizeKey(){
        Map<String, List<Students>> mapstr = StudentInstace.getstudents()
                .stream()
                .collect(groupingBy(students -> students.getMarks() > 600 ? "OUTSTANDING" : "AVERAGE"));
        return mapstr;
    }

    /**
     * This fn have two level grouping
     */
    public  static void groupingBy_1()
    {
        Map<Integer, Map<String, List<Students>>> map  = StudentInstace.getstudents()
                .stream()
                .collect(groupingBy(Students::getMarks,groupingBy(Students::getName)));
        System.out.println(map);
    }
    /**
     * This fn have two level grouping
     */
    public  static void groupingBy_2()
    {
        Map<String, Integer> map  = StudentInstace.getstudents()
                .stream()
                .collect(groupingBy(Students::getName,Collectors.summingInt(Students::getNotebooks)));
        System.out.println(map);

    }
    /**
     * This fn have three level grouping
     */
    public  static void groupingBy_3()
    {
        Map<Integer, List<Students>> map  = StudentInstace.getstudents()
                .stream()
                .filter(students -> students.getMarks()>-500)
                .collect(groupingBy(Students::getNotebooks, LinkedHashMap::new,Collectors.toList()));
        System.out.println(map);

    }
    /**
     * This fn have three level grouping
     */
    public  static void groupingBy_4()
    {
        Map<Integer, Students> map  = StudentInstace.getstudents()
                .stream()
                .filter(students -> students.getMarks()>=500)
                .collect(groupingBy(Students::getNotebooks,collectingAndThen(maxBy(Comparator.comparing(Students::getMarks)),Optional::get)));
        System.out.println(map);

        Map<Integer, Students> map2  = StudentInstace.getstudents()
                .stream()
                .filter(students -> students.getMarks()>=500)
                .collect(groupingBy(Students::getNotebooks,collectingAndThen(minBy(Comparator.comparing(Students::getMarks)),Optional::get)));
        System.out.println(map2);

    }

}
