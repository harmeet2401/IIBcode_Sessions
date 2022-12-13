package factorypattern;

public class PizzaStore {

    public Pizza OrderPizza(String type) {
        Pizza p = PizzaFactory.CreationPizza(type);

        /**
         * below is te object instantion/creation should be pushed to factory pattern
         * class . We will do that .
         */
       /* if (type.equalsIgnoreCase("veggie")) {
            p=new VeggiePizza();
        } else if (type.equalsIgnoreCase("chicken")){
            p=new ChickenPizza();
        }else if(type.equalsIgnoreCase("cheese")){
            p=new CheesePizza();
        }
        p.PreparePizza();
        p.BakePizza();
        p.CutPizza();*/

        return p;

    }

}
