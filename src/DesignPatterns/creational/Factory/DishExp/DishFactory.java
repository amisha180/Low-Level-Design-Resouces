package DesignPatterns.creational.Factory.DishExp;

public class DishFactory {
    public Dish getDish(String dish){
        if(dish.equalsIgnoreCase("Pizza")){
            return new Pizza();
        }
        else if(dish.equalsIgnoreCase("sushi")){
            return new Sushi();
        }
        return null;
    }
}
