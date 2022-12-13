package factorypattern;

public class Order {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.OrderPizza("Chicken");
    }
}
