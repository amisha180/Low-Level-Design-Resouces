package DesignPatterns.creational.Builder;

public class Pizza {
    //mandatory params
    private String crust;
    private String size;

    //optional params
    private boolean cheese;
    private boolean pepperoni;
    private boolean paneer;
    private boolean olives;
    private boolean capsicum;
    private Pizza(Builder builder){
        this.size = builder.size;
        this.crust = builder.crust;
        this.capsicum = builder.capsicum;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
        this.paneer = builder.paneer;
        this.cheese = builder.cheese;

    }
    public String getCrust() {
        return crust;
    }
    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isPaneer() {
        return paneer;
    }

    public boolean isOlives() {
        return olives;
    }

    public boolean isCapsicum() {
        return capsicum;
    }
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", paneer=" +paneer+", olives="+olives+",capsicum="+capsicum+"]";
    }
public static class Builder{
    private String crust;
    private String size;

    //optional params
    private boolean cheese;
    private boolean pepperoni;
    private boolean paneer;
    private boolean olives;
    private boolean capsicum;
    public Builder(String size,String crust){
        this.size = size;
        this.crust = crust;
    }
    public Builder addCheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }
    public Builder addpepperoni(boolean pepperoni){
        this.pepperoni = pepperoni;
        return this;
    }
    public Builder addpaneer(boolean paneer){
        this.paneer = paneer;
        return this;
    }
    public Builder addolives(boolean olives){
        this.olives = olives;
        return this;
    }
    public Builder addcapsicum(boolean capsicum){
        this.capsicum = capsicum;
        return this;
    }
    // Method to build and return the final Pizza object
    public Pizza build(){
        return new Pizza(this);
    }
}

}


