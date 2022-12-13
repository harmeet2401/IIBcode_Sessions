package abstractfactory;

public class FourWheelerFactory extends VehicleAbstartctFactory {

    @Override
    public VehicleDAO getFactory(String type) {
        VehicleDAO v = null;
        if(type.equalsIgnoreCase("car")){
            v = new FourWheeler_car();
        } else if (type.equalsIgnoreCase("bus")) {
            v = new FourWheeler_bus();
        }
        return v;
    }
}
