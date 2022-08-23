package com.learnjava8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        //First create the instance of the localdateTime objecs
        LocalDateTime localDateTime  = LocalDateTime.now();
        System.out.println("localDateTime : "+ localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime1 : "+ localDateTime1);

        // Then get the value of localdatetime instance
        System.out.println("getDayOfMonth : "+ localDateTime.getDayOfMonth());
        System.out.println("getDayOfMonth : "+ localDateTime.getMonth());
        System.out.println("getDayOfMonth : "+ localDateTime.getHour());
        System.out.println("getDayOfMonth : "+ localDateTime.getMonthValue());
        System.out.println("getDayOfMonth : "+ localDateTime.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("getDayOfMonth : "+ localDateTime.getChronology());


        //Then modifying the values of localdatetime instance s.

        System.out.println(localDateTime.plus(1, ChronoUnit.DAYS));
        System.out.println(localDateTime.minus(1, ChronoUnit.DAYS));
        System.out.println(localDateTime.minusDays(1));
        System.out.println(localDateTime.minusMinutes(1));

        //Convert the Localdate to localDatetime objects
        LocalDate localDate = LocalDate.now();
        System.out.println("atTime: "+ localDate.atTime(LocalTime.now()));

        LocalTime localTime = LocalTime.now();
        System.out.println("atDate : "+ localTime.atDate(localDate));

        System.out.println("Converting to localdate : "+ localDateTime.toLocalDate());
        System.out.println("Converting to localtime : "+ localDateTime.toLocalTime());

    }
}
