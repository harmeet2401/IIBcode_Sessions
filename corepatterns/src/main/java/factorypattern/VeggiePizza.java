package factorypattern;

public class VeggiePizza implements Pizza{
    @Override
    public void PreparePizza() {
        System.out.println("Preparing Veggie Pizza");
    }

    @Override
    public void BakePizza() {
        System.out.println("Baking Veggie Pizza");
    }

    @Override
    public void CutPizza() {
        System.out.println("Cutting Veggie Pizza");
    }
}
