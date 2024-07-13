package DesignPatterns.creational.Factory;

public class Sushi implements Dish{
    @Override
    public void prepare(){
        System.out.println("Sushi is getting boiled and prepared");
    }
    @Override
    public void pickedup(){
        System.out.println("Sushi is picked up by delivery partner");
    }
    @Override
    public void delivered(){
        System.out.println("Sushi is delivered");
    }
}
