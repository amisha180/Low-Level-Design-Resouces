package DesignPatterns.structural.Adapter;

public class StripePaymentImpl implements StripePayment {
    @Override
    public void makePayment(int amount){
        System.out.println("paying amount-"+ amount+" through stripe");
    }
}
