package com.learnjava8.datetime;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class LocalDateExample {
    public static void main(String[] args) {
        /*LocalDate localDate = LocalDate.now();
        System.out.println("localDate : "+ localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : "+ localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : "+ localDateTime);*/
        //LocalDateMethods();
        modifyingDates();

    }
    public static void LocalDateMethods(){
        LocalDate localDate = LocalDate.now();
        System.out.println("localdate :  "+ localDate);
        System.out.println("day of the Era : " +localDate.get(ChronoField.YEAR_OF_ERA));
        System.out.println("Month using getmonth : "+localDate.getMonth());
        System.out.println("Month using get month  value :  "+ localDate.getMonthValue());
        localDate.getYear();
        localDate.getDayOfYear();
        localDate.getDayOfMonth();
        localDate.atStartOfDay();
    }
    public static void modifyingDates(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plus(2,ChronoUnit.DAYS);
        System.out.println("Localdate instance : "+ localDate);
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.plusWeeks(2));
        System.out.println(localDate.plusYears(2));
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.minusDays(22));
        System.out.println(localDate.withDayOfMonth(18));
        System.out.println("Day of the month " +
                LocalDate.of(1992,01,24).getDayOfWeek());
        System.out.println("Year is leap year :  " +
                LocalDate.of(1992,01,24).isLeapYear());
        System.out.println("Year is leap year :  " +
                LocalDate.of(1993,01,24).isLeapYear());

        System.out.println("Subtract :  year :  "+ localDate.minus(1, ChronoUnit.YEARS));
        System.out.println("is localdate equals to localdate1 : "+localDate.isEqual(localDate1));
        System.out.println("is localdate is after to localdate1 : "+localDate.isAfter(localDate1));
        System.out.println("is localdate is before to localdate1 : "+localDate.isBefore(localDate1));
        System.out.println("is localdate supports YEAR : "+localDate.isSupported(ChronoUnit.YEARS));


    }
}
