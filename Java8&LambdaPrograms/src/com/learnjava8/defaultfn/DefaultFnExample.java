package com.learnjava8.defaultfn;

import java.util.*;

public class DefaultFnExample {

    /**
     * Is used to sort the list of string in natural and ascending order.
     * Using java 1.8 List interface default sort fn
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Aman","Preet","Adam","Zee","Bobby");
        /**
         * using approach prior java 1.8
         */
        Collections.sort(list);
        System.out.println("Sorting using old approach : "+ list);

        /**
         * Using the default fn of List interface class
         */
        List<String> list1 = Arrays.asList("Aman","Kree","Adam","Ieee","Boby");
        list1.sort(Comparator.naturalOrder());
        System.out.println("Using new approach for sorting : "+ list1 );

        List<String> list2 = Arrays.asList("Aman","Kree","Adam","Ieee","Boby");
        list2.sort(Comparator.reverseOrder());
        System.out.println("Using new approach for sorting reverse Order: "+ list2 );



    }
}
