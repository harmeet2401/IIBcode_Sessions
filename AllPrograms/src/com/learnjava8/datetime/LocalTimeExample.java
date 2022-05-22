package com.learnjava8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        // First step is to create local time
        LocalTime localTime = LocalTime.now();
        System.out.println("localtime : "+localTime);
        LocalTime localTime1 = LocalTime.of(03,22);
        System.out.println("localtime1 : "+localTime1);
        LocalTime localTime2 = LocalTime.of(03,23,40);
        System.out.println("localtime2 : "+localTime2);
        LocalTime localTime3 = LocalTime.of(23,03,59,999929929);
        System.out.println("localtime3 : "+localTime3);

        // Second get the value out of the local time .
        System.out.println("getHour : "+ localTime.getHour());
        System.out.println("getMinute : "+ localTime.getMinute());
        System.out.println("getSecond : "+ localTime.getSecond());
        System.out.println("getSecond : "+ localTime.get(ChronoField.SECOND_OF_MINUTE));

        // third update the localtime .
        System.out.println("ChronoUnit.HOURS : "+ localTime.plus(1, ChronoUnit.HOURS));
        System.out.println("ChronoUnit.MICROS : "+ localTime.plus(1, ChronoUnit.MICROS));
        System.out.println("LocalTime.MIDNIGHT : "+ localTime.with(LocalTime.MIDNIGHT));
        System.out.println("ChronoField.SECOND_OF_MINUTE : "+ localTime.with(ChronoField.SECOND_OF_MINUTE,4));

    }
}
