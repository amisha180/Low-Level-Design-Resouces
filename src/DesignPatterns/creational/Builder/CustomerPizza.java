package DesignPatterns.creational.Builder;

public class CustomerPizza {
    public static void main(String[] args) {
        Pizza.Builder builder = new Pizza.Builder("Large","Thin");
        Pizza myfavpizza = builder.addCheese(true).addpepperoni(true).addcapsicum(true).addolives(true).build();
        System.out.println(myfavpizza);

        PizzaDirector cook = new PizzaDirector();
        Pizza margherita  = cook.constructMargherita();
        System.out.println(margherita );

        Pizza Pepperoni  = cook.constructPepperoniPizza();
        System.out.println(Pepperoni );

        Pizza Veg  = cook.constructVegPizza();
        System.out.println(Veg );

        Pizza PeppyPaneer  = cook.constructPeppyPaneerPizza();
        System.out.println(PeppyPaneer );
    }
}
