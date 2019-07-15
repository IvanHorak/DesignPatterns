package creational.factory.abstrakt.factories;

import creational.factory.abstrakt.objects.Car;
import creational.factory.abstrakt.objects.Motorcycle;
import creational.factory.abstrakt.objects.Sedan;
import creational.factory.abstrakt.objects.SportBike;

public class ExpensiveVehicleFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new SportBike();
    }
}
