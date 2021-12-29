package inheritance;

public interface GenericLivingCreatureInterface {
    public  static final String breathO2 = "Oxygen";
    public  static final boolean breathair = true;
    public  static final String eyecolour = "black";

    public abstract void walk();
    public abstract void speak();
    public abstract void breath();
    public abstract void eat();
    default void check(){
        System.out.println("new function added");
    }





}
