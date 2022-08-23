package com.learnjava8.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTImeExample {
    public static void main(String[] args) {

        localDateExample();
    }

    public static void localDateExample(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : "+ zonedDateTime);
        System.out.println("Offset : "+ zonedDateTime.getOffset());
        System.out.println("Zone : "+zonedDateTime.getZone());
        System.out.println("Zone id : "+ zonedDateTime.getZone().getId());
        ZoneId.getAvailableZoneIds()
                .stream()
                .forEach(z-> System.out.println(z));
        //.forEach(z-> System.out.println(z));
        int count = (int) ZoneId.getAvailableZoneIds()
                .stream()
                .count();
        //.forEach(z-> System.out.println(z));
        System.out.println("Number of availebl zones : "+ count);
        System.out.println("Date Time zone for Africa/Timbuktu : "
                +ZonedDateTime.now(ZoneId.of("Africa/Timbuktu")));
        System.out.println("Date Time zone for Hongkong : "
                +ZonedDateTime.now(ZoneId.of("Hongkong")));

        // localdatetime using the ZoneID
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Japan"));
        System.out.println(localDateTime);

        // Convert the localdateTime and Instant  to ZonedDateTIme
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("localDateTime1 : "+ localDateTime1);
        /*converting localdatetime to zonedDatetime*/
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("Japan"));
        System.out.println("zonedDateTime1 : "+zonedDateTime1);
        /*Converting instant to zoneddatetime*/
        ZonedDateTime zonedDateTime2  = Instant.now().atZone(ZoneId.of("Japan"));
        System.out.println("zonedDateTime2 : "+zonedDateTime2);
    }
}
