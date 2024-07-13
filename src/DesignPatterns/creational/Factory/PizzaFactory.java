package DesignPatterns.creational.Factory;

public class PizzaFactory implements DishFactory{
    @Override
    public Dish deliverDish(){
        return new Pizza();
    }
}
