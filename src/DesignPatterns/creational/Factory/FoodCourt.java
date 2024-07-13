package DesignPatterns.creational.Factory;

public class FoodCourt {
    public static void main(String[] args) {
        DishFactory pizzafactory = new PizzaFactory();
        Dish p = pizzafactory.deliverDish();
        p.prepare();
        p.pickedup();
        p.delivered();

        System.out.println();

        DishFactory sushifactory = new SushiFactory();
        Dish s = sushifactory.deliverDish();
        s.prepare();
        s.pickedup();
        s.delivered();
    }
}
