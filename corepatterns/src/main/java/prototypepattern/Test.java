package prototypepattern;

/**
 * Below example shows how we can clone the prototype object game1 to create a new
 * object game2 without setting Id and name
 * And we can see that hash codes are different so new object is created with same
 * attribute values
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("GOW");

        //using clone functions
        Game game2 = game1.clone();
        System.out.println(game1 +" hash values"+game1.hashCode());
        System.out.println(game2 +" hash values"+game2.hashCode());
    }
}
