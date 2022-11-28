package com.backend.desafio.services;

import com.backend.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {

        return order.getBasic() - order.withDiscount(order) + shippingService.shipment(order);
    }

}
