package inheritance;

public class Human  implements GenericLivingCreatureInterface ,GenericLiveInterface{
    public String name ;
    public int age;
    public String gender;


    public void run(){
        System.out.println(name+" : HUMANS CAN WALK ");
    }

    @Override
    public void walk() {
        System.out.println("walks on two feets");
    }

    public void speak(){
        System.out.println(name+" : HUMANS CAN SPEAK ");
    }

    @Override
    public void breath() {
        System.out.println("breath : "+ GenericLivingCreatureInterface.breathO2);
    }

    @Override
    public void eat() {
        System.out.println("eat vegies");
    }
}
