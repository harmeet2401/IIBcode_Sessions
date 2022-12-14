package flyweightpattern;

public abstract class Human {
    void eats (){
        System.out.println("eats wheat");

    }
    void breaths (){
        System.out.println("Breaths air");
    }

    abstract void weights(int w);
}
