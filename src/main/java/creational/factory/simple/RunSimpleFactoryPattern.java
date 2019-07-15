package creational.factory.simple;

import creational.factory.simple.factories.VehicleFactory;
import creational.factory.simple.objects.Vehicle;

public class RunSimpleFactoryPattern {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.create("car");
        System.out.println("Vehicle car is: " + car);

        Vehicle motorcycle = VehicleFactory.create("motorcycle");
        System.out.println("Vehicle motorcycle is: " + motorcycle);
    }
}
