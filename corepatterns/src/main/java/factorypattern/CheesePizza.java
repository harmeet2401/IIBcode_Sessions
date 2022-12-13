package factorypattern;

public class CheesePizza implements Pizza{
    @Override
    public void PreparePizza() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void BakePizza() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void CutPizza() {
        System.out.println("Cutting Cheese Pizza");
    }
}
