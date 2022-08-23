package com.learnjava8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * below class shows how we parsed the incoming string date to a localDate
 */
public class StringDateToLocalDateExample {
    public static void main(String[] args) {
        parsingStringDateToLocalDate(); // cnverts the string date to Localdate objects
        formattLocalDateToCustomStringdate(); // Converts the localdate to String object
    }
    public static void parsingStringDateToLocalDate(){
        String date = "2019-02-23";
        LocalDate localDate = LocalDate.parse(date);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate : "+ localDate);
        System.out.println("localDate1 : "+ localDate1);

        String date1 = "20111203";
        //LocalDate localDate2 = LocalDate.parse(date1);
        LocalDate localDate3 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        //System.out.println("localDate : "+ localDate2);
        System.out.println("localDate1 : "+ localDate3);

        //Custom dates like instead of - or / we have * or |
        String date2 = "2011*12*03";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate2 = LocalDate.parse(date2,dateTimeFormatter);
        System.out.println("localDate2 : "+ localDate2);



    }

    public static void formattLocalDateToCustomStringdate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
       String formatteddate =  localDate.format(dateTimeFormatter);
        System.out.println("formatteddate : "+ formatteddate);
    }
}
