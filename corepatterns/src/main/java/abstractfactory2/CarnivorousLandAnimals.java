package org.example.abstractfactory;

public class CarnivorousLandAnimals implements Animals{
    @Override
    public void roars() {
        System.out.println("Carnivours eat meat and do strong roars");
    }
}
