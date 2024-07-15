package DesignPatterns.creational.AbstractFactory;

public class clientVehicle {
    public static void main(String[] args) {
        AbstractFactory carfactory = FactoryProducer.getFactory("Car");
        Engine carengine = carfactory.deliverEngine();
        Vehicle car = carfactory.deliverVehicle();
        carengine.startEngine();
        car.drive();

        AbstractFactory bikefactory = FactoryProducer.getFactory("Bike");
        Engine bikengine = bikefactory.deliverEngine();
        Vehicle bike = bikefactory.deliverVehicle();
        bikengine.startEngine();
        bike.drive();

    }
}
