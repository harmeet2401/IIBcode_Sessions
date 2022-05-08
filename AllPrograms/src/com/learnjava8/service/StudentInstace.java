package com.learnjava8.service;
import com.learnjava8.bean.Students;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentInstace {

    public static ArrayList<Students> getstudents(){
        Students student1 = new Students("Harmeet","7982195539","plot no91",890,Arrays.asList("gym","volleyball","singing"),12);
        Students student2 = new Students("Rahul","7982177509","plot no94",900,Arrays.asList("gymnastic","cricket"),11);
        Students student3 = new Students("Amit","7892195509","plot no95",600,Arrays.asList("long jump","hockey","Running"),10);
        Students student4 = new Students("Arshad","7988892509","plot no97",290,Arrays.asList("runnig","baseball"),9);
        Students student5 = new Students("Anil","7982120509","plot 09090",310,Arrays.asList("sky  diving","rugby","Typing"),20);
        Students student6 = new Students("sim","7988892509","plot no97",290,Arrays.asList("runnig","baseball"),13);
        Students student7 = new Students("John","7982120509","plot 09090",110,Arrays.asList("sky  diving","rugby","Acting"),15);
        Students student8 = new Students("ahmed","7988892509","plot no97",490,Arrays.asList("runnig","baseball"),16);
        Students student9 = new Students("Gaurav","7982120509","plot 09090",1000,Arrays.asList("sky  diving","rugby"),17);

        ArrayList<Students> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9));

        return students;
    }

   
}
