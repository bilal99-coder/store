package com.bilalsahli.store;

import com.bilalsahli.store.Models.Dto.OrderCreateRequest;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentServiceFactory factory;

    public OrderService(PaymentServiceFactory factory) {
        this.factory = factory;
    }

    public void createOrder(OrderCreateRequest order) {
        var payment = factory.get(order.paymentProvider());
        payment.processPayment();
        System.out.println("Creating Order with " + payment.Provider());
    }
}
