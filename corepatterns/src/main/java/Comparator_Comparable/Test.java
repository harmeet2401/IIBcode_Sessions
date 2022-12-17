package Comparator_Comparable;

import java.util.Comparator;

/**
 * Comparator is used to compare two independent objects
 * Comparable is used to compare current object and other object
 */
public class Test {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(80);
        person1.setName("Harmeet");
        person1.setGender("M");
        Person person2 = new Person();
        person2.setAge(19);
        person2.setName("Jeet");
        person2.setGender("M");
        Comparator<Person> personComparator = new PersonComparator();
        System.out.println("Comparator : ---"+ personComparator.compare(person1,person2));

        System.out.println("Comparable : ---"+person1.compareTo(person2));


    }

}
