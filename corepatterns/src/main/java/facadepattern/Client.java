package facadepattern;


/**
 * Now the client will use the facade class to place an order.
 */
public class Client {
    public static void main(String[] args) {
        facadeclass facadeclass = new facadeclass();
        System.out.println(facadeclass.orderDetails("Iphone 14"));
    }
}
