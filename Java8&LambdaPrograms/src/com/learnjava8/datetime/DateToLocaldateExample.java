package com.learnjava8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocaldateExample {
    public static void main(String[] args) {
        //convert java.util.Date to localdate and vice versa
        Date date = new Date();
        System.out.println("date : "+ date);
        LocalDate localDate1 = date.toInstant().atZone(ZoneId.of("Japan")).toLocalDate();
        System.out.println("localdate1 : :" +localDate1);

        // convert java.sql.Date to localdate
        java.sql.Date date1 = java.sql.Date.valueOf(localDate1);
        System.out.println("date1 : "+date1);




    }
}
