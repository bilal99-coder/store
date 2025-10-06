package com.bilalsahli.store;

public class PaypalPaymentService implements PaymentService {
    @Override
    public String Provider(){
        return "Paypal";
    }
    @Override
    public String processPayment() {
        System.out.println("Paypal payment made");
        return "Paypal Payment made";
    }
}
