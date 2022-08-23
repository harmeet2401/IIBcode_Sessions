package com.learnjava8.comparator;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorClassExample {
    static Consumer<Students> consumer = (s)->{
        System.out.println(s);
    };

    public static void main(String[] args) {
        //sortByName();
        //sortByMarks();
//        compatorThenComparing();
        compatorForNullElements();
    }
    public static void sortByName(){
        List<Students> list = StudentInstace.getstudents();

        list.sort(Comparator.comparing(Students::getName));
        list.forEach(consumer);
    }
    public static void sortByMarks(){
        List<Students> list = StudentInstace.getstudents();

        list.sort(Comparator.comparing(Students::getMarks));
        list.forEach(consumer);
    }
    public static void compatorThenComparing(){
        List<Students> list = StudentInstace.getstudents();

        list.sort(Comparator.comparing(Students::getMarks).thenComparing(Comparator.comparing(Students::getMarks)));
        list.forEach(consumer);
    }
    public static void compatorForNullElements(){
        List<Students> list = StudentInstace.getstudents();

        list.sort(Comparator.nullsFirst(Comparator.comparing(Students::getName)));
        list.forEach(consumer);
    }

}
