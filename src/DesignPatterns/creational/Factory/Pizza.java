package DesignPatterns.creational.Factory;

public class Pizza implements Dish{

    @Override
    public void prepare(){
        System.out.println("Pizza is getting baked and prepared");
    }
    @Override
    public void pickedup(){
        System.out.println("Pizza is picked up by delivery partner");
    }
    @Override
    public void delivered(){
        System.out.println("Pizza is delivered");
    }
}
