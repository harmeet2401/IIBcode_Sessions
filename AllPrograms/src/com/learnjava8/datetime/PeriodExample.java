package com.learnjava8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        // first create the period instances
        LocalDate localDate = LocalDate.of(2022,01,20);
        LocalDate localDate1 = LocalDate.of(2023,12,30);
        Period period = localDate.until(localDate1); // localdate1 should be the future date
        Period period1 = Period.ofYears(20);
        Period period2 = Period.between(localDate,localDate1);  // this will give you the duration differenc ei between the two loacldate instances

        //then get the values from it
        System.out.println("getDays : "+  period.getDays() + " "+period.getYears() + " " +period.getMonths() );
        System.out.println("getDays ofYears: "+  period1.getYears());
        System.out.println("getDays ofYears using between : "+  period2.getYears());

    }
}
