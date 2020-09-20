package com.kodilla.jms.receiver;

import com.kodilla.jms.domain.Order;
import com.kodilla.jms.service.OrderService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {

    private OrderService service;

    public OrderReceiver(OrderService orderService) {
        service = orderService;
    }

    @JmsListener(containerFactory = "jmsFactory", destination = "order-queue")
    public void receive(Order order) {
        System.out.println("Got the message. Calling orderService.");
        service.processService(order);
    }
}
