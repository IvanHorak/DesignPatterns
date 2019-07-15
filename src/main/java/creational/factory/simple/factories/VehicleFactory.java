package creational.factory.simple.factories;


import creational.factory.simple.objects.Car;
import creational.factory.simple.objects.Motorcycle;
import creational.factory.simple.objects.Vehicle;

public class VehicleFactory {
    public static Vehicle create(String type) {
        Vehicle v = null;
        if (type.equals("car")) {
            v = new Car();
        } else if (type.equals("motorcycle")) {
            v = new Motorcycle();
        }
        return v;
    }
}
