package DesignPatterns.creational.AbstractFactory;

public class CarFactory implements AbstractFactory{
    @Override
    public Vehicle deliverVehicle(){
        return new Car();
    }
    @Override
    public Engine deliverEngine(){
        return new CarEngine();
    }
}
