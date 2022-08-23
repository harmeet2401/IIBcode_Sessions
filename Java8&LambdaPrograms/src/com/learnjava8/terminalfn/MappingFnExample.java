package com.learnjava8.terminalfn;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class MappingFnExample {
    public static void main(String[] args) {

        /**
         * below LOC actually reduce one line of code where we used map to get the name and then use
         * collect fn to collect the list
         */
        List<String> collect = StudentInstace.getstudents()
                .stream()
                .collect(mapping(Students::getName, toList()));

        /**
         * below LOC is one line more then above approach.
         */
        List<String> collect2 = StudentInstace.getstudents()
                .stream()
                .map(Students::getName)
                .collect(toList());

        collect.forEach(System.out::println);
    }
}
