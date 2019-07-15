package creational.factory.abstrakt.factories;

import creational.factory.abstrakt.objects.Car;
import creational.factory.abstrakt.objects.Motorcycle;

public abstract class VehicleFactory {
    public abstract Car createCar();
    public abstract Motorcycle createMotorcycle();
}
