package org.example.abstractfactory;

public class HerbivorousFactory extends AnimalAbstractFactory {
    @Override
    Animals geFactory(String type) {
        Animals animals = null;
        if(type.equalsIgnoreCase("Elephant")){
            animals = new HerbivorousLandAnimal();
        } else if (type.equalsIgnoreCase("Peacock")) {
            animals = new HerbivorousBirds();
        }
        animals.roars();
        return animals;
    }
}
