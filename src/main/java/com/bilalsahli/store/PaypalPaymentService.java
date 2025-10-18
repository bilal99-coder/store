package com.bilalsahli.store;

import org.springframework.stereotype.Service;

@Service
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
