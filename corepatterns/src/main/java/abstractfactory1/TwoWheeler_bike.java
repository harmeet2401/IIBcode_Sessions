package abstractfactory;

public class TwoWheeler_bike implements VehicleDAO{

    @Override
    public void startVehicle() {
        System.out.println("--- bike starts---");
    }
}
