package com.backend.desafio.services;


import com.backend.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        if (order.getBasic() < 100.00) {
            return 20.0;
        }
        else if (order.getBasic() <= 200.00){
            return 12.0;
        }
        return 0.0;

    }
}
