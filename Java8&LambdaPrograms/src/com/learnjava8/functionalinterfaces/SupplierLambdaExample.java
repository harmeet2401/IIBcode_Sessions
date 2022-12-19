package com.learnjava8.functionalinterfaces;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Supplier is used to return anything without giving it any parameters
 */
public class SupplierLambdaExample {
    static Supplier<String> stringSupplier = ()->{return "Mytest string";};
    static Supplier<Students> studentsSupplier = ()->{
        return new Students("Guju","7982195539","plot no91",890, Arrays.asList("gym","volleyball","singing"));
    };
    static Supplier<List<Students>> listSupplier = ()->{
        return new StudentInstace().getstudents();

    };
    static Supplier<Map<String , String>> mapSupplier = ()->{
        Map<String,String> map = new HashMap<>();
		Map<String,Student> map1 = new HashMap<>();
        List<Students> list = new StudentInstace().getstudents();
        list.forEach(student -> map.put(student.getName(),student.getAddress()));
		list.forEach(student -> map1.put(student.getName().toUpperCase(),student));
        return map;
    };
    public static void main(String[] args) {
        System.out.println(stringSupplier.get()+"\n");
        System.out.println("Student is : "+studentsSupplier.get().getActivities()+"\n");
        System.out.println("Students aee ::"+listSupplier.get()+"\n");
        System.out.println("Students in hashmap : "+ mapSupplier.get());
    }
}
