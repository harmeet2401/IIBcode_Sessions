package abstractfactory;

public class FourWheeler_car implements VehicleDAO{

    @Override
    public void startVehicle() {
        System.out.println("--- car starts---");
    }
}
