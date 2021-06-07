package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SenderService {
    @Autowired
    ProducerService producerService;
    @Autowired
    OrderService orderService;

    @Scheduled(fixedRate = 3000)
    public void eachThreeSecondSender() {
        producerService.sendOrder(orderService.randomOrder());
    }
}
