package org.example.abstractfactory;

public class CarnivorousFactory extends AnimalAbstractFactory{
    @Override
    Animals geFactory(String type) {
        Animals animals = null;
        if(type.equalsIgnoreCase("Lion")){
            animals = new CarnivorousLandAnimals();
        } else if (type.equalsIgnoreCase("Eagle")) {
            animals = new CarnivorousBirds();
        }
        animals.roars();
        return animals;
    }
}
