package com.learnjava8.numericstreams;

import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class MapToObjectsExample {
    public static void main(String[] args) {
        System.out.println("MaptoObjects : "+ mapToObjects());
        OptionalDouble optionalDouble = maptoOptionalDouble();
        if (optionalDouble.isPresent())
        {
            System.out.println("maptoOptionalDouble : "+ maptoOptionalDouble().getAsDouble());
        }
        System.out.println("MaptoDouble : "+ maptoDouble());

    }
    public static List<Integer> mapToObjects(){
        return  IntStream.rangeClosed(1,10)
                .mapToObj((i)->new Integer(i))
                .collect(Collectors.toList());
    }
    public static OptionalDouble maptoOptionalDouble(){
        return  IntStream.rangeClosed(1,10)
                .mapToLong((i)->i)
                .average();
    }

    public static double maptoDouble(){
        return  IntStream.rangeClosed(1,10)
                .mapToDouble((i)->i)
                .sum();
    }

}
