package com.bilalsahli.store;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public String Provider(){
        return "Stripe";
    }
    @Override
    public String processPayment() {
        System.out.println("Stripe Payment");
        return "Stripe Payment";
    }
}
