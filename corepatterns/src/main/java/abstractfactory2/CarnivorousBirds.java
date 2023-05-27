package org.example.abstractfactory;

public class CarnivorousBirds implements Animals{
    @Override
    public void roars() {
        System.out.println("Carnivour birds eat fish and do rere");
    }
}
