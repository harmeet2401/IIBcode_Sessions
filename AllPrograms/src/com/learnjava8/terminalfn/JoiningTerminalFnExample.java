package com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class JoiningTerminalFnExample {
    public static void main(String[] args) {
        System.out.println(joining_1());
    }
    public static String joining_1(){
        return StudentInstace.getstudents()
                .stream()
                .map(Students::getName)
                .collect(joining(",","[","]"));
    }

}
