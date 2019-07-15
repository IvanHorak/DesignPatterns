package creational.factory.abstrakt;

import creational.factory.abstrakt.factories.CheapVehicleFactory;
import creational.factory.abstrakt.factories.ExpensiveVehicleFactory;
import creational.factory.abstrakt.factories.VehicleFactory;
import creational.factory.abstrakt.objects.Vehicle;

public class RunAbstractFactoryPattern {
    public static void main(String[] args) {
        VehicleFactory cheapFactory = new CheapVehicleFactory();
        VehicleFactory expensiveFactory = new ExpensiveVehicleFactory();

        Vehicle cheapCar = cheapFactory.createCar();
        System.out.println("cheapCar is a: " + cheapCar);

        Vehicle cheapMotorcycle = cheapFactory.createMotorcycle();
        System.out.println("cheapMotorcycle is a: " + cheapMotorcycle);

        Vehicle expensiveCar = expensiveFactory.createCar();
        System.out.println("expensiveCar is a: " + expensiveCar);

        Vehicle expensiveMotorcycle = expensiveFactory.createMotorcycle();
        System.out.println("expensiveMotorcycle is a: " + expensiveMotorcycle);


    }
}
