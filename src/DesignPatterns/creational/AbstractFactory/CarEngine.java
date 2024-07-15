package DesignPatterns.creational.AbstractFactory;

public class CarEngine implements Engine {
    @Override
    public void startEngine(){
        System.out.println("Car Engine started");
    }
}
