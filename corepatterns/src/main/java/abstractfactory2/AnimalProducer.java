package org.example.abstractfactory;

public class AnimalProducer {
    public static AnimalAbstractFactory  getFactoryClass(String factoryType){
        AnimalAbstractFactory animalAbstractFactory = null;
            if(factoryType.equalsIgnoreCase("Herbivorous")){
                animalAbstractFactory = new HerbivorousFactory();
            } else if (factoryType.equalsIgnoreCase("Carnivorous")) {
                animalAbstractFactory = new  CarnivorousFactory();
            }
        return animalAbstractFactory;
    }
}
