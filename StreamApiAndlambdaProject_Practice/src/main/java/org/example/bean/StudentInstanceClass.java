package org.example.bean;

import java.util.Arrays;
import java.util.List;

public class StudentInstanceClass {
    public static List<Student> getStudents(){
        List<Student> list = Arrays.asList(
                new Student("HARMEET","IT",40,Arrays.asList("Gyming","Football","Gaining"),7),
                new Student("RAHUL","CSE",30,Arrays.asList("Running","Cricket","Football","Gaining"),9),
                new Student("MIKE","IT",80,Arrays.asList("Reading","Long-jump","Football"),10),
                new Student("STEVE","CSE",10,Arrays.asList("Hiking","Paragliding"),11),
                new Student("JORDAN","COMS",20,Arrays.asList("Gyming","SonaSlim"),12),
                new Student("GORDAN","COMS",20,Arrays.asList("Gyming","SonaSlim"),12)
        );
        return list;
    }
}
