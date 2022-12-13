package abstractfactory;

public class FourWheeler_bus implements VehicleDAO{

    @Override
    public void startVehicle() {
        System.out.println("--- bus starts---");
    }
}
