package abstractfactory;

/**
 * To allow the factory to be created we need a producer
 */
public abstract class VehicleAbstartctFactory {
    public abstract VehicleDAO getFactory(String type);
}
