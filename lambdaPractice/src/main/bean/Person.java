package main.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements  Comparable<Person> ,testinterface{
    private String name;
    private String address;
    private int id;



    public Person(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;


    }

    /**
     *  The hashcode and equals methods should be in sync means if equals are using id , name and address to check the equals and
     *  if all are same then objects are same. So the hashcode should be same , so hashcode will also include id , address and name to generate it.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        List<Integer> list = new ArrayList<>();
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(address, person.address);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public void c() {

    }
}
