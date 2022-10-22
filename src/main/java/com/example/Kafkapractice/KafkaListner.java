package com.example.Kafkapractice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "Randika", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listner received"+ data);
    }
}
