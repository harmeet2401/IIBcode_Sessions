package abstractfactory;

public class TestClass {
    public static void main(String[] args) {
        VehicleAbstartctFactory f = FactoryProducer.produce("bike");
        VehicleDAO v = f.getFactory("bike");
        v.startVehicle();
    }
}
