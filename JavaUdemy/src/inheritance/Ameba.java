package inheritance;

public class Ameba extends Animals{
    public static void main(String[] args) {
        Ameba a =new Ameba();
        a.breath();
        a.eat();
        System.out.println("-------------------------------------------------------");
        GenericLivingCreatureInterface g = new Human();  // this will call function defination froHuman
        g.breath();
        System.out.println("-------------------------------------------------------");
        GenericLivingCreatureInterface g1 = new Animals();
        g1.breath();
        System.out.println("-------------------------------------------------------");
        AbstractClass am = new Animals();
        am.type();
        am.chill();
    }
}
