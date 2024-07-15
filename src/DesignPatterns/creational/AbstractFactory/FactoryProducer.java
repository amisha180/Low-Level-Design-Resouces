package DesignPatterns.creational.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("Car")){
            return new CarFactory();
        }
        else if(type.equalsIgnoreCase("Bike")){
            return new BikeFactory();
        }
        return null;
    }
}
