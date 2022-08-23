package com.learnjava8.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalTimeToStringViceVersaExample {
    public static void main(String[] args) {
        parseLocalTime();
        formatLocalTimeToString();
    }
    public static void parseLocalTime(){
        String time  = "13:00";
        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime : "+ localTime);
        String time1  = "13*00";
        LocalTime localTime1 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH*mm"));
        System.out.println("localTime : "+ localTime1);
        String time2  = "13|00";
        LocalTime localTime2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH|mm"));
        System.out.println("localTime : "+ localTime2);


    }
    public static void formatLocalTimeToString(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH@mm");
        LocalTime localTime = LocalTime.now();
        String formattedTime = localTime.format(dateTimeFormatter);
        System.out.println("formattedTime : "+ formattedTime);

    }
}
