package com.learnjava8.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConvertLocalDateTimeToStringViceVersa {
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
    public static void parseLocalDateTime(){
        String datetime = "2017-09-21T22:09:11";
        LocalDateTime localDateTime = LocalDateTime.parse(datetime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime : "+ localDateTime);

        String datetime1 = "2017-09-21T22*09*11";
        LocalDateTime localDateTime1 = LocalDateTime.parse(datetime1,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH*mm*ss"));
        System.out.println("localDateTime1 : "+ localDateTime1);

        String datetime2 = "2017-09-21@22|09|11";
        LocalDateTime localDateTime2 = LocalDateTime.parse(datetime2,
                DateTimeFormatter.ofPattern("yyyy-MM-dd'@'HH|mm|ss"));
        System.out.println("localDateTime1 : "+ localDateTime2);

    }
    public static void formatLocalDateTime(){
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("yyyy-MM-dd'@'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("formattedDateTime : "+ formattedDateTime);
    }
}
