package com.learnjava8.optional;

import java.util.Locale;
import java.util.Optional;

public class DiffOptionalisPresentIfPresent {
    public static void main(String[] args) {
        Optional<String > optionalS = Optional.ofNullable(null);
        System.out.println(optionalS.isPresent());
        if(optionalS.isPresent()){
            System.out.println("Value is available");
        }else {
            System.out.println("Value is not available");
        }

        //optionalS.ifPresent(String::toUpperCase);
        // So ifPresent will do the thing that above if else is doing using isPresent
        optionalS.ifPresent(s->{
            System.out.println(s.toLowerCase().concat("  : - Testing value "));
        });

    }
}
