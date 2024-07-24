package DesignPatterns.structural.Adapter;

public class mainAdapter {
    public static void main(String[] args) {
        PayPalPayment paypal = new PayPalPaymentImpl();
        paypal.pay(5000);

        StripePayment stripePayment = new StripePaymentImpl();
        PayPalPayment adapter = new StripeToPayPalAdapter(stripePayment);
        adapter.pay(7000);
    }
}
