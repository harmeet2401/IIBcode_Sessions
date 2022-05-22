package com.learnjava8.datetime;

import javax.sound.midi.Soundbank;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());

        Instant instant1 = Instant.now();
        System.out.println(instant1.getEpochSecond());


    }
}
