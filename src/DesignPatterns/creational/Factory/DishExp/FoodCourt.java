package DesignPatterns.creational.Factory.DishExp;

public class FoodCourt {
    public static void main(String[] args) {
        DishFactory factory = new DishFactory();
        Dish pizza = factory.getDish("Pizza");
        pizza.prepare();
        pizza.pickedup();
        pizza.delivered();

        Dish sushi = factory.getDish("sushi");
        sushi.prepare();
        sushi.pickedup();
        sushi.delivered();

    }
}
