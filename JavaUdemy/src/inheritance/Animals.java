package inheritance;

public class Animals implements GenericLivingCreatureInterface,GenericLiveInterface {
    @Override
    public void walk() {
        System.out.println("walks on four feet");
    }

    @Override
    public void speak() {
        System.out.println("Can't speak in human understandable language ");
    }

    @Override
    public void breath() {
        System.out.println("They also breath " + GenericLivingCreatureInterface.breathO2);
    }

    @Override
    public void eat() {
        System.out.println("Eats anything");
    }
}
