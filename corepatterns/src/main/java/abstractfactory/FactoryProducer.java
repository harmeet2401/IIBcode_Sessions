package abstractfactory;

public class FactoryProducer {
    public static VehicleAbstartctFactory produce(String type){
        VehicleAbstartctFactory vaf = null;
        if(type.equalsIgnoreCase("car")){
            vaf = new FourWheelerFactory();
        } else if (type.equalsIgnoreCase("bike")) {
            vaf = new TwoWheelerFactory();
        }
        return vaf;
    }
}
