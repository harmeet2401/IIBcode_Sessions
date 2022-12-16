package prototypepattern;

/**
 * Below example shows how we can clone the prototype object game1 to create a new
 * object game2 without setting Id and name
 * And we can see that hash codes are different so new object is created with same
 * attribute values , as it is a shallow copy which is the default behaviour of the
 * clone function it can copy same reference pointer and can have same hashcode.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("GOW");
        game1.setMembership(new Membership());

        //using clone functions
        Game game2 = game1.clone();
        Game game3 = new Game(game1);
        System.out.println(game1 +" hash values"+game1.hashCode());
        System.out.println(game2 +" hash values"+game2.hashCode());
        System.out.println(game3 +" hash values"+game3.hashCode());
    }
}
