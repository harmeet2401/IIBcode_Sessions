package com.learnjava8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        Duration duration = Duration.ofDays(10);
        System.out.println("Second in a day : "+ duration.getSeconds());

        LocalTime localTime = LocalTime.of(21,23);
        LocalTime localTime1 = LocalTime.of(22,23);
        long duration1 = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("Minutes in time differnce of loc1 and loc : "+duration1 );

        Duration duration2 = Duration.between(localTime,localTime1);
        System.out.println("Diff using between fn : "+duration2.getSeconds());
    }
}
