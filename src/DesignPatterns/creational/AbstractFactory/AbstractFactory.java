package DesignPatterns.creational.AbstractFactory;

public class VehicleFactory {
    public Vehicles deliverVehicle(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        return null;
    }
}
