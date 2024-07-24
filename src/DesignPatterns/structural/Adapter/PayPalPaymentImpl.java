package DesignPatterns.structural.Adapter;

public class PayPalPaymentImpl implements PayPalPayment {
    @Override
    public void pay(int amount){
        System.out.println("paying amount- "+amount+" through paypal");
    }
}
