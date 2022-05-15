package com.learnjava8.com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.stream.Collectors;

public class CollectCountingExmaple {
    public static void main(String[] args) {
        System.out.println(counting());
        System.out.println(joiningFilter());
    }
    public static Long counting (){
        return StudentInstace.getstudents()
                .stream()
                .filter(students -> students.getMarks()>300)
                .collect(Collectors.counting());
    }
    public static String joiningFilter (){
        return StudentInstace.getstudents()
                .stream()
                .filter(students -> students.getMarks()>600)
                .map(Students::getName)
                .collect(Collectors.joining("\n","{","}"));
    }
}
