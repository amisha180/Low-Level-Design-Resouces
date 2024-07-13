package DesignPatterns.creational.Factory;

public class SushiFactory implements DishFactory{
    @Override
    public Dish deliverDish(){
       return new Sushi();
    }
}
