package com.learnjava8.optional;

import com.learnjava8.bean.Students;
import com.learnjava8.service.StudentInstace;

import java.util.Optional;

public class OptionalorElseGetThrow {
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }

    /**
     * This function shows how the orElse is used to return a default value in case  the optional
     * object is null or either the name is null
     * @return
     */
    public static  String optionalOrElse() {
        Optional<Students> optionalStudents = Optional.ofNullable(StudentInstace.supplier.get());
        return optionalStudents.map(Students::getName).orElse("Default name ");
    }

    /**
     * This function shows how the orElseGet is used to return a default value in case  the optional
     * object is null or either the name is null . Difference is we are using supplier as a parameter
     * @return
     */
    public static  String optionalOrElseGet() {
        Optional<Students> optionalStudents = Optional.ofNullable(StudentInstace.supplier.get());
        return optionalStudents.map(Students::getName).orElseGet(StudentInstace.supplierName);
    }

    /**
     * This function shows how the orElseThrow is used to return an exception in case  the optional
     * object is null or either the name is null . Difference is we are using supplier as a parameter
     * @return
     */
    public static  String optionalOrElseThrow() {
        Optional<Students> optionalStudents = Optional.ofNullable(StudentInstace.supplier.get());
        return optionalStudents.map(Students::getName).orElseThrow(StudentInstace.supplierException);
    }
}
