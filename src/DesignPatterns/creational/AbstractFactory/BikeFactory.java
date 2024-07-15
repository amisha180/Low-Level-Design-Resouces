package DesignPatterns.creational.AbstractFactory;

public class BikeFactory implements AbstractFactory{
    @Override
    public Vehicle deliverVehicle(){
        return new Bike();
    }
    @Override
    public Engine deliverEngine(){
        return new BikeEngine();
    }
}
