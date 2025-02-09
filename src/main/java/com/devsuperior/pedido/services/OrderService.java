package com.devsuperior.pedido.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.pedido.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double shippingCost = shippingService.shipment(order);
        double discount = order.getBasic() * (order.getDiscount() / 100);
        return order.getBasic() - discount + shippingCost;
    }

}
