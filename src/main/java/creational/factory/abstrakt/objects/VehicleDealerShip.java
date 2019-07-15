package creational.factory.abstrakt.objects;

import creational.factory.abstrakt.factories.CheapVehicleFactory;
import creational.factory.abstrakt.factories.ExpensiveVehicleFactory;
import creational.factory.abstrakt.factories.VehicleFactory;

public class VehicleDealerShip {

    public static void main(String[] args) {
        VehicleFactory expensiveVehicleFactory = new ExpensiveVehicleFactory();
        VehicleFactory cheapVehicleFactory = new CheapVehicleFactory();
        Vehicle compact = cheapVehicleFactory.createCar();
    }
}
