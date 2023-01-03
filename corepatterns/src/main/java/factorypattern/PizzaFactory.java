package factorypattern;

/**
 * This class will act as a factory and will do the prepare , bake and cutting of the
 * pizza.
 * Means the objects creation for veggie , chicken and cheese pizza to prepaed on the type needed
 * by the order.
 */
public class PizzaFactory {
    public static Pizza CreationPizza(String type){
        Pizza p = null;
        if (type.equalsIgnoreCase("veggie")) {
            p=new VeggiePizza();
        } else if (type.equalsIgnoreCase("chicken")){
            p=new ChickenPizza();
        }else if(type.equalsIgnoreCase("cheese")){
            p=new CheesePizza();
        }
        p.PreparePizza();
        p.BakePizza();
        p.CutPizza();
        return p;
    }
}
