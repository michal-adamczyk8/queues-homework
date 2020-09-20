package com.kodilla.jms.service;

import com.kodilla.jms.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void processService(Order order) {
        System.out.println("Receiving order with id: " + order.getId());
        System.out.println("Price: " + order.getPrice() * order.getQuantity());
    }
}
