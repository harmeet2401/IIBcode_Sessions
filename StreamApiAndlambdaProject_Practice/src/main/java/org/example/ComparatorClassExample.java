package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorClassExample implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        int i = 0 ;
        int j = 0;
        ComparatorClassExample comparatorClassExample = new ComparatorClassExample();
        System.out.println(comparatorClassExample.compare(i,j));
        Comparator<Integer> comparator = (i1,i2)-> {
            int i3 = i1.compareTo(i2);
            return i3;
        };
        System.out.println(comparator.compare(i,j));

        List<Integer> list = Arrays.asList(1,2,5,6,7,8,9,1,2);
        System.out.println("Reversed order : "+ list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
        System.out.println("Natural order : "+ list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()));
        list.stream()
                .allMatch((e)->e.equals(1)); }
}
