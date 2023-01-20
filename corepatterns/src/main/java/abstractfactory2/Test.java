package org.example.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AnimalAbstractFactory animalAbstractFactory = AnimalProducer.
                getFactoryClass("Herbivorous");
         animalAbstractFactory.geFactory("Elephant");

    }
}
