package com.practice.service;

import com.practice.bean.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentInstace {

    public ArrayList<Students> getstudents(){
        Students student1 = new Students("Harmeet","7982195539","plot no91",890,Arrays.asList("gym","volleyball"));
        Students student2 = new Students("Rahul","7982177509","plot no94",900,Arrays.asList("gymnastic","cricket"));
        Students student3 = new Students("Amit","7892195509","plot no95",600,Arrays.asList("long jump","hockey"));
        Students student4 = new Students("Arshad","7988892509","plot no97",290,Arrays.asList("runnig","baseball"));
        Students student5 = new Students("Anil","7982120509","plot 09090",310,Arrays.asList("sky  diving","rugby"));

        ArrayList<Students> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));

        return students;
    }
}
