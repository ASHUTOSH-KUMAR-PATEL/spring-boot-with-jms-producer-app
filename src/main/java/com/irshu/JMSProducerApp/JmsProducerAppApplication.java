package com.irshu.JMSProducerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JmsProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsProducerAppApplication.class, args);
	}

}
