package abstractfactory;

public class TwoWheelerFactory extends VehicleAbstartctFactory {
    @Override
    public VehicleDAO getFactory(String type) {
        VehicleDAO v = null;
        if(type.equalsIgnoreCase("scooty")){
            v = new TwoWheeler_scooty();
        } else if (type.equalsIgnoreCase("bike")) {
            v = new TwoWheeler_bike();
        }
        return v;
    }
}
