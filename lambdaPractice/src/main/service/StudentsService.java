package main.service;

import main.bean.Students;

import java.util.Arrays;
import java.util.List;

public class StudentsService {

     public static List<Students> getStudents(){
            List<Students>  studentsList = Arrays.asList(new Students("harmeet","pot 90","IT",12,10),
                    new Students("Gerry","pot 1991","CSE",13,32),
                    new Students("Drake","House 1900","ELEC",14,50),
                    new Students("Gevin","pot 90 wz 090","IT-1",15,60),
                    new Students("Zesi","pot 7788 yhhjj","I2",16,70),
                    new Students("Steph","666 rtsg","CSE-2",17,39));

        return studentsList;
    }
    public static List<Students> getStudents_first(Students st){
        List<Students>  studentsList = Arrays.asList(new Students("harmeet","pot 90","IT",12,10),
                new Students("Gerry","pot 1991","CSE",13,32),
                new Students("Drake","House 1900","ELEC",14,50),
                new Students("Gevin","pot 90 wz 090","IT-1",15,60),
                new Students("Zesi","pot 7788 yhhjj","I2",16,70),
                new Students("Steph","666 rtsg","CSE-2",17,39));

        return studentsList;
    }


}
