package com.example.services;

import com.example.entity.Order;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;
@Service
public class OrderService {

    public Order randomOrder() {
        return new Order("msg", ThreadLocalRandom.current().nextInt());
    }
}
