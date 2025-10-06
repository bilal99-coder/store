package com.bilalsahli.store;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PaymentServiceFactory {
    private final Map<String, PaymentService> services;

    public PaymentServiceFactory(List<PaymentService> services) {
        this.services = services.stream().collect(Collectors
                .toMap(s -> s.Provider().toLowerCase(), s -> s));
    }
    public PaymentService get(String provider) {
        return services.get(provider.toLowerCase());
    }
}
