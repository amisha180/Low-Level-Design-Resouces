package DesignPatterns.creational.Builder;

 class PizzaDirector {

     public Pizza constructMargherita() {
         return new Pizza.Builder("Large","Pan fresh").addCheese(true)
                 .build();
     }
    public Pizza constructPepperoniPizza() {
        return new Pizza.Builder("Large","Pan fresh").addCheese(true)
                .addpepperoni(true)
                .build();
    }
    public Pizza constructVegPizza() {
        return new Pizza.Builder("Large","Pan fresh").addCheese(true)
                .addcapsicum(true).addolives(true)
                .build();
    }
    public Pizza constructPeppyPaneerPizza() {
        return new Pizza.Builder("Large","Pan fresh").addpaneer(true)
                .build();
    }

}
