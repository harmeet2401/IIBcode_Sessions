package factorypattern;

public class ChickenPizza implements Pizza{
    @Override
    public void PreparePizza() {
        System.out.println("Preparing Chicken Pizza");
    }

    @Override
    public void BakePizza() {
        System.out.println("Baking Chicken Pizza");
    }

    @Override
    public void CutPizza() {
        System.out.println("Cutting Chicken Pizza");
    }
}
