package DesignPatterns.creational.AbstractFactory;

public class BikeEngine implements Engine{
    @Override
    public void startEngine(){
        System.out.println("Bike Engine started");
    }
}
