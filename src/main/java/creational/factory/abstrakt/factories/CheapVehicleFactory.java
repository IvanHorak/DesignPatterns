package creational.factory.abstrakt.factories;

import creational.factory.abstrakt.objects.Car;
import creational.factory.abstrakt.objects.Compact;
import creational.factory.abstrakt.objects.Motorcycle;
import creational.factory.abstrakt.objects.Scooter;

public class CheapVehicleFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new Compact();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new Scooter();
    }
}
