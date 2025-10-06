package com.bilalsahli.store;

import com.bilalsahli.store.Models.Dto.OrderCreateRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class HomeRestController {
    private final OrderService orderService;

    public HomeRestController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/pay")
    public String CreateOrder(@RequestBody OrderCreateRequest order) {
        orderService.createOrder(order);
        return "Order Created";
    }
}
