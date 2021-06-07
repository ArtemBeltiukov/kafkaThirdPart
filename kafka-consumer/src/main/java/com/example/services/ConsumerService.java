package com.example.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final String TOPIC = "orders";

    @KafkaListener(topics = TOPIC, id = "groupId")
    public void listenKafka(ConsumerRecord<String, String> consumerRecord) {
        log.info("Receive {} from partition {}", consumerRecord.value(), consumerRecord.partition());
    }
}
