package org.example.abstractfactory;

public class HerbivorousLandAnimal implements Animals{
    @Override
    public void roars() {
        System.out.println("Herbivours eats plant and roars softly");
    }
}
