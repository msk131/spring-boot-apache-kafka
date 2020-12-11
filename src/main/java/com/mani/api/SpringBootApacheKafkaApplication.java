package com.mani.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@SpringBootApplication
public class SpringBootApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaApplication.class, args);
	}
	
	//User user = new User();
}
