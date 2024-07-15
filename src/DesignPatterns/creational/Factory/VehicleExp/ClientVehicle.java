package DesignPatterns.creational.Factory.VehicleExp;

public class ClientVehicle {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicles Car = factory.deliverVehicle("Car");
        Car.drive();
        Vehicles Bike = factory.deliverVehicle("Bike");
        Bike.drive();
    }
}
