package com.learnjava8.com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        //System.out.println(groupByMarks());
        System.out.println(groupByCustomizeKey());

    }

    /**
     * This fn will use groupingBy terminal collectors fns and will group the students as "AVERAGE"
     * and "OUTSTANDING"
     * This will randomly pick the key values from the value marks and will group the items
     */
    public static Map<Integer,List<Students>> groupByMarks(){
         Map<Integer,List<Students>> collect = StudentInstace.getstudents()
                .stream()
                .collect(Collectors.groupingBy(students -> students.getMarks()));
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
                .collect(Collectors.groupingBy(students -> students.getMarks() > 600 ? "OUTSTANDING" : "AVERAGE"));
        return mapstr;
    }
}
