package com.kodilla.jms;

import com.kodilla.jms.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessagingController {

    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping(path = "/process")
    public void processMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("queue-test", message);
        System.out.println("Message: " + message);
    }

    @PostMapping(path = "/order")
    public void processMessage(@RequestBody Order order) {
        jmsTemplate.convertAndSend("order-queue", order);
        System.out.println("Taking order with id: " + order.getId());
    }
}
