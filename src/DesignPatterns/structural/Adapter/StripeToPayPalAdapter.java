package DesignPatterns.structural.Adapter;

public class StripeToPayPalAdapter implements PayPalPayment{
    private StripePayment stripePayment;

    public StripeToPayPalAdapter(StripePayment stripePayment){
        this.stripePayment = stripePayment;
    }
    @Override
    public void pay(int amount){
        stripePayment.makePayment(7000);
    }
}
