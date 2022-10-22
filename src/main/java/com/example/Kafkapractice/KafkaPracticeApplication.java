package com.example.Kafkapractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPracticeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 10_000; i++) {
				kafkaTemplate.send("Randika", "hello kafka:)" + i);
			}
		};
	}
}
