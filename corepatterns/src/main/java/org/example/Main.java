package org.example;

import singletonclasses.DateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ---- Main Class ----");
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();
        System.out.println(dateUtil1.hashCode());
        System.out.println(dateUtil2.hashCode());
        System.out.println(dateUtil1 == dateUtil2);
        //DateUtil d = new DateUtil(); will not be able to do that because constructor is
        // private and made the class singleton

    }
}